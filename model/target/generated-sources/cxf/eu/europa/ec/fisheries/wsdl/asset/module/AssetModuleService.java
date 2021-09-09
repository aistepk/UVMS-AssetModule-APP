package eu.europa.ec.fisheries.wsdl.asset.module;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.4.4
 * 2021-09-02T12:50:51.600+02:00
 * Generated source version: 3.4.4
 *
 */
@WebServiceClient(name = "AssetModuleService",
                  wsdlLocation = "file:/C:/Users/paist/Documents/LIA/UVMS-AssetModule-APP/model/src/main/resources/contract/AssetModuleService.wsdl",
                  targetNamespace = "module.asset.wsdl.fisheries.ec.europa.eu")
public class AssetModuleService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("module.asset.wsdl.fisheries.ec.europa.eu", "AssetModuleService");
    public final static QName AssetModulePortType = new QName("module.asset.wsdl.fisheries.ec.europa.eu", "AssetModulePortType");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/paist/Documents/LIA/UVMS-AssetModule-APP/model/src/main/resources/contract/AssetModuleService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(AssetModuleService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/paist/Documents/LIA/UVMS-AssetModule-APP/model/src/main/resources/contract/AssetModuleService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public AssetModuleService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public AssetModuleService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AssetModuleService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public AssetModuleService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public AssetModuleService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public AssetModuleService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns AssetModulePortType
     */
    @WebEndpoint(name = "AssetModulePortType")
    public AssetModulePortType getAssetModulePortType() {
        return super.getPort(AssetModulePortType, AssetModulePortType.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AssetModulePortType
     */
    @WebEndpoint(name = "AssetModulePortType")
    public AssetModulePortType getAssetModulePortType(WebServiceFeature... features) {
        return super.getPort(AssetModulePortType, AssetModulePortType.class, features);
    }

}