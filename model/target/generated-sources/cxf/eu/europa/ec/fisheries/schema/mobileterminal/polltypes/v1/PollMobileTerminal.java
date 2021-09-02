
package eu.europa.ec.fisheries.schema.mobileterminal.polltypes.v1;

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
 * <p>Java class for PollMobileTerminal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PollMobileTerminal"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mobileTerminalId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="comChannelId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PollMobileTerminal", propOrder = {
    "mobileTerminalId",
    "comChannelId"
})
public class PollMobileTerminal
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String mobileTerminalId;
    @XmlElement(required = true)
    protected String comChannelId;

    /**
     * Gets the value of the mobileTerminalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileTerminalId() {
        return mobileTerminalId;
    }

    /**
     * Sets the value of the mobileTerminalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileTerminalId(String value) {
        this.mobileTerminalId = value;
    }

    /**
     * Gets the value of the comChannelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComChannelId() {
        return comChannelId;
    }

    /**
     * Sets the value of the comChannelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComChannelId(String value) {
        this.comChannelId = value;
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
