
package eu.europa.ec.fisheries.schema.mobileterminal.types.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import eu.europa.ec.fisheries.schema.mobileterminal.config.v1.ComchannelNameRequest;
import eu.europa.ec.fisheries.schema.mobileterminal.config.v1.ConfigRequest;
import eu.europa.ec.fisheries.schema.mobileterminal.config.v1.TerminalSystemListRequest;
import eu.europa.ec.fisheries.schema.mobileterminal.config.v1.UpdatedDNIDListRequest;
import eu.europa.ec.fisheries.schema.mobileterminal.config.v1.UpsertPluginListRequest;
import eu.europa.ec.fisheries.schema.mobileterminal.polltypes.v1.CreatePollRequest;
import eu.europa.ec.fisheries.schema.mobileterminal.polltypes.v1.GetPollListRequest;
import eu.europa.ec.fisheries.schema.mobileterminal.polltypes.v1.GetPollProgramListRequest;
import eu.europa.ec.fisheries.schema.mobileterminal.polltypes.v1.GetPollableRequest;
import eu.europa.ec.fisheries.schema.mobileterminal.polltypes.v1.SetStatusPollProgramRequest;
import eu.europa.ec.fisheries.schema.mobileterminal.source.v1.CreateMobileTerminalRequest;
import eu.europa.ec.fisheries.schema.mobileterminal.source.v1.GetMobileTerminalRequest;
import eu.europa.ec.fisheries.schema.mobileterminal.source.v1.HistoryMobileTerminalListRequest;
import eu.europa.ec.fisheries.schema.mobileterminal.source.v1.MobileTerminalAssignRequest;
import eu.europa.ec.fisheries.schema.mobileterminal.source.v1.MobileTerminalListRequest;
import eu.europa.ec.fisheries.schema.mobileterminal.source.v1.MobileTerminalUnAssignRequest;
import eu.europa.ec.fisheries.schema.mobileterminal.source.v1.PingRequest;
import eu.europa.ec.fisheries.schema.mobileterminal.source.v1.SetStatusMobileTerminalRequest;
import eu.europa.ec.fisheries.schema.mobileterminal.source.v1.UpdateMobileTerminalRequest;
import eu.europa.ec.fisheries.schema.mobileterminal.source.v1.UpsertMobileTerminalRequest;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * <p>Java class for MobileTerminalBaseRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobileTerminalBaseRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="method" type="{urn:types.mobileterminal.schema.fisheries.ec.europa.eu:v1}MobileTerminalDataSourceMethod"/&gt;
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobileTerminalBaseRequest", propOrder = {
    "method",
    "comment",
    "username"
})
@XmlSeeAlso({
    UpdatedDNIDListRequest.class,
    UpsertPluginListRequest.class,
    ConfigRequest.class,
    ComchannelNameRequest.class,
    TerminalSystemListRequest.class,
    PingRequest.class,
    HistoryMobileTerminalListRequest.class,
    SetStatusMobileTerminalRequest.class,
    MobileTerminalUnAssignRequest.class,
    MobileTerminalAssignRequest.class,
    MobileTerminalListRequest.class,
    UpsertMobileTerminalRequest.class,
    UpdateMobileTerminalRequest.class,
    GetMobileTerminalRequest.class,
    CreateMobileTerminalRequest.class,
    GetPollableRequest.class,
    GetPollListRequest.class,
    SetStatusPollProgramRequest.class,
    GetPollProgramListRequest.class,
    CreatePollRequest.class
})
public abstract class MobileTerminalBaseRequest
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected MobileTerminalDataSourceMethod method;
    @XmlElement(required = true)
    protected String comment;
    @XmlElement(required = true)
    protected String username;

    /**
     * Gets the value of the method property.
     * 
     * @return
     *     possible object is
     *     {@link MobileTerminalDataSourceMethod }
     *     
     */
    public MobileTerminalDataSourceMethod getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileTerminalDataSourceMethod }
     *     
     */
    public void setMethod(MobileTerminalDataSourceMethod value) {
        this.method = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

}
