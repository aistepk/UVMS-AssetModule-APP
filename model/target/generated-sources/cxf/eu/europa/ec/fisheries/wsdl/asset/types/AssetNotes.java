
package eu.europa.ec.fisheries.wsdl.asset.types;

import java.io.Serializable;
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
 * <p>Java class for AssetNotes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssetNotes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="activity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="readyDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="licenseHolder" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="contact" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sheetNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="notes" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="document" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="source" type="{types.asset.wsdl.fisheries.ec.europa.eu}NoteSource"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetNotes", propOrder = {
    "id",
    "date",
    "activity",
    "user",
    "readyDate",
    "licenseHolder",
    "contact",
    "sheetNumber",
    "notes",
    "document",
    "source"
})
public class AssetNotes
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String date;
    @XmlElement(required = true)
    protected String activity;
    @XmlElement(required = true)
    protected String user;
    @XmlElement(required = true)
    protected String readyDate;
    @XmlElement(required = true)
    protected String licenseHolder;
    @XmlElement(required = true)
    protected String contact;
    @XmlElement(required = true)
    protected String sheetNumber;
    @XmlElement(required = true)
    protected String notes;
    @XmlElement(required = true)
    protected String document;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected NoteSource source;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the activity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivity() {
        return activity;
    }

    /**
     * Sets the value of the activity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivity(String value) {
        this.activity = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

    /**
     * Gets the value of the readyDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReadyDate() {
        return readyDate;
    }

    /**
     * Sets the value of the readyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReadyDate(String value) {
        this.readyDate = value;
    }

    /**
     * Gets the value of the licenseHolder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseHolder() {
        return licenseHolder;
    }

    /**
     * Sets the value of the licenseHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseHolder(String value) {
        this.licenseHolder = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContact(String value) {
        this.contact = value;
    }

    /**
     * Gets the value of the sheetNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSheetNumber() {
        return sheetNumber;
    }

    /**
     * Sets the value of the sheetNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSheetNumber(String value) {
        this.sheetNumber = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the document property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocument(String value) {
        this.document = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link NoteSource }
     *     
     */
    public NoteSource getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoteSource }
     *     
     */
    public void setSource(NoteSource value) {
        this.source = value;
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
