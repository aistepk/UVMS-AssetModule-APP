package eu.europa.ec.fisheries.uvms.tests.mobileterminal.service.arquillian;

import eu.europa.ec.fisheries.uvms.mobileterminal.dao.MobileTerminalPluginDaoBean;
import eu.europa.ec.fisheries.uvms.mobileterminal.dao.PollProgramDaoBean;
import eu.europa.ec.fisheries.uvms.mobileterminal.dao.TerminalDaoBean;
import eu.europa.ec.fisheries.uvms.mobileterminal.entity.MobileTerminal;
import eu.europa.ec.fisheries.uvms.mobileterminal.entity.MobileTerminalPlugin;
import eu.europa.ec.fisheries.uvms.mobileterminal.entity.PollBase;
import eu.europa.ec.fisheries.uvms.mobileterminal.entity.PollProgram;
import eu.europa.ec.fisheries.uvms.mobileterminal.entity.types.MobileTerminalTypeEnum;
import eu.europa.ec.fisheries.uvms.mobileterminal.entity.types.PollStateEnum;
import eu.europa.ec.fisheries.uvms.mobileterminal.entity.types.TerminalSourceEnum;
import eu.europa.ec.fisheries.uvms.tests.TransactionalTests;
import org.jboss.arquillian.container.test.api.OperateOnDeployment;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

import javax.ejb.EJB;
import javax.validation.ConstraintViolationException;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.*;

import static org.junit.Assert.*;

/**
 * Created by thofan on 2017-05-02.
 */

@RunWith(Arquillian.class)
public class PollProgramDaoBeanIT extends TransactionalTests {

    private Calendar cal = Calendar.getInstance();

    private int startYear = 1999;
    private int latestRunYear = 2017;

    private Random rnd = new Random();

    @EJB
    private PollProgramDaoBean pollProgramDao;

    @EJB
    private TerminalDaoBean terminalDaoBean;

    @EJB
    private MobileTerminalPluginDaoBean testDaoBean;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    @OperateOnDeployment("normal")
    public void createPollProgram() {

        OffsetDateTime startDate = getStartDate();
        OffsetDateTime latestRun = getLatestRunDate();
        OffsetDateTime stopDate = getStopDate();

        String mobileTerminalSerialNumber = createSerialNumber();
        PollProgram pollProgram = createPollProgramHelper(mobileTerminalSerialNumber, startDate, stopDate, latestRun);

        pollProgramDao.createPollProgram(pollProgram);
        assertNotNull(pollProgram.getId());
    }

    @Test
    @OperateOnDeployment("normal")
    public void getPollProgramByGuid() {
        OffsetDateTime startDate = getStartDate();
        OffsetDateTime latestRun = getLatestRunDate();
        OffsetDateTime stopDate = getStopDate();

        String mobileTerminalSerialNumber = createSerialNumber();
        PollProgram pollProgram = createPollProgramHelper(mobileTerminalSerialNumber, startDate, stopDate, latestRun);

        pollProgramDao.createPollProgram(pollProgram);
        UUID guid = pollProgram.getId();
        PollProgram fetchedPollProgram = pollProgramDao.getPollProgramById(guid);

        assertEquals(guid, fetchedPollProgram.getId());
    }

    @Test
    @OperateOnDeployment("normal")
    public void createPollProgram_updateUserConstraintViolation() {
        thrown.expect(ConstraintViolationException.class);

        OffsetDateTime startDate = getStartDate();
        OffsetDateTime latestRun = getLatestRunDate();
        OffsetDateTime stopDate = getStopDate();

        String mobileTerminalSerialNumber = createSerialNumber();
        PollProgram pollProgram = createPollProgramHelper(mobileTerminalSerialNumber, startDate, stopDate, latestRun);
        char[] updatedBy = new char[61];
        Arrays.fill(updatedBy, 'x');
        pollProgram.setUpdatedBy(new String(updatedBy));

        pollProgramDao.createPollProgram(pollProgram);
        em.flush();
    }

