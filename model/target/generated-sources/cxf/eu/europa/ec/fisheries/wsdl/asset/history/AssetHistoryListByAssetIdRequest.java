
package eu.europa.ec.fisheries.wsdl.asset.history;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import eu.europa.ec.fisheries.wsdl.asset.types.AssetDataSourceRequest;
import eu.europa.ec.fisheries.wsdl.asset.types.AssetId;
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
 *     &lt;extension base="{types.asset.wsdl.fisheries.ec.europa.eu}AssetDataSourceRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="assetId" type="{types.asset.wsdl.fisheries.ec.europa.eu}AssetId"/&gt;
 *         &lt;element name="maxNbr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "assetId",
    "maxNbr"
})
@XmlRootElement(name = "AssetHistoryListByAssetIdRequest")
public class AssetHistoryListByAssetIdRequest
    extends AssetDataSourceRequest
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected AssetId assetId;
    protected Integer maxNbr;

    /**
     * Gets the value of the assetId property.
     * 
     * @return
     *     possible object is
     *     {@link AssetId }
     *     
     */
    public AssetId getAssetId() {
        return assetId;
    }

    /**
     * Sets the value of the assetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetId }
     *     
     */
    public void setAssetId(AssetId value) {
        this.assetId = value;
    }

    /**
     * Gets the value of the maxNbr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxNbr() {
        return maxNbr;
    }

    /**
     * Sets the value of the maxNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxNbr(Integer value) {
        this.maxNbr = value;
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
