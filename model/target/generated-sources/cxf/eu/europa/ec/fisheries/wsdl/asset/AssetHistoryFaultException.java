
package eu.europa.ec.fisheries.wsdl.asset;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.4.4
 * 2021-09-07T15:13:55.763+02:00
 * Generated source version: 3.4.4
 */

@WebFault(name = "AssetFault", targetNamespace = "types.asset.wsdl.fisheries.ec.europa.eu")
public class AssetHistoryFaultException extends Exception {

    private eu.europa.ec.fisheries.wsdl.asset.types.AssetFault faultInfo;

    public AssetHistoryFaultException() {
        super();
    }

    public AssetHistoryFaultException(String message) {
        super(message);
    }

    public AssetHistoryFaultException(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public AssetHistoryFaultException(String message, eu.europa.ec.fisheries.wsdl.asset.types.AssetFault assetFault) {
        super(message);
        this.faultInfo = assetFault;
    }

    public AssetHistoryFaultException(String message, eu.europa.ec.fisheries.wsdl.asset.types.AssetFault assetFault, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = assetFault;
    }

    public eu.europa.ec.fisheries.wsdl.asset.types.AssetFault getFaultInfo() {
        return this.faultInfo;
    }
}
