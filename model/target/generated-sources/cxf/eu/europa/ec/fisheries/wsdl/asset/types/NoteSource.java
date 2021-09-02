
package eu.europa.ec.fisheries.wsdl.asset.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NoteSource.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="NoteSource"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INTERNAL"/&gt;
 *     &lt;enumeration value="NATIONAL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NoteSource")
@XmlEnum
public enum NoteSource {

    INTERNAL,
    NATIONAL;

    public String value() {
        return name();
    }

    public static NoteSource fromValue(String v) {
        return valueOf(v);
    }

}
