
package ru.iflex.esb.informing.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChannelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChannelType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Selfcare"/&gt;
 *     &lt;enumeration value="EMail"/&gt;
 *     &lt;enumeration value="SMS"/&gt;
 *     &lt;enumeration value="TVMail"/&gt;
 *     &lt;enumeration value="InfoCAS"/&gt;
 *     &lt;enumeration value="Statistics"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ChannelType")
@XmlEnum
public enum ChannelType {

    @XmlEnumValue("Selfcare")
    SELFCARE("Selfcare"),
    @XmlEnumValue("EMail")
    E_MAIL("EMail"),
    SMS("SMS"),
    @XmlEnumValue("TVMail")
    TV_MAIL("TVMail"),
    @XmlEnumValue("InfoCAS")
    INFO_CAS("InfoCAS"),
    @XmlEnumValue("Statistics")
    STATISTICS("Statistics");
    private final String value;

    ChannelType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChannelType fromValue(String v) {
        for (ChannelType c: ChannelType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
