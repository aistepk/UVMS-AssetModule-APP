
package eu.europa.ec.fisheries.wsdl.asset.types;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * <p>Java class for Asset complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Asset"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="assetId" type="{types.asset.wsdl.fisheries.ec.europa.eu}AssetId"/&gt;
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="source" type="{types.asset.wsdl.fisheries.ec.europa.eu}CarrierSource"/&gt;
 *         &lt;element name="eventHistory" type="{types.asset.wsdl.fisheries.ec.europa.eu}AssetHistoryId" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gearType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hasIrcs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ircs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="externalMarking" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cfr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="imo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mmsiNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hasLicense" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="licenseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="homePort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lengthOverAll" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="lengthBetweenPerpendiculars" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="grossTonnage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="grossTonnageUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="otherGrossTonnage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="safetyGrossTonnage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="powerMain" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="powerAux" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="producer" type="{types.asset.wsdl.fisheries.ec.europa.eu}AssetProdOrgModel" minOccurs="0"/&gt;
 *         &lt;element name="contact" type="{types.asset.wsdl.fisheries.ec.europa.eu}AssetContact" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="notes" type="{types.asset.wsdl.fisheries.ec.europa.eu}AssetNotes" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="iccat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="uvi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gfcm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Asset", propOrder = {
    "assetId",
    "active",
    "source",
    "eventHistory",
    "name",
    "countryCode",
    "gearType",
    "hasIrcs",
    "ircs",
    "externalMarking",
    "cfr",
    "imo",
    "mmsiNo",
    "hasLicense",
    "licenseType",
    "homePort",
    "lengthOverAll",
    "lengthBetweenPerpendiculars",
    "grossTonnage",
    "grossTonnageUnit",
    "otherGrossTonnage",
    "safetyGrossTonnage",
    "powerMain",
    "powerAux",
    "producer",
    "contact",
    "notes",
    "iccat",
    "uvi",
    "gfcm"
})
public class Asset
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected AssetId assetId;
    protected boolean active;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CarrierSource source;
    protected AssetHistoryId eventHistory;
    protected String name;
    protected String countryCode;
    protected String gearType;
    protected String hasIrcs;
    protected String ircs;
    protected String externalMarking;
    protected String cfr;
    protected String imo;
    protected String mmsiNo;
    protected boolean hasLicense;
    protected String licenseType;
    protected String homePort;
    protected BigDecimal lengthOverAll;
    protected BigDecimal lengthBetweenPerpendiculars;
    protected BigDecimal grossTonnage;
    protected String grossTonnageUnit;
    protected BigDecimal otherGrossTonnage;
    protected BigDecimal safetyGrossTonnage;
    protected BigDecimal powerMain;
    protected BigDecimal powerAux;
    protected AssetProdOrgModel producer;
    protected List<AssetContact> contact;
    protected List<AssetNotes> notes;
    protected String iccat;
    protected String uvi;
    protected String gfcm;

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
     * Gets the value of the active property.
     * 
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     */
    public void setActive(boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierSource }
     *     
     */
    public CarrierSource getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierSource }
     *     
     */
    public void setSource(CarrierSource value) {
        this.source = value;
    }

    /**
     * Gets the value of the eventHistory property.
     * 
     * @return
     *     possible object is
     *     {@link AssetHistoryId }
     *     
     */
    public AssetHistoryId getEventHistory() {
        return eventHistory;
    }

    /**
     * Sets the value of the eventHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetHistoryId }
     *     
     */
    public void setEventHistory(AssetHistoryId value) {
        this.eventHistory = value;
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
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the gearType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGearType() {
        return gearType;
    }

    /**
     * Sets the value of the gearType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGearType(String value) {
        this.gearType = value;
    }

    /**
     * Gets the value of the hasIrcs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasIrcs() {
        return hasIrcs;
    }

    /**
     * Sets the value of the hasIrcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasIrcs(String value) {
        this.hasIrcs = value;
    }

    /**
     * Gets the value of the ircs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIrcs() {
        return ircs;
    }

    /**
     * Sets the value of the ircs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIrcs(String value) {
        this.ircs = value;
    }

    /**
     * Gets the value of the externalMarking property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalMarking() {
        return externalMarking;
    }

    /**
     * Sets the value of the externalMarking property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalMarking(String value) {
        this.externalMarking = value;
    }

    /**
     * Gets the value of the cfr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCfr() {
        return cfr;
    }

    /**
     * Sets the value of the cfr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCfr(String value) {
        this.cfr = value;
    }

    /**
     * Gets the value of the imo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImo() {
        return imo;
    }

    /**
     * Sets the value of the imo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImo(String value) {
        this.imo = value;
    }

    /**
     * Gets the value of the mmsiNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMmsiNo() {
        return mmsiNo;
    }

    /**
     * Sets the value of the mmsiNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMmsiNo(String value) {
        this.mmsiNo = value;
    }

    /**
     * Gets the value of the hasLicense property.
     * 
     */
    public boolean isHasLicense() {
        return hasLicense;
    }

    /**
     * Sets the value of the hasLicense property.
     * 
     */
    public void setHasLicense(boolean value) {
        this.hasLicense = value;
    }

    /**
     * Gets the value of the licenseType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseType() {
        return licenseType;
    }

    /**
     * Sets the value of the licenseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseType(String value) {
        this.licenseType = value;
    }

    /**
     * Gets the value of the homePort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePort() {
        return homePort;
    }

    /**
     * Sets the value of the homePort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePort(String value) {
        this.homePort = value;
    }

    /**
     * Gets the value of the lengthOverAll property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLengthOverAll() {
        return lengthOverAll;
    }

    /**
     * Sets the value of the lengthOverAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLengthOverAll(BigDecimal value) {
        this.lengthOverAll = value;
    }

    /**
     * Gets the value of the lengthBetweenPerpendiculars property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLengthBetweenPerpendiculars() {
        return lengthBetweenPerpendiculars;
    }

    /**
     * Sets the value of the lengthBetweenPerpendiculars property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLengthBetweenPerpendiculars(BigDecimal value) {
        this.lengthBetweenPerpendiculars = value;
    }

    /**
     * Gets the value of the grossTonnage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrossTonnage() {
        return grossTonnage;
    }

    /**
     * Sets the value of the grossTonnage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGrossTonnage(BigDecimal value) {
        this.grossTonnage = value;
    }

    /**
     * Gets the value of the grossTonnageUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrossTonnageUnit() {
        return grossTonnageUnit;
    }

    /**
     * Sets the value of the grossTonnageUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrossTonnageUnit(String value) {
        this.grossTonnageUnit = value;
    }

    /**
     * Gets the value of the otherGrossTonnage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOtherGrossTonnage() {
        return otherGrossTonnage;
    }

    /**
     * Sets the value of the otherGrossTonnage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOtherGrossTonnage(BigDecimal value) {
        this.otherGrossTonnage = value;
    }

    /**
     * Gets the value of the safetyGrossTonnage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSafetyGrossTonnage() {
        return safetyGrossTonnage;
    }

    /**
     * Sets the value of the safetyGrossTonnage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSafetyGrossTonnage(BigDecimal value) {
        this.safetyGrossTonnage = value;
    }

    /**
     * Gets the value of the powerMain property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPowerMain() {
        return powerMain;
    }

    /**
     * Sets the value of the powerMain property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPowerMain(BigDecimal value) {
        this.powerMain = value;
    }

    /**
     * Gets the value of the powerAux property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPowerAux() {
        return powerAux;
    }

    /**
     * Sets the value of the powerAux property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPowerAux(BigDecimal value) {
        this.powerAux = value;
    }

    /**
     * Gets the value of the producer property.
     * 
     * @return
     *     possible object is
     *     {@link AssetProdOrgModel }
     *     
     */
    public AssetProdOrgModel getProducer() {
        return producer;
    }

    /**
     * Sets the value of the producer property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetProdOrgModel }
     *     
     */
    public void setProducer(AssetProdOrgModel value) {
        this.producer = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssetContact }
     * 
     * 
     */
    public List<AssetContact> getContact() {
        if (contact == null) {
            contact = new ArrayList<AssetContact>();
        }
        return this.contact;
    }

    /**
     * Gets the value of the notes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssetNotes }
     * 
     * 
     */
    public List<AssetNotes> getNotes() {
        if (notes == null) {
            notes = new ArrayList<AssetNotes>();
        }
        return this.notes;
    }

    /**
     * Gets the value of the iccat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIccat() {
        return iccat;
    }

    /**
     * Sets the value of the iccat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIccat(String value) {
        this.iccat = value;
    }

    /**
     * Gets the value of the uvi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUvi() {
        return uvi;
    }

    /**
     * Sets the value of the uvi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUvi(String value) {
        this.uvi = value;
    }

    /**
     * Gets the value of the gfcm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGfcm() {
        return gfcm;
    }

    /**
     * Sets the value of the gfcm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGfcm(String value) {
        this.gfcm = value;
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
