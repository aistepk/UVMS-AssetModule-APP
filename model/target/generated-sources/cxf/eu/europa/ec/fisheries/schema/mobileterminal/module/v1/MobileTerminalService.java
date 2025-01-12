package eu.europa.ec.fisheries.schema.mobileterminal.module.v1;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.4.4
 * 2021-09-02T12:50:59.100+02:00
 * Generated source version: 3.4.4
 *
 */
@WebServiceClient(name = "MobileTerminalService",
                  wsdlLocation = "file:/C:/Users/paist/Documents/LIA/UVMS-AssetModule-APP/model/src/main/resources/contract/MobileTerminalModuleService.wsdl",
                  targetNamespace = "urn:module.mobileterminal.schema.fisheries.ec.europa.eu:v1")
public class MobileTerminalService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("urn:module.mobileterminal.schema.fisheries.ec.europa.eu:v1", "MobileTerminalService");
    public final static QName MobileTerminalPortType = new QName("urn:module.mobileterminal.schema.fisheries.ec.europa.eu:v1", "MobileTerminalPortType");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/paist/Documents/LIA/UVMS-AssetModule-APP/model/src/main/resources/contract/MobileTerminalModuleService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(MobileTerminalService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/paist/Documents/LIA/UVMS-AssetModule-APP/model/src/main/resources/contract/MobileTerminalModuleService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public MobileTerminalService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public MobileTerminalService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MobileTerminalService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public MobileTerminalService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public MobileTerminalService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public MobileTerminalService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns MobileTerminalPortType
     */
    @WebEndpoint(name = "MobileTerminalPortType")
    public MobileTerminalPortType getMobileTerminalPortType() {
        return super.getPort(MobileTerminalPortType, MobileTerminalPortType.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MobileTerminalPortType
     */
    @WebEndpoint(name = "MobileTerminalPortType")
    public MobileTerminalPortType getMobileTerminalPortType(WebServiceFeature... features) {
        return super.getPort(MobileTerminalPortType, MobileTerminalPortType.class, features);
    }

}
