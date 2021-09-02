
package eu.europa.ec.fisheries.schema.mobileterminal.polltypes.v1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * <p>Java class for PollSearchCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PollSearchCriteria"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="criterias" type="{urn:polltypes.mobileterminal.schema.fisheries.ec.europa.eu:v1}ListCriteria" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isDynamic" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PollSearchCriteria", propOrder = {
    "criterias",
    "isDynamic"
})
public class PollSearchCriteria
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected List<ListCriteria> criterias;
    protected Boolean isDynamic;

    /**
     * Gets the value of the criterias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the criterias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCriterias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListCriteria }
     * 
     * 
     */
    public List<ListCriteria> getCriterias() {
        if (criterias == null) {
            criterias = new ArrayList<ListCriteria>();
        }
        return this.criterias;
    }

    /**
     * Gets the value of the isDynamic property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDynamic() {
        return isDynamic;
    }

    /**
     * Sets the value of the isDynamic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDynamic(Boolean value) {
        this.isDynamic = value;
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
