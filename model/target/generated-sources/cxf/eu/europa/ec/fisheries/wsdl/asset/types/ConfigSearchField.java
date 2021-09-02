
package eu.europa.ec.fisheries.wsdl.asset.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfigSearchField.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ConfigSearchField"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FLAG_STATE"/&gt;
 *     &lt;enumeration value="EXTERNAL_MARKING"/&gt;
 *     &lt;enumeration value="NAME"/&gt;
 *     &lt;enumeration value="IRCS"/&gt;
 *     &lt;enumeration value="CFR"/&gt;
 *     &lt;enumeration value="MMSI"/&gt;
 *     &lt;enumeration value="GUID"/&gt;
 *     &lt;enumeration value="HIST_GUID"/&gt;
 *     &lt;enumeration value="ICCAT"/&gt;
 *     &lt;enumeration value="UVI"/&gt;
 *     &lt;enumeration value="GFCM"/&gt;
 *     &lt;enumeration value="HOMEPORT"/&gt;
 *     &lt;enumeration value="ASSET_TYPE"/&gt;
 *     &lt;enumeration value="LICENSE_TYPE"/&gt;
 *     &lt;enumeration value="PRODUCER_NAME"/&gt;
 *     &lt;enumeration value="IMO"/&gt;
 *     &lt;enumeration value="GEAR_TYPE"/&gt;
 *     &lt;enumeration value="LENGTH_OVER_ALL"/&gt;
 *     &lt;enumeration value="ENGINE_POWER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ConfigSearchField")
@XmlEnum
public enum ConfigSearchField {

    FLAG_STATE,
    EXTERNAL_MARKING,
    NAME,
    IRCS,
    CFR,
    MMSI,
    GUID,
    HIST_GUID,
    ICCAT,
    UVI,
    GFCM,
    HOMEPORT,
    ASSET_TYPE,
    LICENSE_TYPE,
    PRODUCER_NAME,
    IMO,
    GEAR_TYPE,
    LENGTH_OVER_ALL,
    ENGINE_POWER;

    public String value() {
        return name();
    }

    public static ConfigSearchField fromValue(String v) {
        return valueOf(v);
    }

}
