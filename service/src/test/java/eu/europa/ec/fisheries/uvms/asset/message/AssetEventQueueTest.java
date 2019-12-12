/*
﻿Developed with the contribution of the European Commission - Directorate General for Maritime Affairs and Fisheries
© European Union, 2015-2016.
This file is part of the Integrated Fisheries Data Management (IFDM) Suite. The IFDM Suite is free software: you can
redistribute it and/or modify it under the terms of the GNU General Public License as published by the
Free Software Foundation, either version 3 of the License, or any later version. The IFDM Suite is distributed in
the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details. You should have received a
copy of the GNU General Public License along with the IFDM Suite. If not, see <http://www.gnu.org/licenses/>.
 */
package eu.europa.ec.fisheries.uvms.asset.message;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.jms.Message;

import org.jboss.arquillian.container.test.api.RunAsClient;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.runner.RunWith;
import eu.europa.ec.fisheries.uvms.asset.model.mapper.JAXBMarshaller;
import eu.europa.ec.fisheries.wsdl.asset.module.AssetModuleMethod;
import eu.europa.ec.fisheries.wsdl.asset.module.PingRequest;
import eu.europa.ec.fisheries.wsdl.asset.types.Asset;
import eu.europa.ec.fisheries.wsdl.asset.types.AssetIdType;
import eu.europa.ec.fisheries.wsdl.asset.types.AssetListCriteriaPair;
import eu.europa.ec.fisheries.wsdl.asset.types.AssetListQuery;
import eu.europa.ec.fisheries.wsdl.asset.types.CarrierSource;
import eu.europa.ec.fisheries.wsdl.asset.types.ConfigSearchField;
import eu.europa.ec.fisheries.uvms.tests.BuildAssetServiceDeployment;

@RunWith(Arquillian.class)
public class AssetEventQueueTest extends BuildAssetServiceDeployment {

    private JMSHelper jmsHelper = new JMSHelper();

    @Test
    @RunAsClient
    public void pingTest() throws Exception {
        PingRequest request = new PingRequest();
        request.setMethod(AssetModuleMethod.PING);
        String requestString = JAXBMarshaller.marshallJaxBObjectToString(request);
        String correlationId = jmsHelper.sendAssetMessage(requestString);
        Message response = jmsHelper.listenForResponse(correlationId);
        assertThat(response, is(notNullValue()));
    }
    
    @Test
    @RunAsClient
    public void getAssetByCFRTest() throws Exception {
        Asset asset = AssetTestHelper.createBasicAsset();
        jmsHelper.upsertAsset(asset);
        // TODO Find better solution, this is needed due to async jms call
        Thread.sleep(2000);
        Asset assetById = jmsHelper.getAssetById(asset.getCfr(), AssetIdType.CFR);
        
        assertThat(assetById, is(notNullValue()));
        assertThat(assetById.getCfr(), is(asset.getCfr()));
        assertThat(assetById.getName(), is(asset.getName()));
        assertThat(assetById.getExternalMarking(), is(asset.getExternalMarking()));
        assertThat(assetById.getIrcs(), is(asset.getIrcs()));
    }
    
    @Test
    @RunAsClient
    public void getAssetByIRCSTest() throws Exception {
        Asset asset = AssetTestHelper.createBasicAsset();
        jmsHelper.upsertAsset(asset);
        Thread.sleep(2000);
        Asset assetById = jmsHelper.getAssetById(asset.getIrcs(), AssetIdType.IRCS);

        assertThat(assetById, is(notNullValue()));
        assertThat(assetById.getCfr(), is(asset.getCfr()));
        assertThat(assetById.getName(), is(asset.getName()));
        assertThat(assetById.getExternalMarking(), is(asset.getExternalMarking()));
        assertThat(assetById.getIrcs(), is(asset.getIrcs()));

        assertEquals(AssetIdType.GUID, assetById.getAssetId().getType());
        assertEquals(assetById.getAssetId().getGuid(), assetById.getAssetId().getValue()); //since guid and value are supposed t obe the same
    }
    
