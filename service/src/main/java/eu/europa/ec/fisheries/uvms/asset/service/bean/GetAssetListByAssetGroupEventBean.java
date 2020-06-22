package eu.europa.ec.fisheries.uvms.asset.service.bean;

import eu.europa.ec.fisheries.uvms.asset.message.event.AssetMessageErrorEvent;
import eu.europa.ec.fisheries.uvms.asset.message.event.AssetMessageEvent;
import eu.europa.ec.fisheries.uvms.asset.message.producer.AssetMessageProducer;
import eu.europa.ec.fisheries.uvms.asset.model.constants.FaultCode;
import eu.europa.ec.fisheries.uvms.asset.model.exception.AssetException;
import eu.europa.ec.fisheries.uvms.asset.model.mapper.AssetModuleResponseMapper;
import eu.europa.ec.fisheries.uvms.asset.service.AssetService;
import eu.europa.ec.fisheries.uvms.commons.service.interceptor.TracingInterceptor;
import eu.europa.ec.fisheries.wsdl.asset.module.GetAssetListByAssetGroupsRequest;
import eu.europa.ec.fisheries.wsdl.asset.types.Asset;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.interceptor.Interceptors;
import javax.jms.JMSException;
import javax.jms.TextMessage;
import java.util.List;

@Stateless
@LocalBean
public class GetAssetListByAssetGroupEventBean {

    private final static Logger LOG = LoggerFactory.getLogger(GetAssetListByAssetGroupEventBean.class);

    @EJB
    AssetMessageProducer messageProducer;

    @Inject
    @AssetMessageErrorEvent
    Event<AssetMessageEvent> assetErrorEvent;

    @EJB
    AssetService service;

    public void getAssetListByAssetGroups(AssetMessageEvent message) {
        TextMessage jmsMessage = message.getMessage();
        try {
            GetAssetListByAssetGroupsRequest request = message.getAssetListByGroup();
            if (request == null) {
                assetErrorEvent.fire(new AssetMessageEvent(message.getMessage(), AssetModuleResponseMapper.createFaultMessage(FaultCode.ASSET_MESSAGE, "Exception when getting AssetListByVesselGroups [ Request is null ]")));
                return;
            }
            List<Asset> response = service.getAssetListByAssetGroups(request.getGroups());
            messageProducer.sendModuleResponseMessageOv(message.getMessage(), AssetModuleResponseMapper.mapToAssetListByAssetGroupResponse(response));
            LOG.info("Response sent back to requestor on queue [ {} ]", jmsMessage!= null ? jmsMessage.getJMSReplyTo() : "Null!!!");
        } catch (AssetException  | JMSException e) {
            LOG.error("[ Error when getting assetGroupList from source. ] ");
            assetErrorEvent.fire(new AssetMessageEvent(message.getMessage(), AssetModuleResponseMapper.createFaultMessage(FaultCode.ASSET_MESSAGE, "Exception when getting AssetListByVesselGroups [ " + e.getMessage())));
        }
    }
    
    @Interceptors(TracingInterceptor.class)
    public void getAssetListByAssetGroupsRpt(AssetMessageEvent assetListByGroupRptListEvent) {
    	TextMessage jmsMessage = assetListByGroupRptListEvent.getMessage();
    	try {
    		GetAssetListByAssetGroupsRequest request = assetListByGroupRptListEvent.getAssetListByGroup();
    		if (request == null) {
    			assetErrorEvent.fire(new AssetMessageEvent(assetListByGroupRptListEvent.getMessage(), AssetModuleResponseMapper.createFaultMessage(FaultCode.ASSET_MESSAGE, "Exception when getting AssetListByVesselGroups [ Request is null ]")));
    			return;
    		}
    		List<Asset> response = service.getAssetListByAssetGroupsReporting(request.getGroups());
    		messageProducer.sendModuleResponseMessageOv(assetListByGroupRptListEvent.getMessage(), AssetModuleResponseMapper.mapToAssetListByAssetGroupResponse(response));
    		LOG.info("Response sent back to requestor on queue [ {} ]", jmsMessage!= null ? jmsMessage.getJMSReplyTo() : "Null!!!");
    	} catch (AssetException  | JMSException e) {
    		LOG.error("[ Error when getting assetGroupList from source. ] ");
    		assetErrorEvent.fire(new AssetMessageEvent(assetListByGroupRptListEvent.getMessage(), AssetModuleResponseMapper.createFaultMessage(FaultCode.ASSET_MESSAGE, "Exception when getting AssetListByVesselGroups [ " + e.getMessage())));
    	}
    }

}
