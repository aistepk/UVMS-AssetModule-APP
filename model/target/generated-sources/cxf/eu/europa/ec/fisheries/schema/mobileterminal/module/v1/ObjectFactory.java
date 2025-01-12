
package eu.europa.ec.fisheries.schema.mobileterminal.module.v1;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.europa.ec.fisheries.schema.mobileterminal.module.v1 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.europa.ec.fisheries.schema.mobileterminal.module.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetMobileTerminalRequest }
     * 
     */
    public GetMobileTerminalRequest createGetMobileTerminalRequest() {
        return new GetMobileTerminalRequest();
    }

    /**
     * Create an instance of {@link MobileTerminalResponse }
     * 
     */
    public MobileTerminalResponse createMobileTerminalResponse() {
        return new MobileTerminalResponse();
    }

    /**
     * Create an instance of {@link MobileTerminalListRequest }
     * 
     */
    public MobileTerminalListRequest createMobileTerminalListRequest() {
        return new MobileTerminalListRequest();
    }

    /**
     * Create an instance of {@link MobileTerminalListResponse }
     * 
     */
    public MobileTerminalListResponse createMobileTerminalListResponse() {
        return new MobileTerminalListResponse();
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

}
