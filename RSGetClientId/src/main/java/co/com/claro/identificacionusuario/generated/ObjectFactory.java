//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.06.16 a las 06:16:32 PM COT 
//


package co.com.claro.identificacionusuario.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.claro.identificacionusuario.gen package. 
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

    
    private final static QName _RetrieveCustomerData_QNAME = new QName("http://www.americamovil.com/schema/namespace/AccountManagement/v1", "retrieveCustomerData");
    private final static QName _RetrieveCustomerDataResponse_QNAME = new QName("http://www.americamovil.com/schema/namespace/AccountManagement/v1", "retrieveCustomerDataResponse");
    private final static QName _RetrieveCustomerDataFault_QNAME = new QName("http://www.americamovil.com/schema/namespace/AccountManagement/v1", "retrieveCustomerDataFault");
    
    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.claro.identificacionusuario.gen
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RetrieveCustomerDataType }
     * 
     */
    public RetrieveCustomerDataType createRetrieveCustomerDataType() {
        return new RetrieveCustomerDataType();
    }

    /**
     * Create an instance of {@link RetrieveCustomerDataResponseType }
     * 
     */
    public RetrieveCustomerDataResponseType createRetrieveCustomerDataResponseType() {
        return new RetrieveCustomerDataResponseType();
    }

    /**
     * Create an instance of {@link ServiceRequestType }
     * 
     */
    public ServiceRequestType createServiceRequestType() {
        return new ServiceRequestType();
    }

    /**
     * Create an instance of {@link ServiceResponseType }
     * 
     */
    public ServiceResponseType createServiceResponseType() {
        return new ServiceResponseType();
    }

    
    /**
     * Create an instance of {@link PackageType }
     * 
     */
    public PackageType createPackageType() {
        return new PackageType();
    }

    /**
     * Create an instance of {@link CustomerDataType }
     * 
     */
    public CustomerDataType createCustomerDataType() {
        return new CustomerDataType();
    }

    /**
     * Create an instance of {@link CustomerAddressType }
     * 
     */
    public CustomerAddressType createCustomerAddressType() {
        return new CustomerAddressType();
    }

    

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveCustomerDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RetrieveCustomerDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.americamovil.com/schema/namespace/AccountManagement/v1", name = "retrieveCustomerData")
    public JAXBElement<RetrieveCustomerDataType> createRetrieveCustomerData(RetrieveCustomerDataType value) {
        return new JAXBElement<RetrieveCustomerDataType>(_RetrieveCustomerData_QNAME, RetrieveCustomerDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveCustomerDataResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RetrieveCustomerDataResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.americamovil.com/schema/namespace/AccountManagement/v1", name = "retrieveCustomerDataResponse")
    public JAXBElement<RetrieveCustomerDataResponseType> createRetrieveCustomerDataResponse(RetrieveCustomerDataResponseType value) {
        return new JAXBElement<RetrieveCustomerDataResponseType>(_RetrieveCustomerDataResponse_QNAME, RetrieveCustomerDataResponseType.class, null, value);
    }
}
