
package eu.europa.ec.fisheries.schema.mobileterminal.types.v1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.w3._2001.xmlschema.Adapter1;


/**
 * <p>Java class for ComChannelHistoryAttributes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComChannelHistoryAttributes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="eventCode" type="{urn:types.mobileterminal.schema.fisheries.ec.europa.eu:v1}EventCode"/&gt;
 *         &lt;element name="changeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="attributes" type="{urn:types.mobileterminal.schema.fisheries.ec.europa.eu:v1}ComChannelAttribute" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComChannelHistoryAttributes", propOrder = {
    "eventCode",
    "changeDate",
    "name",
    "attributes"
})
public class ComChannelHistoryAttributes
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected EventCode eventCode;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date changeDate;
    @XmlElement(required = true)
    protected String name;
    protected List<ComChannelAttribute> attributes;

    /**
     * Gets the value of the eventCode property.
     * 
     * @return
     *     possible object is
     *     {@link EventCode }
     *     
     */
    public EventCode getEventCode() {
        return eventCode;
    }

    /**
     * Sets the value of the eventCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventCode }
     *     
     */
    public void setEventCode(EventCode value) {
        this.eventCode = value;
    }

    /**
     * Gets the value of the changeDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getChangeDate() {
        return changeDate;
    }

    /**
     * Sets the value of the changeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeDate(Date value) {
        this.changeDate = value;
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
     * Gets the value of the attributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComChannelAttribute }
     * 
     * 
     */
    public List<ComChannelAttribute> getAttributes() {
        if (attributes == null) {
            attributes = new ArrayList<ComChannelAttribute>();
        }
        return this.attributes;
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
