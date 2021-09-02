
package eu.europa.ec.fisheries.schema.mobileterminal.types.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchKey.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SearchKey"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CONNECT_ID"/&gt;
 *     &lt;enumeration value="SERIAL_NUMBER"/&gt;
 *     &lt;enumeration value="MEMBER_NUMBER"/&gt;
 *     &lt;enumeration value="DNID"/&gt;
 *     &lt;enumeration value="SATELLITE_NUMBER"/&gt;
 *     &lt;enumeration value="TRANSPONDER_TYPE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SearchKey")
@XmlEnum
public enum SearchKey {

    CONNECT_ID,
    SERIAL_NUMBER,
    MEMBER_NUMBER,
    DNID,
    SATELLITE_NUMBER,
    TRANSPONDER_TYPE;

    public String value() {
        return name();
    }

    public static SearchKey fromValue(String v) {
        return valueOf(v);
    }

}
