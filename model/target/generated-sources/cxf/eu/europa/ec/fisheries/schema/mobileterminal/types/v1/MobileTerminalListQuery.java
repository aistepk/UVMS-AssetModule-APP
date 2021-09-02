
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
 * <p>Java class for MobileTerminalListQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobileTerminalListQuery"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pagination" type="{urn:types.mobileterminal.schema.fisheries.ec.europa.eu:v1}ListPagination"/&gt;
 *         &lt;element name="mobileTerminalSearchCriteria" type="{urn:types.mobileterminal.schema.fisheries.ec.europa.eu:v1}MobileTerminalSearchCriteria"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobileTerminalListQuery", propOrder = {
    "pagination",
    "mobileTerminalSearchCriteria"
})
public class MobileTerminalListQuery
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected ListPagination pagination;
    @XmlElement(required = true)
    protected MobileTerminalSearchCriteria mobileTerminalSearchCriteria;

    /**
     * Gets the value of the pagination property.
     * 
     * @return
     *     possible object is
     *     {@link ListPagination }
     *     
     */
    public ListPagination getPagination() {
        return pagination;
    }

    /**
     * Sets the value of the pagination property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListPagination }
     *     
     */
    public void setPagination(ListPagination value) {
        this.pagination = value;
    }

    /**
     * Gets the value of the mobileTerminalSearchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link MobileTerminalSearchCriteria }
     *     
     */
    public MobileTerminalSearchCriteria getMobileTerminalSearchCriteria() {
        return mobileTerminalSearchCriteria;
    }

    /**
     * Sets the value of the mobileTerminalSearchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileTerminalSearchCriteria }
     *     
     */
    public void setMobileTerminalSearchCriteria(MobileTerminalSearchCriteria value) {
        this.mobileTerminalSearchCriteria = value;
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