    @Test
    @RunAsClient
    public void getAssetByMMSITest() throws Exception {
        Asset asset = AssetTestHelper.createBasicAsset();
        jmsHelper.upsertAsset(asset);
        Thread.sleep(2000);
        Asset assetById = jmsHelper.getAssetById(asset.getMmsiNo(), AssetIdType.MMSI);
        
        assertThat(assetById, is(notNullValue()));
        assertThat(assetById.getCfr(), is(asset.getCfr()));
        assertThat(assetById.getName(), is(asset.getName()));
        assertThat(assetById.getExternalMarking(), is(asset.getExternalMarking()));
        assertThat(assetById.getIrcs(), is(asset.getIrcs()));
    }

    @Test
    @RunAsClient
    public void getAssetListByQueryTest() throws Exception {
        Asset asset = AssetTestHelper.createBasicAsset();
        Asset upserted = jmsHelper.upsertAsset(asset);
        Thread.sleep(2000);

        AssetListQuery assetListQuery = AssetTestHelper.createBasicAssetQuery();
        AssetListCriteriaPair assetListCriteriaPair = new AssetListCriteriaPair();
        assetListCriteriaPair.setKey(ConfigSearchField.FLAG_STATE);
        assetListCriteriaPair.setValue(asset.getCountryCode());
        assetListQuery.getAssetSearchCriteria().getCriterias().add(assetListCriteriaPair);

        List<Asset> assets = jmsHelper.getAssetByAssetListQuery(assetListQuery);
        assertTrue(assets.stream().anyMatch(a -> upserted.getCfr().equals(a.getCfr())));
    }
    
    @Test
    @RunAsClient
    public void upsertAssetTest() throws Exception {
        Asset asset = AssetTestHelper.createBasicAsset();
        jmsHelper.upsertAsset(asset);
        Thread.sleep(2000);

        String newName = "Name upserted";
        asset.setName(newName);
        jmsHelper.upsertAsset(asset);
        Thread.sleep(2000);
        
        Asset assetById = jmsHelper.getAssetById(asset.getCfr(), AssetIdType.CFR);
        
        assertThat(assetById, is(notNullValue()));
        assertThat(assetById.getCfr(), is(asset.getCfr()));
        assertThat(assetById.getName(), is(newName));
        assertThat(assetById.getExternalMarking(), is(asset.getExternalMarking()));
        assertThat(assetById.getIrcs(), is(asset.getIrcs()));
    }
    
    @Test
    @RunAsClient
    public void assetSourceTest() throws Exception {
        Asset asset = AssetTestHelper.createBasicAsset();
        asset.setSource(CarrierSource.INTERNAL);
        jmsHelper.upsertAsset(asset);
        Thread.sleep(2000);
        
        Asset fetchedAsset = jmsHelper.getAssetById(asset.getCfr(), AssetIdType.CFR);
        assertThat(fetchedAsset.getSource(), is(asset.getSource()));
    }

    @Test
    @RunAsClient
    public void assetInformationTest1() throws Exception {
        Asset asset = AssetTestHelper.createBasicAsset();
        asset.setName(null);
        jmsHelper.upsertAsset(asset);
        Thread.sleep(2000);

        Asset assetById = jmsHelper.getAssetById(asset.getMmsiNo(), AssetIdType.MMSI);
        assertTrue(assetById.getName() == null);
        eu.europa.ec.fisheries.uvms.asset.domain.entity.Asset newAsset = new eu.europa.ec.fisheries.uvms.asset.domain.entity.Asset();
        newAsset.setMmsi(asset.getMmsiNo());
        newAsset.setName("namebyassetinfo");
        List<eu.europa.ec.fisheries.uvms.asset.domain.entity.Asset> assetList = new ArrayList<>();
        assetList.add(newAsset);
        jmsHelper.assetInfo(assetList);
        Thread.sleep(2000);
        assetById = jmsHelper.getAssetById(asset.getMmsiNo(), AssetIdType.MMSI);
        assertTrue(assetById.getName() != null);
        assertTrue(assetById.getName().equals("namebyassetinfo"));

    }

