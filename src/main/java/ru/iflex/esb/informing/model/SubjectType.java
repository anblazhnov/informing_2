
package ru.iflex.esb.informing.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubjectType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SubjectType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NoSubject"/&gt;
 *     &lt;enumeration value="Manager"/&gt;
 *     &lt;enumeration value="AbonentId"/&gt;
 *     &lt;enumeration value="AbonentAgreementNumber"/&gt;
 *     &lt;enumeration value="AbonentAgreementId"/&gt;
 *     &lt;enumeration value="DeviceId"/&gt;
 *     &lt;enumeration value="SmartCardId"/&gt;
 *     &lt;enumeration value="LegalCustomerId"/&gt;
 *     &lt;enumeration value="LegalCustomerAgreementId"/&gt;
 *     &lt;enumeration value="DeviceGroupId"/&gt;
 *     &lt;enumeration value="DealerId"/&gt;
 *     &lt;enumeration value="DealerAID"/&gt;
 *     &lt;enumeration value="PotentialLegalCustomerId"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SubjectType")
@XmlEnum
public enum SubjectType {

    @XmlEnumValue("NoSubject")
    NO_SUBJECT("NoSubject"),
    @XmlEnumValue("Manager")
    MANAGER("Manager"),
    @XmlEnumValue("AbonentId")
    ABONENT_ID("AbonentId"),
    @XmlEnumValue("AbonentAgreementNumber")
    ABONENT_AGREEMENT_NUMBER("AbonentAgreementNumber"),
    @XmlEnumValue("AbonentAgreementId")
    ABONENT_AGREEMENT_ID("AbonentAgreementId"),
    @XmlEnumValue("DeviceId")
    DEVICE_ID("DeviceId"),
    @XmlEnumValue("SmartCardId")
    SMART_CARD_ID("SmartCardId"),
    @XmlEnumValue("LegalCustomerId")
    LEGAL_CUSTOMER_ID("LegalCustomerId"),
    @XmlEnumValue("LegalCustomerAgreementId")
    LEGAL_CUSTOMER_AGREEMENT_ID("LegalCustomerAgreementId"),
    @XmlEnumValue("DeviceGroupId")
    DEVICE_GROUP_ID("DeviceGroupId"),
    @XmlEnumValue("DealerId")
    DEALER_ID("DealerId"),
    @XmlEnumValue("DealerAID")
    DEALER_AID("DealerAID"),
    @XmlEnumValue("PotentialLegalCustomerId")
    POTENTIAL_LEGAL_CUSTOMER_ID("PotentialLegalCustomerId");
    private final String value;

    SubjectType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SubjectType fromValue(String v) {
        for (SubjectType c: SubjectType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
