
package eu.europa.ec.fisheries.schema.mobileterminal.polltypes.v1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * <p>Java class for PollRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PollRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:polltypes.mobileterminal.schema.fisheries.ec.europa.eu:v1}PollBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mobileTerminals" type="{urn:polltypes.mobileterminal.schema.fisheries.ec.europa.eu:v1}PollMobileTerminal" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PollRequestType", propOrder = {
    "mobileTerminals"
})
public class PollRequestType
    extends PollBaseType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected List<PollMobileTerminal> mobileTerminals;

    /**
     * Gets the value of the mobileTerminals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mobileTerminals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMobileTerminals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PollMobileTerminal }
     * 
     * 
     */
    public List<PollMobileTerminal> getMobileTerminals() {
        if (mobileTerminals == null) {
            mobileTerminals = new ArrayList<PollMobileTerminal>();
        }
        return this.mobileTerminals;
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
