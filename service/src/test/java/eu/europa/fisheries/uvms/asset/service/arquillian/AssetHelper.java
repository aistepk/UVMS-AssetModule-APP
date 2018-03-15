package eu.europa.fisheries.uvms.asset.service.arquillian;

import eu.europa.ec.fisheries.uvms.asset.types.AssetListCriteria;
import eu.europa.ec.fisheries.uvms.asset.types.AssetListCriteriaPair;
import eu.europa.ec.fisheries.uvms.asset.types.AssetListPagination;
import eu.europa.ec.fisheries.uvms.asset.types.AssetListQuery;
import eu.europa.ec.fisheries.uvms.constant.UnitTonnage;
import eu.europa.ec.fisheries.uvms.entity.asset.types.*;
import eu.europa.ec.fisheries.uvms.entity.model.AssetProdOrg;
import eu.europa.ec.fisheries.uvms.entity.model.AssetSE;
import eu.europa.ec.fisheries.uvms.entity.model.ContactInfo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public abstract class AssetHelper {

    private static Random rnd = new Random();

    public static AssetSE createBasicAsset() {
        AssetSE assetEntity = new AssetSE();

        assetEntity.setName("Test asset");
        assetEntity.setActive(true);
        assetEntity.setExternalMarking("EXT123");
        assetEntity.setFlagStateCode("SWE");

        assetEntity.setCommissionDate(LocalDateTime.now(ZoneOffset.UTC));
        assetEntity.setCfr("CRF" + getRandomIntegers(9));
        assetEntity.setIrcs("F" + getRandomIntegers(7));
        assetEntity.setImo(getRandomIntegers(7));
        assetEntity.setMmsi("MMSI" + getRandomIntegers(5));
        assetEntity.setIccat("ICCAT" + getRandomIntegers(20));
        assetEntity.setUvi("UVI" + getRandomIntegers(20));
        assetEntity.setGfcm("GFCM" + getRandomIntegers(20));

        assetEntity.setGrossTonnage(BigDecimal.TEN);
        assetEntity.setPowerOfMainEngine(BigDecimal.TEN);

        assetEntity.setOwnerName("Foo Bar");
        assetEntity.setOwnerAddress("Hacker st. 1337");

        assetEntity.setProdOrgCode("ORGCODE");
        assetEntity.setProdOrgName("ORGNAME");

        return assetEntity;
    }




    public static AssetSE createBiggerAsset() {

        AssetSE assetEntity = new AssetSE();
        LocalDateTime  now =  LocalDateTime.now(ZoneOffset.UTC);


        assetEntity.setName("Test asset");
        assetEntity.setActive(true);
        assetEntity.setExternalMarking("EXT123");
        assetEntity.setFlagStateCode("SWE");

        assetEntity.setCommissionDate(LocalDateTime.now(ZoneOffset.UTC));
        assetEntity.setCfr("CRF" + getRandomIntegers(9));
        assetEntity.setIrcs("F" + getRandomIntegers(7));
        assetEntity.setImo(getRandomIntegers(7));
        assetEntity.setMmsi("MMSI" + getRandomIntegers(5));
        assetEntity.setIccat("ICCAT" + getRandomIntegers(20));
        assetEntity.setUvi("UVI" + getRandomIntegers(20));
        assetEntity.setGfcm("GFCM" + getRandomIntegers(20));

        assetEntity.setGrossTonnage(BigDecimal.TEN);
        assetEntity.setPowerOfMainEngine(BigDecimal.TEN);

        assetEntity.setOwnerName("Foo Bar");
        assetEntity.setOwnerAddress("Hacker st. 1337");

        assetEntity.setProdOrgCode("ORGCODE");
        assetEntity.setProdOrgName("ORGNAME");
        assetEntity.setGrossTonnageUnit(UnitTonnage.LONDON);
        assetEntity.setLicenceType(GearFishingTypeEnum.DEMERSAL_AND_PELAGIC.toString());
        assetEntity.setSegment(3L);
        assetEntity.setConstructionYear("1914");
        assetEntity.setConstructionPlace("GBG");

        assetEntity.setHullMaterial(HullMaterialEnum.GLAS_PLASTIC_FIBER);
        assetEntity.setUpdateTime(now);
        assetEntity.setUpdatedBy("TEST");
        assetEntity.setAssetAgentAddress("assetagentadress_" + rnd.nextInt());
        assetEntity.setCountryOfImportOrExport("SWE");
        assetEntity.setAdministrativeDecisionDate(now);
        assetEntity.setSegmentOfAdministrativeDecision(3L);
        assetEntity.setLengthBetweenPerpendiculars(new BigDecimal(17));
        AssetProdOrg assetProdOrg = new AssetProdOrg();
        assetProdOrg.setAddress("prodorgaddress");
        assetProdOrg.setCity("prodorgcity");
        assetProdOrg.setCode("prodorgcode");
        assetProdOrg.setFax("fax");
        assetProdOrg.setName("prodorg name");
        assetProdOrg.setPhone("0091-1-123-456");
        assetProdOrg.setMobile("004631112233");
        assetProdOrg.setZipCode(41523);
        assetEntity.setHasLicence(true);
        assetEntity.setLicenceType("AllFish");
        assetEntity.setLengthOverAll(new BigDecimal(25));
        assetEntity.setPortOfRegistration("GBG");
        assetEntity.setPowerOfAuxEngine(new BigDecimal(1000));
        assetEntity.setPublicAid(PublicAidEnum.EG);
        String regnbr = "THOFAN" + rnd.nextInt();
        if (regnbr.length() > 14) regnbr = regnbr.substring(0, 14);
        assetEntity.setRegistrationNumber(regnbr);

        assetEntity.setSafteyGrossTonnage(new BigDecimal(24000));
        assetEntity.setOtherTonnage(new BigDecimal(23000));
        assetEntity.setTypeOfExport(TypeOfExportEnum.SM);
        assetEntity.setHasVms(false);
        assetEntity.setAgentIsAlsoOwner(true);
        assetEntity.setEventCodeId(rnd.nextLong());
        assetEntity.setIrcsIndicator("I");
        assetEntity.setSource(eu.europa.ec.fisheries.uvms.entity.asset.types.CarrierSourceEnum.INTERNAL);




        List<ContactInfo> contacts = new ArrayList<>();
        ContactInfo ci = new ContactInfo();
        ci.setSource(ContactInfoSourceEnum.INTERNAL);
        contacts.add(ci);



        return assetEntity;
    }


    public static String getRandomIntegers(int length) {
        return new Random()
                .ints(0,9)
                .mapToObj(i -> String.valueOf(i))
                .limit(length)
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
    }

    public static AssetListQuery createBasicQuery() {
        AssetListQuery query = new AssetListQuery();
        query.setPagination(new AssetListPagination(1, 100));
        AssetListCriteria listCriteria = new AssetListCriteria();
        listCriteria.setIsDynamic(true);
        query.setAssetSearchCriteria(listCriteria);
        return query;
    }

}
