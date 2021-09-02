
package eu.europa.ec.fisheries.wsdl.asset.config;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.europa.ec.fisheries.wsdl.asset.config package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.europa.ec.fisheries.wsdl.asset.config
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConfigRequest }
     * 
     */
    public ConfigRequest createConfigRequest() {
        return new ConfigRequest();
    }

    /**
     * Create an instance of {@link ConfigResponse }
     * 
     */
    public ConfigResponse createConfigResponse() {
        return new ConfigResponse();
    }

    /**
     * Create an instance of {@link Config }
     * 
     */
    public Config createConfig() {
        return new Config();
    }

    /**
     * Create an instance of {@link ConfigValue }
     * 
     */
    public ConfigValue createConfigValue() {
        return new ConfigValue();
    }

}
