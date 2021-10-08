
package ru.iflex.esb.informing.model;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for SendMessageByTemplateRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendMessageByTemplateRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubjectTypeId" type="{http://informing.nsc.ru/}SubjectType"/&gt;
 *         &lt;element name="SubjectId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RecipientNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TemplateId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ChannelId" type="{http://informing.nsc.ru/}ChannelType"/&gt;
 *         &lt;element name="Parameters" type="{http://informing.nsc.ru/}EventParameter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendMessageByTemplateRequest", propOrder = {
    "subjectTypeId",
    "subjectId",
    "recipientNumber",
    "templateId",
    "channelId",
    "parameters"
})
public class SendMessageByTemplateRequest
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "SubjectTypeId", required = true)
    @XmlSchemaType(name = "string")
    protected SubjectType subjectTypeId;
    @XmlElement(name = "SubjectId", required = true)
    protected String subjectId;
    @XmlElement(name = "RecipientNumber", required = true)
    protected String recipientNumber;
    @XmlElement(name = "TemplateId", required = true)
    protected String templateId;
    @XmlElement(name = "ChannelId", required = true)
    @XmlSchemaType(name = "string")
    protected ChannelType channelId;
    @XmlElement(name = "Parameters")
    protected List<EventParameter> parameters;

    /**
     * Gets the value of the subjectTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectType }
     *     
     */
    public SubjectType getSubjectTypeId() {
        return subjectTypeId;
    }

    /**
     * Sets the value of the subjectTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectType }
     *     
     */
    public void setSubjectTypeId(SubjectType value) {
        this.subjectTypeId = value;
    }

    /**
     * Gets the value of the subjectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectId() {
        return subjectId;
    }

    /**
     * Sets the value of the subjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectId(String value) {
        this.subjectId = value;
    }

    /**
     * Gets the value of the recipientNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientNumber() {
        return recipientNumber;
    }

    /**
     * Sets the value of the recipientNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientNumber(String value) {
        this.recipientNumber = value;
    }

    /**
     * Gets the value of the templateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateId() {
        return templateId;
    }

    /**
     * Sets the value of the templateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateId(String value) {
        this.templateId = value;
    }

    /**
     * Gets the value of the channelId property.
     * 
     * @return
     *     possible object is
     *     {@link ChannelType }
     *     
     */
    public ChannelType getChannelId() {
        return channelId;
    }

    /**
     * Sets the value of the channelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChannelType }
     *     
     */
    public void setChannelId(ChannelType value) {
        this.channelId = value;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventParameter }
     * 
     * 
     */
    public List<EventParameter> getParameters() {
        if (parameters == null) {
            parameters = new ArrayList<EventParameter>();
        }
        return this.parameters;
    }

}