    @Test
    @OperateOnDeployment("normal")
    public void createPollProgram_withNullWillFail() {
        try {
            pollProgramDao.createPollProgram(null);
            Assert.fail();
        }catch(RuntimeException e){
            Assert.assertTrue(true);
        }
    }

    @Test
    @OperateOnDeployment("normal")
    public void updatePollProgram() {

        OffsetDateTime startDate = getStartDate();
        OffsetDateTime latestRun = getLatestRunDate();
        OffsetDateTime stopDate = getStopDate();

        String mobileTerminalSerialNumber = createSerialNumber();
        PollProgram pollProgram = createPollProgramHelper(mobileTerminalSerialNumber, startDate, stopDate, latestRun);

        pollProgramDao.createPollProgram(pollProgram);
        em.flush();

        pollProgram.setUpdatedBy("update");
        pollProgramDao.updatePollProgram(pollProgram);
        em.flush();

        PollProgram fetchedPollProgram = pollProgramDao.getPollProgramById(pollProgram.getId());

        assertNotNull(fetchedPollProgram.getId());
        assertEquals("update", fetchedPollProgram.getUpdatedBy());
    }

    @Test
    @OperateOnDeployment("normal")
    public void updatePollProgram_WithNonePersistedEntityWillFail()  {

        OffsetDateTime startDate = getStartDate();
        OffsetDateTime latestRun = getLatestRunDate();
        OffsetDateTime stopDate = getStopDate();

        String mobileTerminalSerialNumber = createSerialNumber();
        PollProgram pollProgram = createPollProgramHelper(mobileTerminalSerialNumber, startDate, stopDate, latestRun);

        pollProgramDao.updatePollProgram(pollProgram);
        em.flush();
    }

    @Test
    @OperateOnDeployment("normal")
    public void getProgramPollsAlive() {

        OffsetDateTime startDate = getStartDate();
        OffsetDateTime latestRun = getLatestRunDate();
        OffsetDateTime stopDate = getStopDate();

        String mobileTerminalSerialNumber = createSerialNumber();
        PollProgram pollProgram = createPollProgramHelper(mobileTerminalSerialNumber, startDate, stopDate, latestRun);

        pollProgramDao.createPollProgram(pollProgram);
        em.flush();
        List<PollProgram> pollsAlive = pollProgramDao.getProgramPollsAlive();

        boolean found = pollsAlive.stream().anyMatch(pp -> pollProgram.getId().equals(pp.getId()));

        assertTrue(found);
    }

    @Test
    @OperateOnDeployment("normal")
    public void getProgramPollsAlive_ShouldFailWithCurrentDateBiggerThenStopDate() {

        OffsetDateTime startDate = getStartDate();
        OffsetDateTime latestRun = getLatestRunDate();

        cal.set(Calendar.DAY_OF_MONTH, 28);
        cal.set(Calendar.YEAR, startYear - 1);
        OffsetDateTime stopDate = OffsetDateTime.now(ZoneOffset.UTC);


        String mobileTerminalSerialNumber = createSerialNumber();
        PollProgram pollProgram = createPollProgramHelper(mobileTerminalSerialNumber, startDate, stopDate, latestRun);

        pollProgramDao.createPollProgram(pollProgram);
        em.flush();
        List<PollProgram> pollsAlive = pollProgramDao.getProgramPollsAlive();

        boolean found = pollsAlive.stream().anyMatch(pp -> pollProgram.getId().equals(pp.getId()));

        assertFalse(found);
    }

    @Test
    @OperateOnDeployment("normal")
    public void getProgramPollsAlive_ShouldFailWithPollStateArchived() {

        OffsetDateTime startDate = getStartDate();
        OffsetDateTime latestRun = getLatestRunDate();
        OffsetDateTime stopDate = getStopDate();

        String mobileTerminalSerialNumber = createSerialNumber();
        PollProgram pollProgram = createPollProgramHelper(mobileTerminalSerialNumber, startDate, stopDate, latestRun);
        pollProgram.setPollState(PollStateEnum.ARCHIVED);

        pollProgramDao.createPollProgram(pollProgram);
        em.flush();
        List<PollProgram> pollsAlive = pollProgramDao.getProgramPollsAlive();

        boolean found = pollsAlive.stream().anyMatch(pp -> pollProgram.getId().equals(pp.getId()));

        assertFalse(found);
    }

