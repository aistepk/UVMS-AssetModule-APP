
package eu.europa.ec.fisheries.schema.mobileterminal.types.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MobileTerminalDataSourceMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="MobileTerminalDataSourceMethod"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CREATE"/&gt;
 *     &lt;enumeration value="UPDATE"/&gt;
 *     &lt;enumeration value="GET"/&gt;
 *     &lt;enumeration value="LIST"/&gt;
 *     &lt;enumeration value="DELETE"/&gt;
 *     &lt;enumeration value="ASSIGN"/&gt;
 *     &lt;enumeration value="UNASSIGN"/&gt;
 *     &lt;enumeration value="UPSERT"/&gt;
 *     &lt;enumeration value="STATUS"/&gt;
 *     &lt;enumeration value="HISTORY_LIST"/&gt;
 *     &lt;enumeration value="TIMER"/&gt;
 *     &lt;enumeration value="CREATE_POLL"/&gt;
 *     &lt;enumeration value="POLL_PROGRAM_LIST"/&gt;
 *     &lt;enumeration value="POLL_PROGRAM_STATUS"/&gt;
 *     &lt;enumeration value="POLL_LIST"/&gt;
 *     &lt;enumeration value="POLLABLE_LIST"/&gt;
 *     &lt;enumeration value="UPDATED_DNID_LIST"/&gt;
 *     &lt;enumeration value="TERMINAL_SYSTEM_LIST"/&gt;
 *     &lt;enumeration value="COMCHANNELNAME"/&gt;
 *     &lt;enumeration value="CONFIG"/&gt;
 *     &lt;enumeration value="UPSERT_PLUGIN_LIST"/&gt;
 *     &lt;enumeration value="PING"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MobileTerminalDataSourceMethod")
@XmlEnum
public enum MobileTerminalDataSourceMethod {

    CREATE,
    UPDATE,
    GET,
    LIST,
    DELETE,
    ASSIGN,
    UNASSIGN,
    UPSERT,
    STATUS,
    HISTORY_LIST,
    TIMER,
    CREATE_POLL,
    POLL_PROGRAM_LIST,
    POLL_PROGRAM_STATUS,
    POLL_LIST,
    POLLABLE_LIST,
    UPDATED_DNID_LIST,
    TERMINAL_SYSTEM_LIST,
    COMCHANNELNAME,
    CONFIG,
    UPSERT_PLUGIN_LIST,
    PING;

    public String value() {
        return name();
    }

    public static MobileTerminalDataSourceMethod fromValue(String v) {
        return valueOf(v);
    }

}
