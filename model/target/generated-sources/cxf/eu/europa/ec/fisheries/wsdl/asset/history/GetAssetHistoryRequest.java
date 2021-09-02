
package eu.europa.ec.fisheries.wsdl.asset.history;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import eu.europa.ec.fisheries.wsdl.asset.types.AssetDataSourceRequest;
import eu.europa.ec.fisheries.wsdl.asset.types.AssetHistoryId;
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
 *         &lt;element name="id" type="{types.asset.wsdl.fisheries.ec.europa.eu}AssetHistoryId"/&gt;
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
@XmlRootElement(name = "GetAssetHistoryRequest")
public class GetAssetHistoryRequest
    extends AssetDataSourceRequest
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected AssetHistoryId id;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link AssetHistoryId }
     *     
     */
    public AssetHistoryId getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetHistoryId }
     *     
     */
    public void setId(AssetHistoryId value) {
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