    @Test
    @OperateOnDeployment("normal")
    public void getPollProgramRunningAndStarted() {

        OffsetDateTime startDate = getStartDate();
        OffsetDateTime latestRun = getLatestRunDate();
        OffsetDateTime stopDate = getStopDate();

        String mobileTerminalSerialNumber = createSerialNumber();
        PollProgram pollProgram = createPollProgramHelper(mobileTerminalSerialNumber, startDate, stopDate, latestRun);

        pollProgramDao.createPollProgram(pollProgram);
        em.flush();

        List<PollProgram> pollPrograms = pollProgramDao.getPollProgramRunningAndStarted();
        boolean found = pollPrograms.stream().anyMatch(pp -> pollProgram.getId().equals(pp.getId()));

        assertTrue(found);
    }

    @Test
    @OperateOnDeployment("normal")
    public void getPollProgramRunningAndStarted_ShouldFailWhenLatestRunBiggerThenNow() {

        Date now = new Date();
        cal.setTime(now);

        OffsetDateTime startDate = getStartDate();

        cal.set(Calendar.DAY_OF_MONTH, 20);
        cal.set(Calendar.YEAR, latestRunYear + 3);
        OffsetDateTime latestRun = OffsetDateTime.now(ZoneOffset.UTC);

        OffsetDateTime stopDate = getStopDate();

        String mobileTerminalSerialNumber = createSerialNumber();
        PollProgram pollProgram = createPollProgramHelper(mobileTerminalSerialNumber, startDate, stopDate, latestRun);

        pollProgramDao.createPollProgram(pollProgram);
        em.flush();

        List<PollProgram> pollPrograms = pollProgramDao.getPollProgramRunningAndStarted();

        assertTrue(pollPrograms.isEmpty());
    }

    @Test
    @OperateOnDeployment("normal")
    public void getPollProgramRunningAndStarted_ShouldFailWhenStartDateBiggerThenNow() {

        cal.setTime(new Date(System.currentTimeMillis()));

        cal.set(Calendar.DAY_OF_MONTH, 1);
        cal.set(Calendar.YEAR, cal.get(Calendar.YEAR) + 1);
        OffsetDateTime startDate = OffsetDateTime.now(ZoneOffset.UTC).plusYears(1);  //starting the poll one year in the future should mean that it is not running now

        OffsetDateTime latestRun = getLatestRunDate();
        OffsetDateTime stopDate = getStopDate();

        String mobileTerminalSerialNumber = createSerialNumber();
        PollProgram pollProgram = createPollProgramHelper(mobileTerminalSerialNumber, startDate, stopDate, latestRun);

        pollProgramDao.createPollProgram(pollProgram);
        em.flush();

        List<PollProgram> pollPrograms = pollProgramDao.getPollProgramRunningAndStarted();

        boolean found = pollPrograms.stream().anyMatch(pp -> pollProgram.getId().equals(pp.getId()));

        assertFalse(found);
        assertTrue(pollPrograms.isEmpty());
    }

    @Test
    @OperateOnDeployment("normal")
    public void getPollProgramRunningAndStarted_ShouldFailWhenPollStateIsNotStarted() {

        cal.setTime(new Date(System.currentTimeMillis()));

        OffsetDateTime startDate = getStartDate();
        OffsetDateTime latestRun = getLatestRunDate();
        OffsetDateTime stopDate = getStopDate();

        String mobileTerminalSerialNumber = createSerialNumber();
        PollProgram pollProgram = createPollProgramHelper(mobileTerminalSerialNumber, startDate, stopDate, latestRun);
        pollProgram.setPollState(PollStateEnum.STOPPED);

        pollProgramDao.createPollProgram(pollProgram);
        em.flush();

        List<PollProgram> pollPrograms = pollProgramDao.getPollProgramRunningAndStarted();

        boolean found = pollPrograms.stream().anyMatch(pp -> pollProgram.getId().equals(pp.getId()));

        assertFalse(found);
        assertTrue(pollPrograms.isEmpty());
    }

