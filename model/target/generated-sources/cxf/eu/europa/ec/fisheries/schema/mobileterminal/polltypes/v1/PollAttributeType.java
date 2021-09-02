
package eu.europa.ec.fisheries.schema.mobileterminal.polltypes.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PollAttributeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PollAttributeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FREQUENCY"/&gt;
 *     &lt;enumeration value="START_DATE"/&gt;
 *     &lt;enumeration value="END_DATE"/&gt;
 *     &lt;enumeration value="REPORT_FREQUENCY"/&gt;
 *     &lt;enumeration value="GRACE_PERIOD"/&gt;
 *     &lt;enumeration value="IN_PORT_GRACE"/&gt;
 *     &lt;enumeration value="DNID"/&gt;
 *     &lt;enumeration value="MEMBER_NUMBER"/&gt;
 *     &lt;enumeration value="USER"/&gt;
 *     &lt;enumeration value="PROGRAM_RUNNING"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PollAttributeType")
@XmlEnum
public enum PollAttributeType {

    FREQUENCY,
    START_DATE,
    END_DATE,
    REPORT_FREQUENCY,
    GRACE_PERIOD,
    IN_PORT_GRACE,
    DNID,
    MEMBER_NUMBER,
    USER,
    PROGRAM_RUNNING;

    public String value() {
        return name();
    }

    public static PollAttributeType fromValue(String v) {
        return valueOf(v);
    }

}
