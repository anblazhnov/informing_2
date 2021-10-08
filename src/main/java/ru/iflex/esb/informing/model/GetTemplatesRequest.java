
package ru.iflex.esb.informing.model;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


/**
 * <p>Java class for GetTemplatesRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetTemplatesRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChannelId" type="{http://informing.nsc.ru/}ChannelType" minOccurs="0"/&gt;
 *         &lt;element name="SubjectTypeId" type="{http://informing.nsc.ru/}SubjectType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTemplatesRequest", propOrder = {
    "channelId",
    "subjectTypeId"
})
public class GetTemplatesRequest
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ChannelId")
    @XmlSchemaType(name = "string")
    protected ChannelType channelId;
    @XmlElement(name = "SubjectTypeId")
    @XmlSchemaType(name = "string")
    protected SubjectType subjectTypeId;

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

}
