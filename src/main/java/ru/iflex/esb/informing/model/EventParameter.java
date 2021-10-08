
package ru.iflex.esb.informing.model;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;
import java.util.Calendar;


/**
 * <p>Java class for EventParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventParameter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ParameterId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ParameterName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ParameterType" type="{http://informing.nsc.ru/}ParameterType"/&gt;
 *         &lt;element name="ValueString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ValueFloat" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ValueInt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ValueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventParameter", propOrder = {
    "parameterId",
    "parameterName",
    "parameterType",
    "valueString",
    "valueFloat",
    "valueInt",
    "valueDate"
})
public class EventParameter
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ParameterId", required = true)
    protected String parameterId;
    @XmlElement(name = "ParameterName", required = true)
    protected String parameterName;
    @XmlElement(name = "ParameterType", required = true)
    @XmlSchemaType(name = "string")
    protected ParameterType parameterType;
    @XmlElement(name = "ValueString")
    protected String valueString;
    @XmlElement(name = "ValueFloat")
    protected Double valueFloat;
    @XmlElement(name = "ValueInt")
    protected Integer valueInt;
    @XmlElement(name = "ValueDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar valueDate;

    /**
     * Gets the value of the parameterId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParameterId() {
        return parameterId;
    }

    /**
     * Sets the value of the parameterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParameterId(String value) {
        this.parameterId = value;
    }

    /**
     * Gets the value of the parameterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParameterName() {
        return parameterName;
    }

    /**
     * Sets the value of the parameterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParameterName(String value) {
        this.parameterName = value;
    }

    /**
     * Gets the value of the parameterType property.
     * 
     * @return
     *     possible object is
     *     {@link ParameterType }
     *     
     */
    public ParameterType getParameterType() {
        return parameterType;
    }

    /**
     * Sets the value of the parameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterType }
     *     
     */
    public void setParameterType(ParameterType value) {
        this.parameterType = value;
    }

    /**
     * Gets the value of the valueString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueString() {
        return valueString;
    }

    /**
     * Sets the value of the valueString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueString(String value) {
        this.valueString = value;
    }

    /**
     * Gets the value of the valueFloat property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValueFloat() {
        return valueFloat;
    }

    /**
     * Sets the value of the valueFloat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValueFloat(Double value) {
        this.valueFloat = value;
    }

    /**
     * Gets the value of the valueInt property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValueInt() {
        return valueInt;
    }

    /**
     * Sets the value of the valueInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValueInt(Integer value) {
        this.valueInt = value;
    }

    /**
     * Gets the value of the valueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getValueDate() {
        return valueDate;
    }

    /**
     * Sets the value of the valueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueDate(Calendar value) {
        this.valueDate = value;
    }

}
