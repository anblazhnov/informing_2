
package ru.iflex.esb.informing.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;


/**
 * <p>Java class for AlarmInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlarmInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AlarmName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AlarmMessage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlarmInfo", propOrder = {
    "alarmName",
    "alarmMessage"
})
public class AlarmInfo
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "AlarmName", required = true)
    protected String alarmName;
    @XmlElement(name = "AlarmMessage", required = true)
    protected String alarmMessage;

    /**
     * Gets the value of the alarmName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlarmName() {
        return alarmName;
    }

    /**
     * Sets the value of the alarmName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlarmName(String value) {
        this.alarmName = value;
    }

    /**
     * Gets the value of the alarmMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlarmMessage() {
        return alarmMessage;
    }

    /**
     * Sets the value of the alarmMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlarmMessage(String value) {
        this.alarmMessage = value;
    }

}
