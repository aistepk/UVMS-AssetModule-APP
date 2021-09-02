
package eu.europa.ec.fisheries.schema.mobileterminal.source.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import eu.europa.ec.fisheries.schema.mobileterminal.types.v1.MobileTerminalBaseRequest;
import eu.europa.ec.fisheries.schema.mobileterminal.types.v1.MobileTerminalId;
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
 *     &lt;extension base="{urn:types.mobileterminal.schema.fisheries.ec.europa.eu:v1}MobileTerminalBaseRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{urn:types.mobileterminal.schema.fisheries.ec.europa.eu:v1}MobileTerminalId"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id"
})
@XmlRootElement(name = "historyMobileTerminalListRequest")
public class HistoryMobileTerminalListRequest
    extends MobileTerminalBaseRequest
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected MobileTerminalId id;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link MobileTerminalId }
     *     
     */
    public MobileTerminalId getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileTerminalId }
     *     
     */
    public void setId(MobileTerminalId value) {
        this.id = value;
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
