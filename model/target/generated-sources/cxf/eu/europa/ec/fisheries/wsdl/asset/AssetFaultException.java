
package eu.europa.ec.fisheries.wsdl.asset;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.4.4
 * 2021-09-08T17:05:45.382+02:00
 * Generated source version: 3.4.4
 */

@WebFault(name = "AssetFault", targetNamespace = "types.asset.wsdl.fisheries.ec.europa.eu")
public class AssetFaultException extends Exception {

    private eu.europa.ec.fisheries.wsdl.asset.types.AssetFault faultInfo;

    public AssetFaultException() {
        super();
    }

    public AssetFaultException(String message) {
        super(message);
    }

    public AssetFaultException(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public AssetFaultException(String message, eu.europa.ec.fisheries.wsdl.asset.types.AssetFault assetFault) {
        super(message);
        this.faultInfo = assetFault;
    }

    public AssetFaultException(String message, eu.europa.ec.fisheries.wsdl.asset.types.AssetFault assetFault, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = assetFault;
    }

    public eu.europa.ec.fisheries.wsdl.asset.types.AssetFault getFaultInfo() {
        return this.faultInfo;
    }
}
