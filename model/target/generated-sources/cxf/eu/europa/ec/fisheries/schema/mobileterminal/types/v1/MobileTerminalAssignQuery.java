
package eu.europa.ec.fisheries.schema.mobileterminal.types.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * <p>Java class for MobileTerminalAssignQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobileTerminalAssignQuery"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="connectId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mobileTerminalId" type="{urn:types.mobileterminal.schema.fisheries.ec.europa.eu:v1}MobileTerminalId"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobileTerminalAssignQuery", propOrder = {
    "connectId",
    "mobileTerminalId"
})
public class MobileTerminalAssignQuery
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String connectId;
    @XmlElement(required = true)
    protected MobileTerminalId mobileTerminalId;

    /**
     * Gets the value of the connectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectId() {
        return connectId;
    }

    /**
     * Sets the value of the connectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectId(String value) {
        this.connectId = value;
    }

    /**
     * Gets the value of the mobileTerminalId property.
     * 
     * @return
     *     possible object is
     *     {@link MobileTerminalId }
     *     
     */
    public MobileTerminalId getMobileTerminalId() {
        return mobileTerminalId;
    }

    /**
     * Sets the value of the mobileTerminalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileTerminalId }
     *     
     */
    public void setMobileTerminalId(MobileTerminalId value) {
        this.mobileTerminalId = value;
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
