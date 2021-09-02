
package eu.europa.ec.fisheries.schema.mobileterminal.polltypes.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProgramPollStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ProgramPollStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="STARTED"/&gt;
 *     &lt;enumeration value="STOPPED"/&gt;
 *     &lt;enumeration value="ARCHIVED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProgramPollStatus")
@XmlEnum
public enum ProgramPollStatus {

    STARTED,
    STOPPED,
    ARCHIVED;

    public String value() {
        return name();
    }

    public static ProgramPollStatus fromValue(String v) {
        return valueOf(v);
    }

}
