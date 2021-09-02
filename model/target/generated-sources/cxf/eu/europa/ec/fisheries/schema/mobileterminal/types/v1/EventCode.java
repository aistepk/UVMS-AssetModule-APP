
package eu.europa.ec.fisheries.schema.mobileterminal.types.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="EventCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CREATE"/&gt;
 *     &lt;enumeration value="MODIFY"/&gt;
 *     &lt;enumeration value="ACTIVATE"/&gt;
 *     &lt;enumeration value="INACTIVATE"/&gt;
 *     &lt;enumeration value="ARCHIVE"/&gt;
 *     &lt;enumeration value="LINK"/&gt;
 *     &lt;enumeration value="UNLINK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EventCode")
@XmlEnum
public enum EventCode {

    CREATE,
    MODIFY,
    ACTIVATE,
    INACTIVATE,
    ARCHIVE,
    LINK,
    UNLINK;

    public String value() {
        return name();
    }

    public static EventCode fromValue(String v) {
        return valueOf(v);
    }

}
