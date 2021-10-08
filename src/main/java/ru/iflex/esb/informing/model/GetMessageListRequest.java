
package ru.iflex.esb.informing.model;


import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;
import java.util.Calendar;


/**
 * <p>Java class for GetMessageListRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMessageListRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubjectTypeId" type="{http://informing.nsc.ru/}SubjectType"/&gt;
 *         &lt;element name="SubjectId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EventTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MessageStatusId" type="{http://informing.nsc.ru/}MessageStatusType" minOccurs="0"/&gt;
 *         &lt;element name="ChannelTypeId" type="{http://informing.nsc.ru/}ChannelType" minOccurs="0"/&gt;
 *         &lt;element name="SendStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="SendEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="PageInfo" type="{http://informing.nsc.ru/}PageInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMessageListRequest", propOrder = {
    "subjectTypeId",
    "subjectId",
    "eventTypeId",
    "messageStatusId",
    "channelTypeId",
    "sendStartDate",
    "sendEndDate",
    "deliveryStartDate",
    "deliveryEndDate",
    "pageInfo"
})
public class GetMessageListRequest
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "SubjectTypeId", required = true)
    @XmlSchemaType(name = "string")
    protected SubjectType subjectTypeId;
    @XmlElement(name = "SubjectId", required = true)
    protected String subjectId;
    @XmlElement(name = "EventTypeId")
    protected String eventTypeId;
    @XmlElement(name = "MessageStatusId")
    @XmlSchemaType(name = "string")
    protected MessageStatusType messageStatusId;
    @XmlElement(name = "ChannelTypeId")
    @XmlSchemaType(name = "string")
    protected ChannelType channelTypeId;
    @XmlElement(name = "SendStartDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar sendStartDate;
    @XmlElement(name = "SendEndDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar sendEndDate;
    @XmlElement(name = "DeliveryStartDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar deliveryStartDate;
    @XmlElement(name = "DeliveryEndDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar deliveryEndDate;
    @XmlElement(name = "PageInfo")
    protected PageInfo pageInfo;

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
     * Gets the value of the sendStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getSendStartDate() {
        return sendStartDate;
    }

    /**
     * Sets the value of the sendStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendStartDate(Calendar value) {
        this.sendStartDate = value;
    }

    /**
     * Gets the value of the sendEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getSendEndDate() {
        return sendEndDate;
    }

    /**
     * Sets the value of the sendEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendEndDate(Calendar value) {
        this.sendEndDate = value;
    }

    /**
     * Gets the value of the deliveryStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getDeliveryStartDate() {
        return deliveryStartDate;
    }

    /**
     * Sets the value of the deliveryStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryStartDate(Calendar value) {
        this.deliveryStartDate = value;
    }

    /**
     * Gets the value of the deliveryEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getDeliveryEndDate() {
        return deliveryEndDate;
    }

    /**
     * Sets the value of the deliveryEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryEndDate(Calendar value) {
        this.deliveryEndDate = value;
    }

    /**
     * Gets the value of the pageInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PageInfo }
     *     
     */
    public PageInfo getPageInfo() {
        return pageInfo;
    }

    /**
     * Sets the value of the pageInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PageInfo }
     *     
     */
    public void setPageInfo(PageInfo value) {
        this.pageInfo = value;
    }

}
