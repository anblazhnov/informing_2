
package ru.iflex.esb.informing.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for GetAlarmMessageResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAlarmMessageResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Alarms" type="{http://informing.nsc.ru/}AlarmInfo" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAlarmMessageResponse", propOrder = {
    "alarms"
})
public class GetAlarmMessageResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Alarms", required = true)
    protected List<AlarmInfo> alarms;

    /**
     * Gets the value of the alarms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alarms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlarms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlarmInfo }
     * 
     * 
     */
    public List<AlarmInfo> getAlarms() {
        if (alarms == null) {
            alarms = new ArrayList<AlarmInfo>();
        }
        return this.alarms;
    }

}
