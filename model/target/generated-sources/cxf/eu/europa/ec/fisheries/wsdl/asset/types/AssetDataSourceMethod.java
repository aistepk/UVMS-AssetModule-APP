
package eu.europa.ec.fisheries.wsdl.asset.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetDataSourceMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="AssetDataSourceMethod"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CREATE"/&gt;
 *     &lt;enumeration value="UPDATE"/&gt;
 *     &lt;enumeration value="GET"/&gt;
 *     &lt;enumeration value="LIST"/&gt;
 *     &lt;enumeration value="UPSERT"/&gt;
 *     &lt;enumeration value="DELETE"/&gt;
 *     &lt;enumeration value="HISTORY_GET"/&gt;
 *     &lt;enumeration value="HISTORY_LIST"/&gt;
 *     &lt;enumeration value="GROUP_GET"/&gt;
 *     &lt;enumeration value="LIST_GET_BY_GROUP"/&gt;
 *     &lt;enumeration value="GROUP_CREATE"/&gt;
 *     &lt;enumeration value="GROUP_UPDATE"/&gt;
 *     &lt;enumeration value="GROUP_LIST"/&gt;
 *     &lt;enumeration value="GROUP_DELETE"/&gt;
 *     &lt;enumeration value="PING"/&gt;
 *     &lt;enumeration value="CONFIG"/&gt;
 *     &lt;enumeration value="GROUP_LIST_BY_ASSET_GUID"/&gt;
 *     &lt;enumeration value="ASSET_LIST_GROUP_BY_FLAGSTATE"/&gt;
 *     &lt;enumeration value="FISHING_GEAR_LIST"/&gt;
 *     &lt;enumeration value="FISHING_GEAR_BY_ID"/&gt;
 *     &lt;enumeration value="FISHING_GEAR_BY_EXT_ID"/&gt;
 *     &lt;enumeration value="FISHING_GEAR_UPSERT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AssetDataSourceMethod")
@XmlEnum
public enum AssetDataSourceMethod {

    CREATE,
    UPDATE,
    GET,
    LIST,
    UPSERT,
    DELETE,
    HISTORY_GET,
    HISTORY_LIST,
    GROUP_GET,
    LIST_GET_BY_GROUP,
    GROUP_CREATE,
    GROUP_UPDATE,
    GROUP_LIST,
    GROUP_DELETE,
    PING,
    CONFIG,
    GROUP_LIST_BY_ASSET_GUID,
    ASSET_LIST_GROUP_BY_FLAGSTATE,
    FISHING_GEAR_LIST,
    FISHING_GEAR_BY_ID,
    FISHING_GEAR_BY_EXT_ID,
    FISHING_GEAR_UPSERT;

    public String value() {
        return name();
    }

    public static AssetDataSourceMethod fromValue(String v) {
        return valueOf(v);
    }

}
