//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.06.16 a las 06:16:32 PM COT 
//


package co.com.claro.identificacionusuario.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CustomerDataType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CustomerDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DocumentType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DocumentNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="HomePhoneNumberIndicative" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HomePhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OfficePhoneNumberIndicative" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OfficePhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MobileNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{http://www.americamovil.com/schema/namespace/AccountManagement/v1}CustomerAddressType" minOccurs="0"/&gt;
 *         &lt;element name="InstallationAddress" type="{http://www.americamovil.com/schema/namespace/AccountManagement/v1}CustomerAddressType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerDataType", propOrder = {
    "customerId",
    "name",
    "lastName",
    "documentType",
    "documentNumber",
    "homePhoneNumberIndicative",
    "homePhoneNumber",
    "officePhoneNumberIndicative",
    "officePhoneNumber",
    "mobileNumber",
    "emailAddress",
    "address",
    "installationAddress"
})
public class CustomerDataType {

    @XmlElement(name = "CustomerId")
    protected String customerId;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "LastName", required = true)
    protected String lastName;
    @XmlElement(name = "DocumentType", required = true)
    protected String documentType;
    @XmlElement(name = "DocumentNumber", required = true)
    protected String documentNumber;
    @XmlElement(name = "HomePhoneNumberIndicative")
    protected String homePhoneNumberIndicative;
    @XmlElement(name = "HomePhoneNumber")
    protected String homePhoneNumber;
    @XmlElement(name = "OfficePhoneNumberIndicative")
    protected String officePhoneNumberIndicative;
    @XmlElement(name = "OfficePhoneNumber")
    protected String officePhoneNumber;
    @XmlElement(name = "MobileNumber")
    protected String mobileNumber;
    @XmlElement(name = "EmailAddress")
    protected String emailAddress;
    @XmlElement(name = "Address")
    protected CustomerAddressType address;
    @XmlElement(name = "InstallationAddress")
    protected CustomerAddressType installationAddress;

    /**
     * Obtiene el valor de la propiedad customerId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Define el valor de la propiedad customerId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerId(String value) {
        this.customerId = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad lastName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Define el valor de la propiedad lastName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Obtiene el valor de la propiedad documentType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentType() {
        return documentType;
    }

    /**
     * Define el valor de la propiedad documentType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentType(String value) {
        this.documentType = value;
    }

    /**
     * Obtiene el valor de la propiedad documentNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /**
     * Define el valor de la propiedad documentNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentNumber(String value) {
        this.documentNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad homePhoneNumberIndicative.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePhoneNumberIndicative() {
        return homePhoneNumberIndicative;
    }

    /**
     * Define el valor de la propiedad homePhoneNumberIndicative.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePhoneNumberIndicative(String value) {
        this.homePhoneNumberIndicative = value;
    }

    /**
     * Obtiene el valor de la propiedad homePhoneNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePhoneNumber() {
        return homePhoneNumber;
    }

    /**
     * Define el valor de la propiedad homePhoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePhoneNumber(String value) {
        this.homePhoneNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad officePhoneNumberIndicative.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficePhoneNumberIndicative() {
        return officePhoneNumberIndicative;
    }

    /**
     * Define el valor de la propiedad officePhoneNumberIndicative.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficePhoneNumberIndicative(String value) {
        this.officePhoneNumberIndicative = value;
    }

    /**
     * Obtiene el valor de la propiedad officePhoneNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficePhoneNumber() {
        return officePhoneNumber;
    }

    /**
     * Define el valor de la propiedad officePhoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficePhoneNumber(String value) {
        this.officePhoneNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad mobileNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileNumber() {
        return mobileNumber;
    }

    /**
     * Define el valor de la propiedad mobileNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileNumber(String value) {
        this.mobileNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad emailAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Define el valor de la propiedad emailAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Obtiene el valor de la propiedad address.
     * 
     * @return
     *     possible object is
     *     {@link CustomerAddressType }
     *     
     */
    public CustomerAddressType getAddress() {
        return address;
    }

    /**
     * Define el valor de la propiedad address.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAddressType }
     *     
     */
    public void setAddress(CustomerAddressType value) {
        this.address = value;
    }

    /**
     * Obtiene el valor de la propiedad installationAddress.
     * 
     * @return
     *     possible object is
     *     {@link CustomerAddressType }
     *     
     */
    public CustomerAddressType getInstallationAddress() {
        return installationAddress;
    }

    /**
     * Define el valor de la propiedad installationAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAddressType }
     *     
     */
    public void setInstallationAddress(CustomerAddressType value) {
        this.installationAddress = value;
    }

}
