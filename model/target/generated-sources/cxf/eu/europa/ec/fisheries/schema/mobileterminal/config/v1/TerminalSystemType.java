
package eu.europa.ec.fisheries.schema.mobileterminal.config.v1;

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
 * <p>Java class for TerminalSystemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TerminalSystemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="terminalConfiguration" type="{urn:config.mobileterminal.schema.fisheries.ec.europa.eu:v1}TerminalSystemConfiguration"/&gt;
 *         &lt;element name="comchannelConfiguration" type="{urn:config.mobileterminal.schema.fisheries.ec.europa.eu:v1}TerminalSystemConfiguration"/&gt;
 *         &lt;element name="capabilityConfiguration" type="{urn:config.mobileterminal.schema.fisheries.ec.europa.eu:v1}CapabilityConfiguration"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminalSystemType", propOrder = {
    "type",
    "terminalConfiguration",
    "comchannelConfiguration",
    "capabilityConfiguration"
})
public class TerminalSystemType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String type;
    @XmlElement(required = true)
    protected TerminalSystemConfiguration terminalConfiguration;
    @XmlElement(required = true)
    protected TerminalSystemConfiguration comchannelConfiguration;
    @XmlElement(required = true)
    protected CapabilityConfiguration capabilityConfiguration;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the terminalConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalSystemConfiguration }
     *     
     */
    public TerminalSystemConfiguration getTerminalConfiguration() {
        return terminalConfiguration;
    }

    /**
     * Sets the value of the terminalConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalSystemConfiguration }
     *     
     */
    public void setTerminalConfiguration(TerminalSystemConfiguration value) {
        this.terminalConfiguration = value;
    }

    /**
     * Gets the value of the comchannelConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalSystemConfiguration }
     *     
     */
    public TerminalSystemConfiguration getComchannelConfiguration() {
        return comchannelConfiguration;
    }

    /**
     * Sets the value of the comchannelConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalSystemConfiguration }
     *     
     */
    public void setComchannelConfiguration(TerminalSystemConfiguration value) {
        this.comchannelConfiguration = value;
    }

    /**
     * Gets the value of the capabilityConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link CapabilityConfiguration }
     *     
     */
    public CapabilityConfiguration getCapabilityConfiguration() {
        return capabilityConfiguration;
    }

    /**
     * Sets the value of the capabilityConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapabilityConfiguration }
     *     
     */
    public void setCapabilityConfiguration(CapabilityConfiguration value) {
        this.capabilityConfiguration = value;
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
