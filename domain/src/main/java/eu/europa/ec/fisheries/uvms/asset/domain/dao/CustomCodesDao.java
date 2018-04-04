package eu.europa.ec.fisheries.uvms.asset.domain.dao;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.*;
import eu.europa.ec.fisheries.uvms.asset.domain.entity.CustomCodes;
import eu.europa.ec.fisheries.uvms.asset.domain.entity.CustomCodesPK;
import java.util.List;

@Stateless
public class CustomCodesDao {

    @PersistenceContext
    private EntityManager em;

    public CustomCodes create(CustomCodes record) {

        // NO DUPLICATES on constant AND code ALLOWED
        CustomCodes fetched = get(record.getPrimaryKey());
        if (fetched != null) return record;
        if(record.getDescription() == null){
            record.setDescription("");
        }
        if(record.getJsonstr() == null){
            record.setJsonstr("");
        }

        em.persist(record);
        return record;
    }


    public CustomCodes get(CustomCodesPK primaryKey) {
        try {
            CustomCodes customCodes = em.find(CustomCodes.class, primaryKey);
            return customCodes;
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

    public CustomCodes update(CustomCodesPK primaryKey, String newDescription, String newJson) {

        CustomCodes fetchedMDR_lite = get(primaryKey);
        if (fetchedMDR_lite != null) {
            if(newDescription != null) {
                fetchedMDR_lite.setDescription(newDescription);
            }
            if(newJson != null) {
                fetchedMDR_lite.setJsonstr(newJson);
            }
        }
        return fetchedMDR_lite;
    }


    public void delete(CustomCodesPK primaryKey) {

        CustomCodes record = get(primaryKey);
        if (record != null) {
            em.remove(record);
        }
    }


    public Boolean exists(CustomCodesPK primaryKey) {

        return get(primaryKey) != null;
    }

    public List<CustomCodes> getAllFor(String constant) {
        try {
            TypedQuery<CustomCodes> query = em.createNamedQuery(CustomCodes.CUSTOMCODES_GETALLFOR, CustomCodes.class);
            query.setParameter("constant", constant);
            return query.getResultList();
        } catch (NoResultException e) {
            return null;
        }
    }


    public void deleteAllFor(String constant) {

        Query query = em.createQuery("DELETE FROM CustomCodes m where  m.primaryKey.constant=:constant");
        query.setParameter("constant", constant);
        query.executeUpdate();


    }

    public List<String> getAllConstants() {
        try {
            TypedQuery<String> query = em.createNamedQuery(CustomCodes.CUSTOMCODES_GETALLCONSTANTS, String.class);
            return query.getResultList();
        } catch (NoResultException e) {
            return null;
        }
    }



}