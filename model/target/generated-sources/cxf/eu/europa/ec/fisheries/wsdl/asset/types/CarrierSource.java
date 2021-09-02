
package eu.europa.ec.fisheries.wsdl.asset.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarrierSource.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CarrierSource"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INTERNAL"/&gt;
 *     &lt;enumeration value="NATIONAL"/&gt;
 *     &lt;enumeration value="XEU"/&gt;
 *     &lt;enumeration value="THIRD_COUNTRY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CarrierSource")
@XmlEnum
public enum CarrierSource {

    INTERNAL,
    NATIONAL,
    XEU,
    THIRD_COUNTRY;

    public String value() {
        return name();
    }

    public static CarrierSource fromValue(String v) {
        return valueOf(v);
    }

}
