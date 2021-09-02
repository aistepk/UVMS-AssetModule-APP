
package eu.europa.ec.fisheries.wsdl.asset.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetIdType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="AssetIdType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INTERNAL_ID"/&gt;
 *     &lt;enumeration value="CFR"/&gt;
 *     &lt;enumeration value="IRCS"/&gt;
 *     &lt;enumeration value="IMO"/&gt;
 *     &lt;enumeration value="MMSI"/&gt;
 *     &lt;enumeration value="GUID"/&gt;
 *     &lt;enumeration value="ICCAT"/&gt;
 *     &lt;enumeration value="UVI"/&gt;
 *     &lt;enumeration value="GFCM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AssetIdType")
@XmlEnum
public enum AssetIdType {

    INTERNAL_ID,
    CFR,
    IRCS,
    IMO,
    MMSI,
    GUID,
    ICCAT,
    UVI,
    GFCM;

    public String value() {
        return name();
    }

    public static AssetIdType fromValue(String v) {
        return valueOf(v);
    }

}
