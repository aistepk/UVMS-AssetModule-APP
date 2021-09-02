
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
 * <p>Java class for FishingGear complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FishingGear"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="externalId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="fishingGearType" type="{types.asset.wsdl.fisheries.ec.europa.eu}FishingGearType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FishingGear", propOrder = {
    "id",
    "name",
    "code",
    "description",
    "externalId",
    "fishingGearType"
})
public class FishingGear
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected long id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String code;
    @XmlElement(required = true)
    protected String description;
    protected long externalId;
    @XmlElement(required = true)
    protected FishingGearType fishingGearType;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the externalId property.
     * 
     */
    public long getExternalId() {
        return externalId;
    }

    /**
     * Sets the value of the externalId property.
     * 
     */
    public void setExternalId(long value) {
        this.externalId = value;
    }

    /**
     * Gets the value of the fishingGearType property.
     * 
     * @return
     *     possible object is
     *     {@link FishingGearType }
     *     
     */
    public FishingGearType getFishingGearType() {
        return fishingGearType;
    }

    /**
     * Sets the value of the fishingGearType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FishingGearType }
     *     
     */
    public void setFishingGearType(FishingGearType value) {
        this.fishingGearType = value;
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
