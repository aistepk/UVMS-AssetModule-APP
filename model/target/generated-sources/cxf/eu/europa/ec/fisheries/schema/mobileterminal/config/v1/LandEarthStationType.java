
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
 * <p>Java class for LandEarthStationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LandEarthStationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:config.mobileterminal.schema.fisheries.ec.europa.eu:v1}CapabilityOption"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="labelName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="serviceName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LandEarthStationType", propOrder = {
    "labelName",
    "serviceName"
})
public class LandEarthStationType
    extends CapabilityOption
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String labelName;
    @XmlElement(required = true)
    protected String serviceName;

    /**
     * Gets the value of the labelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelName() {
        return labelName;
    }

    /**
     * Sets the value of the labelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelName(String value) {
        this.labelName = value;
    }

    /**
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceName(String value) {
        this.serviceName = value;
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
