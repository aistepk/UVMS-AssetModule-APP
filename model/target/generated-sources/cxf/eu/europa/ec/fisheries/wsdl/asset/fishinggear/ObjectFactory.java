
package eu.europa.ec.fisheries.wsdl.asset.fishinggear;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.europa.ec.fisheries.wsdl.asset.fishinggear package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.europa.ec.fisheries.wsdl.asset.fishinggear
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FishingGearListRequest }
     * 
     */
    public FishingGearListRequest createFishingGearListRequest() {
        return new FishingGearListRequest();
    }

    /**
     * Create an instance of {@link FishingGearByIdRequest }
     * 
     */
    public FishingGearByIdRequest createFishingGearByIdRequest() {
        return new FishingGearByIdRequest();
    }

    /**
     * Create an instance of {@link FishingGearByExternalIdRequest }
     * 
     */
    public FishingGearByExternalIdRequest createFishingGearByExternalIdRequest() {
        return new FishingGearByExternalIdRequest();
    }

    /**
     * Create an instance of {@link UpsertFishingGearRequest }
     * 
     */
    public UpsertFishingGearRequest createUpsertFishingGearRequest() {
        return new UpsertFishingGearRequest();
    }

    /**
     * Create an instance of {@link FishingGearResponse }
     * 
     */
    public FishingGearResponse createFishingGearResponse() {
        return new FishingGearResponse();
    }

    /**
     * Create an instance of {@link FishingGearListResponse }
     * 
     */
    public FishingGearListResponse createFishingGearListResponse() {
        return new FishingGearListResponse();
    }

}
