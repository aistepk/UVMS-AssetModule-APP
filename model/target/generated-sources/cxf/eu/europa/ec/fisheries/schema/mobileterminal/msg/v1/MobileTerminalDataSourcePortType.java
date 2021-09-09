package eu.europa.ec.fisheries.schema.mobileterminal.msg.v1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.4.4
 * 2021-09-09T11:00:28.505+02:00
 * Generated source version: 3.4.4
 *
 */
@WebService(targetNamespace = "urn:msg.mobileterminal.schema.fisheries.ec.europa.eu:v1", name = "MobileTerminalDataSourcePortType")
@XmlSeeAlso({eu.europa.ec.fisheries.schema.mobileterminal.source.v1.ObjectFactory.class, eu.europa.ec.fisheries.schema.mobileterminal.config.v1.ObjectFactory.class, eu.europa.ec.fisheries.schema.mobileterminal.types.v1.ObjectFactory.class, eu.europa.ec.fisheries.schema.mobileterminal.polltypes.v1.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface MobileTerminalDataSourcePortType {

    @WebMethod(operationName = "PollList")
    @WebResult(name = "pollListResponse", targetNamespace = "urn:polltypes.mobileterminal.schema.fisheries.ec.europa.eu:v1", partName = "body")
    public eu.europa.ec.fisheries.schema.mobileterminal.polltypes.v1.PollListResponse pollList(

        @WebParam(partName = "body", name = "getPollListRequest", targetNamespace = "urn:polltypes.mobileterminal.schema.fisheries.ec.europa.eu:v1")
        eu.europa.ec.fisheries.schema.mobileterminal.polltypes.v1.GetPollListRequest body
    ) throws MobileTerminalFault;

    @WebMethod(operationName = "SetStatusPollProgram")
    @WebResult(name = "singlePollResponse", targetNamespace = "urn:polltypes.mobileterminal.schema.fisheries.ec.europa.eu:v1", partName = "body")
    public eu.europa.ec.fisheries.schema.mobileterminal.polltypes.v1.SinglePollResponse setStatusPollProgram(

        @WebParam(partName = "body", name = "setStatusPollProgramRequest", targetNamespace = "urn:polltypes.mobileterminal.schema.fisheries.ec.europa.eu:v1")
        eu.europa.ec.fisheries.schema.mobileterminal.polltypes.v1.SetStatusPollProgramRequest body
    ) throws MobileTerminalFault;

    @WebMethod(operationName = "UpdateMobileTerminal")
    @WebResult(name = "mobileTerminalResponse", targetNamespace = "urn:source.mobileterminal.schema.fisheries.ec.europa.eu:v1", partName = "body")
    public eu.europa.ec.fisheries.schema.mobileterminal.source.v1.MobileTerminalResponse updateMobileTerminal(

        @WebParam(partName = "body", name = "updateMobileTerminalRequest", targetNamespace = "urn:source.mobileterminal.schema.fisheries.ec.europa.eu:v1")
        eu.europa.ec.fisheries.schema.mobileterminal.source.v1.UpdateMobileTerminalRequest body
    ) throws MobileTerminalFault;

    @WebMethod(operationName = "PollableList")
    @WebResult(name = "mobileTerminalListResponse", targetNamespace = "urn:source.mobileterminal.schema.fisheries.ec.europa.eu:v1", partName = "body")
    public eu.europa.ec.fisheries.schema.mobileterminal.source.v1.MobileTerminalListResponse pollableList(

        @WebParam(partName = "body", name = "getPollableRequest", targetNamespace = "urn:polltypes.mobileterminal.schema.fisheries.ec.europa.eu:v1")
        eu.europa.ec.fisheries.schema.mobileterminal.polltypes.v1.GetPollableRequest body
    ) throws MobileTerminalFault;

    @WebMethod(operationName = "CreateMobileTerminal")
    @WebResult(name = "mobileTerminalResponse", targetNamespace = "urn:source.mobileterminal.schema.fisheries.ec.europa.eu:v1", partName = "body")
    public eu.europa.ec.fisheries.schema.mobileterminal.source.v1.MobileTerminalResponse createMobileTerminal(

        @WebParam(partName = "body", name = "createMobileTerminalRequest", targetNamespace = "urn:source.mobileterminal.schema.fisheries.ec.europa.eu:v1")
        eu.europa.ec.fisheries.schema.mobileterminal.source.v1.CreateMobileTerminalRequest body
    ) throws MobileTerminalFault;

    @WebMethod(operationName = "UnAssignMobileTerminal")
    @WebResult(name = "mobileTerminalResponse", targetNamespace = "urn:source.mobileterminal.schema.fisheries.ec.europa.eu:v1", partName = "body")
    public eu.europa.ec.fisheries.schema.mobileterminal.source.v1.MobileTerminalResponse unAssignMobileTerminal(

        @WebParam(partName = "body", name = "mobileTerminalUnAssignRequest", targetNamespace = "urn:source.mobileterminal.schema.fisheries.ec.europa.eu:v1")
        eu.europa.ec.fisheries.schema.mobileterminal.source.v1.MobileTerminalUnAssignRequest body
    ) throws MobileTerminalFault;

    @WebMethod(operationName = "Config")
    @WebResult(name = "configResponse", targetNamespace = "urn:config.mobileterminal.schema.fisheries.ec.europa.eu:v1", partName = "body")
    public eu.europa.ec.fisheries.schema.mobileterminal.config.v1.ConfigResponse config(

        @WebParam(partName = "body", name = "configRequest", targetNamespace = "urn:config.mobileterminal.schema.fisheries.ec.europa.eu:v1")
        eu.europa.ec.fisheries.schema.mobileterminal.config.v1.ConfigRequest body
    ) throws MobileTerminalFault;

    @WebMethod(operationName = "GetMobileTerminal")
    @WebResult(name = "mobileTerminalResponse", targetNamespace = "urn:source.mobileterminal.schema.fisheries.ec.europa.eu:v1", partName = "body")
    public eu.europa.ec.fisheries.schema.mobileterminal.source.v1.MobileTerminalResponse getMobileTerminal(

        @WebParam(partName = "body", name = "getMobileTerminalRequest", targetNamespace = "urn:source.mobileterminal.schema.fisheries.ec.europa.eu:v1")
        eu.europa.ec.fisheries.schema.mobileterminal.source.v1.GetMobileTerminalRequest body
    ) throws MobileTerminalFault;

    @WebMethod(operationName = "AssignMobileTerminal")
    @WebResult(name = "mobileTerminalResponse", targetNamespace = "urn:source.mobileterminal.schema.fisheries.ec.europa.eu:v1", partName = "body")
    public eu.europa.ec.fisheries.schema.mobileterminal.source.v1.MobileTerminalResponse assignMobileTerminal(

        @WebParam(partName = "body", name = "mobileTerminalAssignRequest", targetNamespace = "urn:source.mobileterminal.schema.fisheries.ec.europa.eu:v1")
        eu.europa.ec.fisheries.schema.mobileterminal.source.v1.MobileTerminalAssignRequest body
    ) throws MobileTerminalFault;

    @WebMethod(operationName = "ConfigChannelName")
    @WebResult(name = "comchannelNameResponse", targetNamespace = "urn:config.mobileterminal.schema.fisheries.ec.europa.eu:v1", partName = "body")
    public eu.europa.ec.fisheries.schema.mobileterminal.config.v1.ComchannelNameResponse configChannelName(

        @WebParam(partName = "body", name = "comchannelNameRequest", targetNamespace = "urn:config.mobileterminal.schema.fisheries.ec.europa.eu:v1")
        eu.europa.ec.fisheries.schema.mobileterminal.config.v1.ComchannelNameRequest body
    ) throws MobileTerminalFault;

    @WebMethod(operationName = "UpdatedDNIDList")
    @WebResult(name = "updatedDNIDListResponse", targetNamespace = "urn:config.mobileterminal.schema.fisheries.ec.europa.eu:v1", partName = "body")
    public eu.europa.ec.fisheries.schema.mobileterminal.config.v1.UpdatedDNIDListResponse updatedDNIDList(

        @WebParam(partName = "body", name = "updatedDNIDListRequest", targetNamespace = "urn:config.mobileterminal.schema.fisheries.ec.europa.eu:v1")
        eu.europa.ec.fisheries.schema.mobileterminal.config.v1.UpdatedDNIDListRequest body
    ) throws MobileTerminalFault;

    @WebMethod(operationName = "MobileTerminalList")
    @WebResult(name = "mobileTerminalListResponse", targetNamespace = "urn:source.mobileterminal.schema.fisheries.ec.europa.eu:v1", partName = "body")
    public eu.europa.ec.fisheries.schema.mobileterminal.source.v1.MobileTerminalListResponse mobileTerminalList(

        @WebParam(partName = "body", name = "mobileTerminalListRequest", targetNamespace = "urn:source.mobileterminal.schema.fisheries.ec.europa.eu:v1")
        eu.europa.ec.fisheries.schema.mobileterminal.source.v1.MobileTerminalListRequest body
    ) throws MobileTerminalFault;

    @WebMethod(operationName = "SetStatusMobileTerminal")
    @WebResult(name = "mobileTerminalResponse", targetNamespace = "urn:source.mobileterminal.schema.fisheries.ec.europa.eu:v1", partName = "body")
    public eu.europa.ec.fisheries.schema.mobileterminal.source.v1.MobileTerminalResponse setStatusMobileTerminal(

        @WebParam(partName = "body", name = "setStatusMobileTerminalRequest", targetNamespace = "urn:source.mobileterminal.schema.fisheries.ec.europa.eu:v1")
        eu.europa.ec.fisheries.schema.mobileterminal.source.v1.SetStatusMobileTerminalRequest body
    ) throws MobileTerminalFault;

    @WebMethod(operationName = "TerminalSystemList")
    @WebResult(name = "terminalSystemListResponse", targetNamespace = "urn:config.mobileterminal.schema.fisheries.ec.europa.eu:v1", partName = "body")
    public eu.europa.ec.fisheries.schema.mobileterminal.config.v1.TerminalSystemListResponse terminalSystemList(

        @WebParam(partName = "body", name = "terminalSystemListRequest", targetNamespace = "urn:config.mobileterminal.schema.fisheries.ec.europa.eu:v1")
        eu.europa.ec.fisheries.schema.mobileterminal.config.v1.TerminalSystemListRequest body
    ) throws MobileTerminalFault;

    @WebMethod(operationName = "UpsertMobileTerminal")
    public void upsertMobileTerminal(

        @WebParam(partName = "body", mode = WebParam.Mode.INOUT, name = "upsertMobileTerminalRequest", targetNamespace = "urn:source.mobileterminal.schema.fisheries.ec.europa.eu:v1")
        javax.xml.ws.Holder<eu.europa.ec.fisheries.schema.mobileterminal.source.v1.UpsertMobileTerminalRequest> body
    ) throws MobileTerminalFault;

    @WebMethod(operationName = "UpsertPluginList")
    @WebResult(name = "upsertPluginListResponse", targetNamespace = "urn:config.mobileterminal.schema.fisheries.ec.europa.eu:v1", partName = "body")
    public eu.europa.ec.fisheries.schema.mobileterminal.config.v1.UpsertPluginListResponse upsertPluginList(

        @WebParam(partName = "body", name = "upsertPluginListRequest", targetNamespace = "urn:config.mobileterminal.schema.fisheries.ec.europa.eu:v1")
        eu.europa.ec.fisheries.schema.mobileterminal.config.v1.UpsertPluginListRequest body
    ) throws MobileTerminalFault;

    @WebMethod(operationName = "CreatePoll")
    @WebResult(name = "createPollResponse", targetNamespace = "urn:polltypes.mobileterminal.schema.fisheries.ec.europa.eu:v1", partName = "body")
    public eu.europa.ec.fisheries.schema.mobileterminal.polltypes.v1.CreatePollResponse createPoll(

        @WebParam(partName = "body", name = "createPollRequest", targetNamespace = "urn:polltypes.mobileterminal.schema.fisheries.ec.europa.eu:v1")
        eu.europa.ec.fisheries.schema.mobileterminal.polltypes.v1.CreatePollRequest body
    ) throws MobileTerminalFault;

    @WebMethod(operationName = "Ping")
    @WebResult(name = "pingResponse", targetNamespace = "urn:source.mobileterminal.schema.fisheries.ec.europa.eu:v1", partName = "body")
    public eu.europa.ec.fisheries.schema.mobileterminal.source.v1.PingResponse ping(

        @WebParam(partName = "body", name = "pingRequest", targetNamespace = "urn:source.mobileterminal.schema.fisheries.ec.europa.eu:v1")
        eu.europa.ec.fisheries.schema.mobileterminal.source.v1.PingRequest body
    );

    @WebMethod(operationName = "PollProgramList")
    @WebResult(name = "pollListResponse", targetNamespace = "urn:polltypes.mobileterminal.schema.fisheries.ec.europa.eu:v1", partName = "body")
    public eu.europa.ec.fisheries.schema.mobileterminal.polltypes.v1.PollListResponse pollProgramList(

        @WebParam(partName = "body", name = "getPollProgramListRequest", targetNamespace = "urn:polltypes.mobileterminal.schema.fisheries.ec.europa.eu:v1")
        eu.europa.ec.fisheries.schema.mobileterminal.polltypes.v1.GetPollProgramListRequest body
    ) throws MobileTerminalFault;
}