    @Test
    @RunAsClient
    public void assetInformationTest2() throws Exception {

        Asset assetWithsMMSI = AssetTestHelper.createBasicAsset();
        assetWithsMMSI.setIrcs(null);
        assetWithsMMSI.setName("ShouldNotBeThis");
        jmsHelper.upsertAsset(assetWithsMMSI);
        Thread.sleep(2000);


        Asset assetWithsIRCS = AssetTestHelper.createBasicAsset();
        assetWithsIRCS.setMmsiNo(null);
        assetWithsIRCS.setName("namnetestfall2");
        assetWithsIRCS.setSource(CarrierSource.NATIONAL);
        jmsHelper.upsertAsset(assetWithsIRCS);
        Thread.sleep(2000);


        eu.europa.ec.fisheries.uvms.asset.domain.entity.Asset newAsset = new eu.europa.ec.fisheries.uvms.asset.domain.entity.Asset();
        newAsset.setMmsi(assetWithsMMSI.getMmsiNo());
        newAsset.setIrcs(assetWithsIRCS.getIrcs());
        newAsset.setName("ShouldNotBeThis");
        List<eu.europa.ec.fisheries.uvms.asset.domain.entity.Asset> assetList = new ArrayList<>();
        assetList.add(newAsset);
        jmsHelper.assetInfo(assetList);
        Thread.sleep(2000);

        Asset fetchedAsset = jmsHelper.getAssetById(assetWithsMMSI.getMmsiNo(), AssetIdType.MMSI);
        assertTrue(fetchedAsset != null);
        assertTrue(fetchedAsset.getName() != null);
        assertTrue(fetchedAsset.getName(), fetchedAsset.getName().equals(assetWithsIRCS.getName()));
        assertTrue(fetchedAsset.getMmsiNo() != null);
        assertTrue(fetchedAsset.getIrcs() != null);
    }


    @Test
    @RunAsClient
    public void assetInformationTest3() throws Exception {


        Asset assetWithsIRCS = AssetTestHelper.createBasicAsset();
        assetWithsIRCS.setMmsiNo(null);
        assetWithsIRCS.setName(null);
        assetWithsIRCS.setSource(CarrierSource.NATIONAL);
        jmsHelper.upsertAsset(assetWithsIRCS);
        Thread.sleep(2000);

        // an ais with a "random" mmsi
        String mmsi = UUID.randomUUID().toString().substring(0,10);

        eu.europa.ec.fisheries.uvms.asset.domain.entity.Asset newAsset = new eu.europa.ec.fisheries.uvms.asset.domain.entity.Asset();
        newAsset.setMmsi(mmsi);
        newAsset.setName("namnetestfall3");
        List<eu.europa.ec.fisheries.uvms.asset.domain.entity.Asset> assetList = new ArrayList<>();
        assetList.add(newAsset);
        jmsHelper.assetInfo(assetList);
        Thread.sleep(2000);

        Asset fetchedAsset = jmsHelper.getAssetById(mmsi, AssetIdType.MMSI);
        assertTrue(fetchedAsset == null);

    }


