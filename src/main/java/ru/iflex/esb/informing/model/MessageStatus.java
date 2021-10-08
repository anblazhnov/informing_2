
package ru.iflex.esb.informing.model;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


/**
 * <p>Java class for MessageStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MessageId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MessageStatusId" type="{http://informing.nsc.ru/}MessageStatusType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageStatus", propOrder = {
    "messageId",
    "messageStatusId"
})
public class MessageStatus
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "MessageId", required = true)
    protected String messageId;
    @XmlElement(name = "MessageStatusId", required = true)
    @XmlSchemaType(name = "string")
    protected MessageStatusType messageStatusId;

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

}