    @Test
    @OperateOnDeployment("normal")
    public void getPollProgramByGuid_ShouldFailWithInvalidGuid() {

        OffsetDateTime startDate = getStartDate();
        OffsetDateTime latestRun = getLatestRunDate();
        OffsetDateTime stopDate = getStopDate();

        String mobileTerminalSerialNumber = createSerialNumber();
        PollProgram pollProgram = createPollProgramHelper(mobileTerminalSerialNumber, startDate, stopDate, latestRun);

        pollProgramDao.createPollProgram(pollProgram);
        PollProgram fetchedPollProgram = pollProgramDao.getPollProgramById(UUID.randomUUID());

        assertNull(fetchedPollProgram);
    }

    private PollProgram createPollProgramHelper(String mobileTerminalSerialNo, OffsetDateTime startDate,
                                                OffsetDateTime stopDate, OffsetDateTime latestRun) {

        PollProgram pp = new PollProgram();
        MobileTerminal mobileTerminal = createMobileTerminalHelper(mobileTerminalSerialNo);

        PollBase pb = new PollBase();
        String terminalConnect = UUID.randomUUID().toString();
        pb.setChannelId(UUID.randomUUID());
        pb.setMobileterminal(mobileTerminal);
        pb.setTerminalConnect(terminalConnect);
        pp.setFrequency(1);
        pp.setLatestRun(latestRun);
        pp.setPollBase(pb);
        pp.setPollState(PollStateEnum.STARTED);
        pp.setStartDate(startDate);
        pp.setStopDate(stopDate);
        pp.setUpdateTime(latestRun);
        pp.setUpdatedBy("TEST");

        return pp;
    }

    private MobileTerminal createMobileTerminalHelper(String serialNo) {

        MobileTerminal mt = new MobileTerminal();
        MobileTerminalPlugin mtp;
        List<MobileTerminalPlugin> plugs = testDaoBean.getPluginList();
        mtp = plugs.get(0);
        mt.setSerialNo(serialNo);
        mt.setUpdatetime(OffsetDateTime.now(ZoneOffset.UTC));
        mt.setUpdateuser("TEST");
        mt.setSource(TerminalSourceEnum.INTERNAL);
        mt.setPlugin(mtp);
        mt.setMobileTerminalType(MobileTerminalTypeEnum.INMARSAT_C);
        mt.setArchived(false);
        mt.setActive(true);

        MobileTerminal mobileTerminal = terminalDaoBean.createMobileTerminal(mt);
        if (mobileTerminal != null) return mobileTerminal;
        else return null;
    }

    // we want to be able to tamper with the dates for proper test coverage
    private OffsetDateTime getStartDate() {
        cal.set(Calendar.DAY_OF_MONTH, 1);
        cal.set(Calendar.YEAR, startYear);
        return OffsetDateTime.ofInstant(cal.toInstant(), ZoneOffset.UTC);
    }

    private OffsetDateTime getLatestRunDate() {
        cal.set(Calendar.DAY_OF_MONTH, 20);
        cal.set(Calendar.YEAR, latestRunYear);
        return OffsetDateTime.ofInstant(cal.toInstant(), ZoneOffset.UTC);
    }

    private OffsetDateTime getStopDate() {
        cal.set(Calendar.DAY_OF_MONTH, 28);
        cal.set(Calendar.YEAR, 2059);
        return OffsetDateTime.ofInstant(cal.toInstant(), ZoneOffset.UTC);
    }

    private String createSerialNumber() {
        return "SNU" + rnd.nextInt();
    }
}