
package eu.europa.ec.fisheries.schema.mobileterminal.module.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import eu.europa.ec.fisheries.schema.mobileterminal.types.v1.MobileTerminalType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mobilTerminal" type="{urn:types.mobileterminal.schema.fisheries.ec.europa.eu:v1}MobileTerminalType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "mobilTerminal"
})
@XmlRootElement(name = "mobileTerminalResponse")
public class MobileTerminalResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected MobileTerminalType mobilTerminal;

    /**
     * Gets the value of the mobilTerminal property.
     * 
     * @return
     *     possible object is
     *     {@link MobileTerminalType }
     *     
     */
    public MobileTerminalType getMobilTerminal() {
        return mobilTerminal;
    }

    /**
     * Sets the value of the mobilTerminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileTerminalType }
     *     
     */
    public void setMobilTerminal(MobileTerminalType value) {
        this.mobilTerminal = value;
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
