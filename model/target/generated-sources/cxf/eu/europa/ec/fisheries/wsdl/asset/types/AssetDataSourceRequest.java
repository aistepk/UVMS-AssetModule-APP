
package eu.europa.ec.fisheries.wsdl.asset.types;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import eu.europa.ec.fisheries.wsdl.asset.config.ConfigRequest;
import eu.europa.ec.fisheries.wsdl.asset.fishinggear.FishingGearByExternalIdRequest;
import eu.europa.ec.fisheries.wsdl.asset.fishinggear.FishingGearByIdRequest;
import eu.europa.ec.fisheries.wsdl.asset.fishinggear.FishingGearListRequest;
import eu.europa.ec.fisheries.wsdl.asset.fishinggear.UpsertFishingGearRequest;
import eu.europa.ec.fisheries.wsdl.asset.history.AssetHistoryListByAssetIdRequest;
import eu.europa.ec.fisheries.wsdl.asset.history.GetAssetHistoryRequest;
import eu.europa.ec.fisheries.wsdl.asset.source.AssetListGroupByFlagStateRequest;
import eu.europa.ec.fisheries.wsdl.asset.source.AssetListRequest;
import eu.europa.ec.fisheries.wsdl.asset.source.CreateAssetRequest;
import eu.europa.ec.fisheries.wsdl.asset.source.DeleteAssetRequest;
import eu.europa.ec.fisheries.wsdl.asset.source.GetAssetRequest;
import eu.europa.ec.fisheries.wsdl.asset.source.PingRequest;
import eu.europa.ec.fisheries.wsdl.asset.source.UpdateAssetRequest;
import eu.europa.ec.fisheries.wsdl.asset.source.UpsertAssetRequest;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * <p>Java class for AssetDataSourceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssetDataSourceRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="method" type="{types.asset.wsdl.fisheries.ec.europa.eu}AssetDataSourceMethod"/&gt;
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetDataSourceRequest", propOrder = {
    "method",
    "username"
})
@XmlSeeAlso({
    UpsertFishingGearRequest.class,
    FishingGearByExternalIdRequest.class,
    FishingGearByIdRequest.class,
    FishingGearListRequest.class,
    AssetHistoryListByAssetIdRequest.class,
    GetAssetHistoryRequest.class,
    AssetListGroupByFlagStateRequest.class,
    PingRequest.class,
    AssetListRequest.class,
    UpsertAssetRequest.class,
    UpdateAssetRequest.class,
    CreateAssetRequest.class,
    DeleteAssetRequest.class,
    GetAssetRequest.class,
    ConfigRequest.class
})
public abstract class AssetDataSourceRequest
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected AssetDataSourceMethod method;
    @XmlElement(required = true)
    protected String username;

    /**
     * Gets the value of the method property.
     * 
     * @return
     *     possible object is
     *     {@link AssetDataSourceMethod }
     *     
     */
    public AssetDataSourceMethod getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetDataSourceMethod }
     *     
     */
    public void setMethod(AssetDataSourceMethod value) {
        this.method = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
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