    @Test
    @RunAsClient
    public void assetInformationTest4() throws Exception {


        Asset assetWithsIRCS = AssetTestHelper.createBasicAsset();
        assetWithsIRCS.setMmsiNo(null);
        assetWithsIRCS.setName("namnetestfall4");
        assetWithsIRCS.setSource(CarrierSource.NATIONAL);
        jmsHelper.upsertAsset(assetWithsIRCS);
        Thread.sleep(2000);

        eu.europa.ec.fisheries.uvms.asset.domain.entity.Asset newAsset = new eu.europa.ec.fisheries.uvms.asset.domain.entity.Asset();
        newAsset.setIrcs(assetWithsIRCS.getIrcs());
        newAsset.setName("ShouldNotBeThis");
        List<eu.europa.ec.fisheries.uvms.asset.domain.entity.Asset> assetList = new ArrayList<>();
        assetList.add(newAsset);
        jmsHelper.assetInfo(assetList);
        Thread.sleep(2000);

        Asset fetchedAsset = jmsHelper.getAssetById(assetWithsIRCS.getIrcs(), AssetIdType.IRCS);
        assertTrue(fetchedAsset != null);
        assertTrue(fetchedAsset.getName() != null);
        assertTrue(fetchedAsset.getName().equals(assetWithsIRCS.getName()));
        assertTrue(fetchedAsset.getIrcs() != null);
        assertTrue(fetchedAsset.getIrcs().equals(assetWithsIRCS.getIrcs()));

    }

    @Test
    @RunAsClient
    public void assetInformationTest5() throws Exception {


        Asset assetWithsMMSI = AssetTestHelper.createBasicAsset();
        assetWithsMMSI.setIrcs(null);
        assetWithsMMSI.setName(null);
        assetWithsMMSI.setSource(CarrierSource.NATIONAL);
        jmsHelper.upsertAsset(assetWithsMMSI);
        Thread.sleep(2000);

        // an ais with a "random" ircs
        String ircs = UUID.randomUUID().toString().substring(0,9);

        eu.europa.ec.fisheries.uvms.asset.domain.entity.Asset newAsset = new eu.europa.ec.fisheries.uvms.asset.domain.entity.Asset();
        newAsset.setIrcs(ircs);
        newAsset.setName("namnetestfall5");
        List<eu.europa.ec.fisheries.uvms.asset.domain.entity.Asset> assetList = new ArrayList<>();
        assetList.add(newAsset);
        jmsHelper.assetInfo(assetList);
        Thread.sleep(2000);

        Asset fetchedAsset = jmsHelper.getAssetById(ircs, AssetIdType.IRCS);
        assertTrue(fetchedAsset == null);

    }

    @Test
    @RunAsClient
    public void assetInformationTest6() throws Exception {


        Asset assetWithsMMSI = AssetTestHelper.createBasicAsset();
        assetWithsMMSI.setIrcs(null);
        assetWithsMMSI.setName(null);
        assetWithsMMSI.setSource(CarrierSource.NATIONAL);
        jmsHelper.upsertAsset(assetWithsMMSI);
        Thread.sleep(2000);


        eu.europa.ec.fisheries.uvms.asset.domain.entity.Asset newAsset = new eu.europa.ec.fisheries.uvms.asset.domain.entity.Asset();
        newAsset.setMmsi(assetWithsMMSI.getMmsiNo());
        newAsset.setName("namnetestfall6");
        List<eu.europa.ec.fisheries.uvms.asset.domain.entity.Asset> assetList = new ArrayList<>();
        assetList.add(newAsset);
        jmsHelper.assetInfo(assetList);
        Thread.sleep(2000);

        Asset fetchedAsset = jmsHelper.getAssetById(assetWithsMMSI.getMmsiNo(), AssetIdType.MMSI);
        assertTrue(fetchedAsset != null);
        assertTrue(fetchedAsset.getName() == null);
        assertTrue(fetchedAsset.getMmsiNo() != null);
        assertTrue(fetchedAsset.getMmsiNo().equals(assetWithsMMSI.getMmsiNo()));

    }

