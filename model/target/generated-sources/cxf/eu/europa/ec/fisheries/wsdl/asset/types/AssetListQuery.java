
package eu.europa.ec.fisheries.wsdl.asset.types;

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
 * <p>Java class for AssetListQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssetListQuery"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pagination" type="{types.asset.wsdl.fisheries.ec.europa.eu}AssetListPagination"/&gt;
 *         &lt;element name="assetSearchCriteria" type="{types.asset.wsdl.fisheries.ec.europa.eu}AssetListCriteria"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetListQuery", propOrder = {
    "pagination",
    "assetSearchCriteria"
})
public class AssetListQuery
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected AssetListPagination pagination;
    @XmlElement(required = true)
    protected AssetListCriteria assetSearchCriteria;

    /**
     * Gets the value of the pagination property.
     * 
     * @return
     *     possible object is
     *     {@link AssetListPagination }
     *     
     */
    public AssetListPagination getPagination() {
        return pagination;
    }

    /**
     * Sets the value of the pagination property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetListPagination }
     *     
     */
    public void setPagination(AssetListPagination value) {
        this.pagination = value;
    }

    /**
     * Gets the value of the assetSearchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link AssetListCriteria }
     *     
     */
    public AssetListCriteria getAssetSearchCriteria() {
        return assetSearchCriteria;
    }

    /**
     * Sets the value of the assetSearchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetListCriteria }
     *     
     */
    public void setAssetSearchCriteria(AssetListCriteria value) {
        this.assetSearchCriteria = value;
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
