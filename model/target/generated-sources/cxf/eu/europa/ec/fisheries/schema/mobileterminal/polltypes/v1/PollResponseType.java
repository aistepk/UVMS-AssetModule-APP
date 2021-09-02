
package eu.europa.ec.fisheries.schema.mobileterminal.polltypes.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.europa.ec.fisheries.schema.mobileterminal.types.v1.MobileTerminalType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * <p>Java class for PollResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PollResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:polltypes.mobileterminal.schema.fisheries.ec.europa.eu:v1}PollBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pollId" type="{urn:polltypes.mobileterminal.schema.fisheries.ec.europa.eu:v1}PollId"/&gt;
 *         &lt;element name="mobileTerminal" type="{urn:types.mobileterminal.schema.fisheries.ec.europa.eu:v1}MobileTerminalType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PollResponseType", propOrder = {
    "pollId",
    "mobileTerminal"
})
public class PollResponseType
    extends PollBaseType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected PollId pollId;
    @XmlElement(required = true)
    protected MobileTerminalType mobileTerminal;

    /**
     * Gets the value of the pollId property.
     * 
     * @return
     *     possible object is
     *     {@link PollId }
     *     
     */
    public PollId getPollId() {
        return pollId;
    }

    /**
     * Sets the value of the pollId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PollId }
     *     
     */
    public void setPollId(PollId value) {
        this.pollId = value;
    }

    /**
     * Gets the value of the mobileTerminal property.
     * 
     * @return
     *     possible object is
     *     {@link MobileTerminalType }
     *     
     */
    public MobileTerminalType getMobileTerminal() {
        return mobileTerminal;
    }

    /**
     * Sets the value of the mobileTerminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileTerminalType }
     *     
     */
    public void setMobileTerminal(MobileTerminalType value) {
        this.mobileTerminal = value;
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
