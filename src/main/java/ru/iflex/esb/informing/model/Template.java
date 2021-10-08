
package ru.iflex.esb.informing.model;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


/**
 * <p>Java class for Template complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Template"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TemplateId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TempalteName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TempalteDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ChannelId" type="{http://informing.nsc.ru/}ChannelType"/&gt;
 *         &lt;element name="TemplateText" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SubjectTypeID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Attachments" type="{http://informing.nsc.ru/}Attachment" minOccurs="0"/&gt;
 *         &lt;element name="GroupId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Template", propOrder = {
    "templateId",
    "tempalteName",
    "tempalteDescription",
    "channelId",
    "templateText",
    "subjectTypeID",
    "attachments",
    "groupId"
})
public class Template
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "TemplateId", required = true)
    protected String templateId;
    @XmlElement(name = "TempalteName", required = true)
    protected String tempalteName;
    @XmlElement(name = "TempalteDescription", required = true)
    protected String tempalteDescription;
    @XmlElement(name = "ChannelId", required = true)
    @XmlSchemaType(name = "string")
    protected ChannelType channelId;
    @XmlElement(name = "TemplateText", required = true)
    protected String templateText;
    @XmlElement(name = "SubjectTypeID", required = true)
    protected String subjectTypeID;
    @XmlElement(name = "Attachments")
    protected Attachment attachments;
    @XmlElement(name = "GroupId")
    protected Integer groupId;

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
     * Gets the value of the tempalteName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTempalteName() {
        return tempalteName;
    }

    /**
     * Sets the value of the tempalteName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempalteName(String value) {
        this.tempalteName = value;
    }

    /**
     * Gets the value of the tempalteDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTempalteDescription() {
        return tempalteDescription;
    }

    /**
     * Sets the value of the tempalteDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempalteDescription(String value) {
        this.tempalteDescription = value;
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
     * Gets the value of the templateText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateText() {
        return templateText;
    }

    /**
     * Sets the value of the templateText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateText(String value) {
        this.templateText = value;
    }

    /**
     * Gets the value of the subjectTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectTypeID() {
        return subjectTypeID;
    }

    /**
     * Sets the value of the subjectTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectTypeID(String value) {
        this.subjectTypeID = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link Attachment }
     *     
     */
    public Attachment getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Attachment }
     *     
     */
    public void setAttachments(Attachment value) {
        this.attachments = value;
    }

    /**
     * Gets the value of the groupId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGroupId() {
        return groupId;
    }

    /**
     * Sets the value of the groupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGroupId(Integer value) {
        this.groupId = value;
    }

}
