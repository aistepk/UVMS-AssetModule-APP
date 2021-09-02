
package eu.europa.ec.fisheries.schema.mobileterminal.polltypes.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PollType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PollType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PROGRAM_POLL"/&gt;
 *     &lt;enumeration value="SAMPLING_POLL"/&gt;
 *     &lt;enumeration value="MANUAL_POLL"/&gt;
 *     &lt;enumeration value="CONFIGURATION_POLL"/&gt;
 *     &lt;enumeration value="AUTOMATIC_POLL"/&gt;
 *     &lt;enumeration value="BASE_POLL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PollType")
@XmlEnum
public enum PollType {

    PROGRAM_POLL,
    SAMPLING_POLL,
    MANUAL_POLL,
    CONFIGURATION_POLL,
    AUTOMATIC_POLL,
    BASE_POLL;

    public String value() {
        return name();
    }

    public static PollType fromValue(String v) {
        return valueOf(v);
    }

}