    @Test
    @RunAsClient
    public void assetInformationTest6XEUSource() throws Exception {


        Asset assetWithsMMSI = AssetTestHelper.createBasicAsset();
        assetWithsMMSI.setIrcs(null);
        assetWithsMMSI.setName(null);
        assetWithsMMSI.setSource(CarrierSource.XEU);
        jmsHelper.upsertAsset(assetWithsMMSI);
        Thread.sleep(2000);


        eu.europa.ec.fisheries.uvms.asset.domain.entity.Asset newAsset = new eu.europa.ec.fisheries.uvms.asset.domain.entity.Asset();
        newAsset.setMmsi(assetWithsMMSI.getMmsiNo());
        newAsset.setName("namnetestfall6");
        List<eu.europa.ec.fisheries.uvms.asset.domain.entity.Asset> assetList = new ArrayList<>();
        assetList.add(newAsset);
        jmsHelper.assetInfo(assetList);
        Thread.sleep(2000);

        Asset fetchedAsset = jmsHelper.getAssetById(assetWithsMMSI.getMmsiNo(), AssetIdType.MMSI);
        assertTrue(fetchedAsset != null);
        assertTrue(fetchedAsset.getName() != null);
        assertTrue(fetchedAsset.getName().equals(newAsset.getName()));
        assertTrue(fetchedAsset.getMmsiNo() != null);
        assertTrue(fetchedAsset.getMmsiNo().equals(assetWithsMMSI.getMmsiNo()));

    }

    @Test
    @RunAsClient
    public void assetInformationTest7() throws Exception {


        Asset assetWithsIRCS = AssetTestHelper.createBasicAsset();
        assetWithsIRCS.setMmsiNo(null);
        assetWithsIRCS.setName(null);
        assetWithsIRCS.setSource(CarrierSource.NATIONAL);
        jmsHelper.upsertAsset(assetWithsIRCS);
        Thread.sleep(2000);


        eu.europa.ec.fisheries.uvms.asset.domain.entity.Asset newAsset = new eu.europa.ec.fisheries.uvms.asset.domain.entity.Asset();
        newAsset.setIrcs(assetWithsIRCS.getIrcs());
        newAsset.setName("namnetestfall7");
        List<eu.europa.ec.fisheries.uvms.asset.domain.entity.Asset> assetList = new ArrayList<>();
        assetList.add(newAsset);
        jmsHelper.assetInfo(assetList);
        Thread.sleep(2000);

        Asset fetchedAsset = jmsHelper.getAssetById(assetWithsIRCS.getIrcs(), AssetIdType.IRCS);
        assertTrue(fetchedAsset != null);
        assertTrue(fetchedAsset.getName() == null);
        assertTrue(fetchedAsset.getIrcs() != null);
        assertTrue(fetchedAsset.getIrcs().equals(assetWithsIRCS.getIrcs()));

    }

    @Test
    @RunAsClient
    public void assetInformationTest7ThirdCountrySource() throws Exception {


        Asset assetWithsIRCS = AssetTestHelper.createBasicAsset();
        assetWithsIRCS.setMmsiNo(null);
        assetWithsIRCS.setName(null);
        assetWithsIRCS.setSource(CarrierSource.THIRD_COUNTRY);
        jmsHelper.upsertAsset(assetWithsIRCS);
        Thread.sleep(2000);


        eu.europa.ec.fisheries.uvms.asset.domain.entity.Asset newAsset = new eu.europa.ec.fisheries.uvms.asset.domain.entity.Asset();
        newAsset.setIrcs(assetWithsIRCS.getIrcs());
        newAsset.setName("namnetestfall7");
        List<eu.europa.ec.fisheries.uvms.asset.domain.entity.Asset> assetList = new ArrayList<>();
        assetList.add(newAsset);
        jmsHelper.assetInfo(assetList);
        Thread.sleep(2000);

        Asset fetchedAsset = jmsHelper.getAssetById(assetWithsIRCS.getIrcs(), AssetIdType.IRCS);
        assertTrue(fetchedAsset != null);
        assertTrue(fetchedAsset.getName() != null);
        assertTrue(fetchedAsset.getName().equals(newAsset.getName()));
        assertTrue(fetchedAsset.getIrcs() != null);
        assertTrue(fetchedAsset.getIrcs().equals(assetWithsIRCS.getIrcs()));

    }


