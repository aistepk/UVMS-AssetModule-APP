
package eu.europa.ec.fisheries.wsdl.asset.config;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfigField.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ConfigField"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ALL"/&gt;
 *     &lt;enumeration value="FLAG_STATE"/&gt;
 *     &lt;enumeration value="UNIT_LENGTH"/&gt;
 *     &lt;enumeration value="UNIT_TONNAGE"/&gt;
 *     &lt;enumeration value="ASSET_TYPE"/&gt;
 *     &lt;enumeration value="LICENSE_TYPE"/&gt;
 *     &lt;enumeration value="GEAR_TYPE"/&gt;
 *     &lt;enumeration value="SPAN_LENGTH_LOA"/&gt;
 *     &lt;enumeration value="SPAN_POWER_MAIN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ConfigField")
@XmlEnum
public enum ConfigField {

    ALL,
    FLAG_STATE,
    UNIT_LENGTH,
    UNIT_TONNAGE,
    ASSET_TYPE,
    LICENSE_TYPE,
    GEAR_TYPE,
    SPAN_LENGTH_LOA,
    SPAN_POWER_MAIN;

    public String value() {
        return name();
    }

    public static ConfigField fromValue(String v) {
        return valueOf(v);
    }

}
