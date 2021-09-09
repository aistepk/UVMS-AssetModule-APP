package eu.europa.ec.fisheries.schema.mobileterminal.module.v1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.4.4
 * 2021-09-09T11:00:26.333+02:00
 * Generated source version: 3.4.4
 *
 */
@WebService(targetNamespace = "urn:module.mobileterminal.schema.fisheries.ec.europa.eu:v1", name = "MobileTerminalPortType")
@XmlSeeAlso({eu.europa.ec.fisheries.schema.mobileterminal.types.v1.ObjectFactory.class, ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface MobileTerminalPortType {

    @WebMethod(operationName = "Ping")
    @WebResult(name = "pingResponse", targetNamespace = "urn:module.mobileterminal.schema.fisheries.ec.europa.eu:v1", partName = "body")
    public PingResponse ping(

        @WebParam(partName = "body", name = "pingRequest", targetNamespace = "urn:module.mobileterminal.schema.fisheries.ec.europa.eu:v1")
        PingRequest body
    );

    @WebMethod(operationName = "MobileTerminalList")
    @WebResult(name = "MobileTerminalListResponse", targetNamespace = "urn:module.mobileterminal.schema.fisheries.ec.europa.eu:v1", partName = "body")
    public MobileTerminalListResponse mobileTerminalList(

        @WebParam(partName = "body", name = "MobileTerminalListRequest", targetNamespace = "urn:module.mobileterminal.schema.fisheries.ec.europa.eu:v1")
        MobileTerminalListRequest body
    );

    @WebMethod(operationName = "GetMobileTerminal")
    @WebResult(name = "mobileTerminalResponse", targetNamespace = "urn:module.mobileterminal.schema.fisheries.ec.europa.eu:v1", partName = "body")
    public MobileTerminalResponse getMobileTerminal(

        @WebParam(partName = "body", name = "getMobileTerminalRequest", targetNamespace = "urn:module.mobileterminal.schema.fisheries.ec.europa.eu:v1")
        GetMobileTerminalRequest body
    ) throws MobileTerminalFaultException;
}
