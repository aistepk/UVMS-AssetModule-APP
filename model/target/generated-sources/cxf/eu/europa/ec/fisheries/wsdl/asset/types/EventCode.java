
package eu.europa.ec.fisheries.wsdl.asset.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="EventCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CEN"/&gt;
 *     &lt;enumeration value="CST"/&gt;
 *     &lt;enumeration value="CHA"/&gt;
 *     &lt;enumeration value="IMP"/&gt;
 *     &lt;enumeration value="MOD"/&gt;
 *     &lt;enumeration value="DES"/&gt;
 *     &lt;enumeration value="RET"/&gt;
 *     &lt;enumeration value="EXP"/&gt;
 *     &lt;enumeration value="UNK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EventCode")
@XmlEnum
public enum EventCode {

    CEN,
    CST,
    CHA,
    IMP,
    MOD,
    DES,
    RET,
    EXP,
    UNK;

    public String value() {
        return name();
    }

    public static EventCode fromValue(String v) {
        return valueOf(v);
    }

}
