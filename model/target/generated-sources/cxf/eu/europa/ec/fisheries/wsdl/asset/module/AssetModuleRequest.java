
package eu.europa.ec.fisheries.wsdl.asset.module;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * <p>Java class for AssetModuleRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssetModuleRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="method" type="{module.asset.wsdl.fisheries.ec.europa.eu}AssetModuleMethod"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetModuleRequest", propOrder = {
    "method"
})
@XmlSeeAlso({
    UpsertFishingGearModuleRequest.class,
    UpsertAssetModuleRequest.class,
    AssetListGroupByFlagStateRequest.class,
    GetAssetGroupListByAssetGuidRequest.class,
    PingRequest.class,
    AssetListModuleRequest.class,
    GetAssetModuleRequest.class,
    AssetGroupListByUserRequest.class,
    GetAssetFromAssetIdAndDateRequest.class,
    GetFlagStateByGuidAndDateRequest.class
})
public abstract class AssetModuleRequest
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected AssetModuleMethod method;

    /**
     * Gets the value of the method property.
     * 
     * @return
     *     possible object is
     *     {@link AssetModuleMethod }
     *     
     */
    public AssetModuleMethod getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetModuleMethod }
     *     
     */
    public void setMethod(AssetModuleMethod value) {
        this.method = value;
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
