
package ru.iflex.esb.informing.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParameterType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ParameterType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="String"/&gt;
 *     &lt;enumeration value="Float"/&gt;
 *     &lt;enumeration value="Int"/&gt;
 *     &lt;enumeration value="Date"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParameterType")
@XmlEnum
public enum ParameterType {

    @XmlEnumValue("String")
    STRING("String"),
    @XmlEnumValue("Float")
    FLOAT("Float"),
    @XmlEnumValue("Int")
    INT("Int"),
    @XmlEnumValue("Date")
    DATE("Date");
    private final String value;

    ParameterType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParameterType fromValue(String v) {
        for (ParameterType c: ParameterType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
