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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ServiceResponseType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ServiceResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcknowledgementIndicator"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="SUCCESS"/&gt;
 *               &lt;enumeration value="WARNING"/&gt;
 *               &lt;enumeration value="ERROR"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AcknowledgementCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AcknowledgementDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceResponseType", propOrder = {
    "acknowledgementIndicator",
    "acknowledgementCode",
    "acknowledgementDescription"
})
@XmlSeeAlso({
    RetrieveCustomerDataResponseType.class
})
public class ServiceResponseType {

    @XmlElement(name = "AcknowledgementIndicator", required = true)
    protected String acknowledgementIndicator;
    @XmlElement(name = "AcknowledgementCode")
    protected String acknowledgementCode;
    @XmlElement(name = "AcknowledgementDescription")
    protected String acknowledgementDescription;

    /**
     * Obtiene el valor de la propiedad acknowledgementIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcknowledgementIndicator() {
        return acknowledgementIndicator;
    }

    /**
     * Define el valor de la propiedad acknowledgementIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcknowledgementIndicator(String value) {
        this.acknowledgementIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad acknowledgementCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcknowledgementCode() {
        return acknowledgementCode;
    }

    /**
     * Define el valor de la propiedad acknowledgementCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcknowledgementCode(String value) {
        this.acknowledgementCode = value;
    }

    /**
     * Obtiene el valor de la propiedad acknowledgementDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcknowledgementDescription() {
        return acknowledgementDescription;
    }

    /**
     * Define el valor de la propiedad acknowledgementDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcknowledgementDescription(String value) {
        this.acknowledgementDescription = value;
    }

}
