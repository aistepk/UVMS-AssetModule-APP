
package eu.europa.ec.fisheries.schema.mobileterminal.module.v1;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.4.4
 * 2021-09-09T11:00:26.295+02:00
 * Generated source version: 3.4.4
 */

@WebFault(name = "mobileTerminalFault", targetNamespace = "urn:types.mobileterminal.schema.fisheries.ec.europa.eu:v1")
public class MobileTerminalFaultException extends Exception {

    private eu.europa.ec.fisheries.schema.mobileterminal.types.v1.MobileTerminalFault faultInfo;

    public MobileTerminalFaultException() {
        super();
    }

    public MobileTerminalFaultException(String message) {
        super(message);
    }

    public MobileTerminalFaultException(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public MobileTerminalFaultException(String message, eu.europa.ec.fisheries.schema.mobileterminal.types.v1.MobileTerminalFault mobileTerminalFault) {
        super(message);
        this.faultInfo = mobileTerminalFault;
    }

    public MobileTerminalFaultException(String message, eu.europa.ec.fisheries.schema.mobileterminal.types.v1.MobileTerminalFault mobileTerminalFault, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = mobileTerminalFault;
    }

    public eu.europa.ec.fisheries.schema.mobileterminal.types.v1.MobileTerminalFault getFaultInfo() {
        return this.faultInfo;
    }
}
