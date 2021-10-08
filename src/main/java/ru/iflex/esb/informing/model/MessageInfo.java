
package ru.iflex.esb.informing.model;


import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


/**
 * <p>Java class for MessageInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MessageId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MessageSubject" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MessageStatusId" type="{http://informing.nsc.ru/}MessageStatusType"/&gt;
 *         &lt;element name="EventTypeId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SubjectTypeId" type="{http://informing.nsc.ru/}SubjectType"/&gt;
 *         &lt;element name="SubjectId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ChannelTypeId" type="{http://informing.nsc.ru/}ChannelType"/&gt;
 *         &lt;element name="SendDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ReadDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Important" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Attachment" type="{http://informing.nsc.ru/}AttachmentInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageInfo", propOrder = {
    "messageId",
    "message",
    "messageSubject",
    "messageStatusId",
    "eventTypeId",
    "subjectTypeId",
    "subjectId",
    "channelTypeId",
    "sendDate",
    "readDate",
    "deliveryDate",
    "important",
    "attachment"
})
public class MessageInfo
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "MessageId", required = true)
    protected String messageId;
    @XmlElement(name = "Message", required = true)
    protected String message;
    @XmlElement(name = "MessageSubject", required = true)
    protected String messageSubject;
    @XmlElement(name = "MessageStatusId", required = true)
    @XmlSchemaType(name = "string")
    protected MessageStatusType messageStatusId;
    @XmlElement(name = "EventTypeId", required = true)
    protected String eventTypeId;
    @XmlElement(name = "SubjectTypeId", required = true)
    @XmlSchemaType(name = "string")
    protected SubjectType subjectTypeId;
    @XmlElement(name = "SubjectId", required = true)
    protected String subjectId;
    @XmlElement(name = "ChannelTypeId", required = true)
    @XmlSchemaType(name = "string")
    protected ChannelType channelTypeId;
    @XmlElement(name = "SendDate", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar sendDate;
    @XmlElement(name = "ReadDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar readDate;
    @XmlElement(name = "DeliveryDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar deliveryDate;
    @XmlElement(name = "Important")
    protected boolean important;
    @XmlElement(name = "Attachment")
    protected List<AttachmentInfo> attachment;

    /**
     * Gets the value of the messageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * Sets the value of the messageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageId(String value) {
        this.messageId = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the messageSubject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageSubject() {
        return messageSubject;
    }

    /**
     * Sets the value of the messageSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageSubject(String value) {
        this.messageSubject = value;
    }

    /**
     * Gets the value of the messageStatusId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageStatusType }
     *     
     */
    public MessageStatusType getMessageStatusId() {
        return messageStatusId;
    }

    /**
     * Sets the value of the messageStatusId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageStatusType }
     *     
     */
    public void setMessageStatusId(MessageStatusType value) {
        this.messageStatusId = value;
    }

    /**
     * Gets the value of the eventTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventTypeId() {
        return eventTypeId;
    }

    /**
     * Sets the value of the eventTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventTypeId(String value) {
        this.eventTypeId = value;
    }

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
     * Gets the value of the channelTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link ChannelType }
     *     
     */
    public ChannelType getChannelTypeId() {
        return channelTypeId;
    }

    /**
     * Sets the value of the channelTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChannelType }
     *     
     */
    public void setChannelTypeId(ChannelType value) {
        this.channelTypeId = value;
    }

    /**
     * Gets the value of the sendDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getSendDate() {
        return sendDate;
    }

    /**
     * Sets the value of the sendDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendDate(Calendar value) {
        this.sendDate = value;
    }

    /**
     * Gets the value of the readDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getReadDate() {
        return readDate;
    }

    /**
     * Sets the value of the readDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReadDate(Calendar value) {
        this.readDate = value;
    }

    /**
     * Gets the value of the deliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * Sets the value of the deliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryDate(Calendar value) {
        this.deliveryDate = value;
    }

    /**
     * Gets the value of the important property.
     * 
     */
    public boolean isImportant() {
        return important;
    }

    /**
     * Sets the value of the important property.
     * 
     */
    public void setImportant(boolean value) {
        this.important = value;
    }

    /**
     * Gets the value of the attachment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttachmentInfo }
     * 
     * 
     */
    public List<AttachmentInfo> getAttachment() {
        if (attachment == null) {
            attachment = new ArrayList<AttachmentInfo>();
        }
        return this.attachment;
    }

}
