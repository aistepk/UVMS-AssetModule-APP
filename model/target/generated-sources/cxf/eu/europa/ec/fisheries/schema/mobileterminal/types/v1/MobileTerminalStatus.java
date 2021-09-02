
package eu.europa.ec.fisheries.schema.mobileterminal.types.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MobileTerminalStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="MobileTerminalStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACTIVE"/&gt;
 *     &lt;enumeration value="INACTIVE"/&gt;
 *     &lt;enumeration value="ARCHIVE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MobileTerminalStatus")
@XmlEnum
public enum MobileTerminalStatus {

    ACTIVE,
    INACTIVE,
    ARCHIVE;

    public String value() {
        return name();
    }

    public static MobileTerminalStatus fromValue(String v) {
        return valueOf(v);
    }

}
