
package eu.europa.ec.fisheries.wsdl.asset.module;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetModuleMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="AssetModuleMethod"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GET_ASSET"/&gt;
 *     &lt;enumeration value="ASSET_LIST"/&gt;
 *     &lt;enumeration value="ASSET_GROUP"/&gt;
 *     &lt;enumeration value="ASSET_LIST_BY_GROUP"/&gt;
 *     &lt;enumeration value="PING"/&gt;
 *     &lt;enumeration value="ASSET_GROUP_LIST_BY_ASSET_GUID"/&gt;
 *     &lt;enumeration value="ASSET_LIST_GROUP_BY_FLAGSTATE"/&gt;
 *     &lt;enumeration value="UPSERT_ASSET"/&gt;
 *     &lt;enumeration value="FISHING_GEAR_LIST"/&gt;
 *     &lt;enumeration value="FISHING_GEAR_BY_ID"/&gt;
 *     &lt;enumeration value="FISHING_GEAR_BY_EXT_ID"/&gt;
 *     &lt;enumeration value="FISHING_GEAR_UPSERT"/&gt;
 *     &lt;enumeration value="GET_FLAGSTATE_BY_ID_AND_DATE"/&gt;
 *     &lt;enumeration value="GET_ASSET_FROMASSETID_AND_DATE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AssetModuleMethod")
@XmlEnum
public enum AssetModuleMethod {

    GET_ASSET,
    ASSET_LIST,
    ASSET_GROUP,
    ASSET_LIST_BY_GROUP,
    PING,
    ASSET_GROUP_LIST_BY_ASSET_GUID,
    ASSET_LIST_GROUP_BY_FLAGSTATE,
    UPSERT_ASSET,
    FISHING_GEAR_LIST,
    FISHING_GEAR_BY_ID,
    FISHING_GEAR_BY_EXT_ID,
    FISHING_GEAR_UPSERT,
    GET_FLAGSTATE_BY_ID_AND_DATE,
    GET_ASSET_FROMASSETID_AND_DATE;

    public String value() {
        return name();
    }

    public static AssetModuleMethod fromValue(String v) {
        return valueOf(v);
    }

}
