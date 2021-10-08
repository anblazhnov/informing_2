
package ru.iflex.esb.informing.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.nsc.informing package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _InformingChannelType_QNAME = new QName("http://informing.nsc.ru/", "InformingChannelType");
    private final static QName _InformingEventParameter_QNAME = new QName("http://informing.nsc.ru/", "InformingEventParameter");
    private final static QName _SubjectType_QNAME = new QName("http://informing.nsc.ru/", "SubjectType");
    private final static QName _ChannelType_QNAME = new QName("http://informing.nsc.ru/", "ChannelType");
    private final static QName _ParameterType_QNAME = new QName("http://informing.nsc.ru/", "ParameterType");
    private final static QName _EventParameter_QNAME = new QName("http://informing.nsc.ru/", "EventParameter");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.nsc.informing
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EventParameter }
     * 
     */
    public EventParameter createEventParameter() {
        return new EventParameter();
    }

    /**
     * Create an instance of {@link InformingChannelType }
     * 
     */
    public InformingChannelType createInformingChannelType() {
        return new InformingChannelType();
    }

    /**
     * Create an instance of {@link InformingEventParameter }
     * 
     */
    public InformingEventParameter createInformingEventParameter() {
        return new InformingEventParameter();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubjectType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SubjectType }{@code >}
     */
    @XmlElementDecl(namespace = "http://informing.nsc.ru/", name = "InformingChannelType")
    public JAXBElement<SubjectType> createInformingChannelType(SubjectType value) {
        return new JAXBElement<SubjectType>(_InformingChannelType_QNAME, SubjectType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubjectType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SubjectType }{@code >}
     */
    @XmlElementDecl(namespace = "http://informing.nsc.ru/", name = "InformingEventParameter")
    public JAXBElement<SubjectType> createInformingEventParameter(SubjectType value) {
        return new JAXBElement<SubjectType>(_InformingEventParameter_QNAME, SubjectType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubjectType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SubjectType }{@code >}
     */
    @XmlElementDecl(namespace = "http://informing.nsc.ru/", name = "SubjectType")
    public JAXBElement<SubjectType> createSubjectType(SubjectType value) {
        return new JAXBElement<SubjectType>(_SubjectType_QNAME, SubjectType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChannelType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ChannelType }{@code >}
     */
    @XmlElementDecl(namespace = "http://informing.nsc.ru/", name = "ChannelType")
    public JAXBElement<ChannelType> createChannelType(ChannelType value) {
        return new JAXBElement<ChannelType>(_ChannelType_QNAME, ChannelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ParameterType }{@code >}
     */
    @XmlElementDecl(namespace = "http://informing.nsc.ru/", name = "ParameterType")
    public JAXBElement<ParameterType> createParameterType(ParameterType value) {
        return new JAXBElement<ParameterType>(_ParameterType_QNAME, ParameterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventParameter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EventParameter }{@code >}
     */
    @XmlElementDecl(namespace = "http://informing.nsc.ru/", name = "EventParameter")
    public JAXBElement<EventParameter> createEventParameter(EventParameter value) {
        return new JAXBElement<EventParameter>(_EventParameter_QNAME, EventParameter.class, null, value);
    }

}
