
package eu.europa.ec.fisheries.schema.mobileterminal.module.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MobileTerminalModuleMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="MobileTerminalModuleMethod"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GET_MOBILE_TERMINAL"/&gt;
 *     &lt;enumeration value="PING"/&gt;
 *     &lt;enumeration value="LIST_MOBILE_TERMINALS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MobileTerminalModuleMethod")
@XmlEnum
public enum MobileTerminalModuleMethod {

    GET_MOBILE_TERMINAL,
    PING,
    LIST_MOBILE_TERMINALS;

    public String value() {
        return name();
    }

    public static MobileTerminalModuleMethod fromValue(String v) {
        return valueOf(v);
    }

}
