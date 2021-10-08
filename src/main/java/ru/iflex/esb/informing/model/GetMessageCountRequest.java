
package ru.iflex.esb.informing.model;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


/**
 * <p>Java class for GetMessageCountRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMessageCountRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubjectTypeId" type="{http://informing.nsc.ru/}SubjectType"/&gt;
 *         &lt;element name="SubjectId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Channel" type="{http://informing.nsc.ru/}ChannelType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMessageCountRequest", propOrder = {
    "subjectTypeId",
    "subjectId",
    "channel"
})
public class GetMessageCountRequest
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "SubjectTypeId", required = true)
    @XmlSchemaType(name = "string")
    protected SubjectType subjectTypeId;
    @XmlElement(name = "SubjectId", required = true)
    protected String subjectId;
    @XmlElement(name = "Channel", required = true)
    @XmlSchemaType(name = "string")
    protected ChannelType channel;

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
     * Gets the value of the channel property.
     * 
     * @return
     *     possible object is
     *     {@link ChannelType }
     *     
     */
    public ChannelType getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChannelType }
     *     
     */
    public void setChannel(ChannelType value) {
        this.channel = value;
    }

}