    @Test
    @RunAsClient
    public void updateAssetWithEmptyStringIRCS() throws Exception {

        Asset asset = AssetTestHelper.createBasicAsset();
        asset.setIrcs("");
        asset.setName("updateAssetWithEmptyStringIRCS");
        jmsHelper.upsertAsset(asset);
        Thread.sleep(2000);

        eu.europa.ec.fisheries.uvms.asset.domain.entity.Asset newAsset = new eu.europa.ec.fisheries.uvms.asset.domain.entity.Asset();

        newAsset.setMmsi(AssetTestHelper.getRandomIntegers(9));
        newAsset.setIrcs(asset.getIrcs());
        newAsset.setName("shouldNotBeThis");
        List<eu.europa.ec.fisheries.uvms.asset.domain.entity.Asset> assetList = new ArrayList<>();
        assetList.add(newAsset);
        jmsHelper.assetInfo(assetList);
        Thread.sleep(2000);

        Asset fetchedAsset = jmsHelper.getAssetById(asset.getMmsiNo(), AssetIdType.MMSI);
        assertTrue(fetchedAsset != null);
        assertTrue(fetchedAsset.getName() != null);
        assertTrue(fetchedAsset.getName(), fetchedAsset.getName().equals(asset.getName()));
        assertTrue(fetchedAsset.getMmsiNo() != null);
        assertTrue(fetchedAsset.getIrcs() == null);
    }


    @Test
    @RunAsClient
    public void createSeveralAssetsWithEmptyStringIRCSAndUpdateOneOfThemTest() throws Exception {

        Asset asset = AssetTestHelper.createBasicAsset();
        asset.setIrcs("");
        asset.setName("createAssetWithEmptyStringIRCS");
        jmsHelper.upsertAsset(asset);

        Asset asset2 = AssetTestHelper.createBasicAsset();
        asset2.setIrcs("");
        asset2.setName("createAssetWithEmptyStringIRCS2");
        jmsHelper.upsertAsset(asset2);
        Thread.sleep(2000);

        eu.europa.ec.fisheries.uvms.asset.domain.entity.Asset newAsset = new eu.europa.ec.fisheries.uvms.asset.domain.entity.Asset();

        newAsset.setMmsi(asset2.getMmsiNo());
        newAsset.setIrcs(asset2.getIrcs());
        newAsset.setName("createAssetWithEmptyStringIRCS2NewName");
        List<eu.europa.ec.fisheries.uvms.asset.domain.entity.Asset> assetList = new ArrayList<>();
        assetList.add(newAsset);
        jmsHelper.assetInfo(assetList);
        Thread.sleep(2000);

        Asset fetchedAssetNotUpdated = jmsHelper.getAssetById(asset.getMmsiNo(), AssetIdType.MMSI);
        assertTrue(fetchedAssetNotUpdated != null);
        assertTrue(fetchedAssetNotUpdated.getName() != null);
        assertTrue(fetchedAssetNotUpdated.getName(), fetchedAssetNotUpdated.getName().equals(asset.getName()));
        assertTrue(fetchedAssetNotUpdated.getMmsiNo() != null);
        assertTrue(fetchedAssetNotUpdated.getIrcs() == null);

        Asset fetchedAssetUpdated = jmsHelper.getAssetById(asset2.getMmsiNo(), AssetIdType.MMSI);
        assertTrue(fetchedAssetUpdated != null);
        assertTrue(fetchedAssetUpdated.getName() != null);
        assertTrue(fetchedAssetUpdated.getName(), fetchedAssetUpdated.getName().equals(newAsset.getName()));
        assertTrue(fetchedAssetUpdated.getMmsiNo() != null);
        assertTrue(fetchedAssetUpdated.getIrcs() == null);
    }











}
