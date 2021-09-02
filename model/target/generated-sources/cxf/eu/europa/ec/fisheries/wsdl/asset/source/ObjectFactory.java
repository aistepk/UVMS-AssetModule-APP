
package eu.europa.ec.fisheries.wsdl.asset.source;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.europa.ec.fisheries.wsdl.asset.source package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.europa.ec.fisheries.wsdl.asset.source
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAssetRequest }
     * 
     */
    public GetAssetRequest createGetAssetRequest() {
        return new GetAssetRequest();
    }

    /**
     * Create an instance of {@link DeleteAssetRequest }
     * 
     */
    public DeleteAssetRequest createDeleteAssetRequest() {
        return new DeleteAssetRequest();
    }

    /**
     * Create an instance of {@link CreateAssetRequest }
     * 
     */
    public CreateAssetRequest createCreateAssetRequest() {
        return new CreateAssetRequest();
    }

    /**
     * Create an instance of {@link UpdateAssetRequest }
     * 
     */
    public UpdateAssetRequest createUpdateAssetRequest() {
        return new UpdateAssetRequest();
    }

    /**
     * Create an instance of {@link UpsertAssetRequest }
     * 
     */
    public UpsertAssetRequest createUpsertAssetRequest() {
        return new UpsertAssetRequest();
    }

    /**
     * Create an instance of {@link AssetListRequest }
     * 
     */
    public AssetListRequest createAssetListRequest() {
        return new AssetListRequest();
    }

    /**
     * Create an instance of {@link PingRequest }
     * 
     */
    public PingRequest createPingRequest() {
        return new PingRequest();
    }

    /**
     * Create an instance of {@link PingResponse }
     * 
     */
    public PingResponse createPingResponse() {
        return new PingResponse();
    }

    /**
     * Create an instance of {@link AssetListGroupByFlagStateRequest }
     * 
     */
    public AssetListGroupByFlagStateRequest createAssetListGroupByFlagStateRequest() {
        return new AssetListGroupByFlagStateRequest();
    }

}
