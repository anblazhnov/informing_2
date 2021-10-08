
package ru.iflex.esb.informing.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InformingSystem.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InformingSystem"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Iflex"/&gt;
 *     &lt;enumeration value="SI2"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InformingSystem")
@XmlEnum
public enum InformingSystem {

    @XmlEnumValue("Iflex")
    IFLEX("Iflex"),
    @XmlEnumValue("SI2")
    SI_2("SI2");
    private final String value;

    InformingSystem(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InformingSystem fromValue(String v) {
        for (InformingSystem c: InformingSystem.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
