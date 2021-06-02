//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.06.16 a las 06:06:50 PM COT 
//


package co.com.claro.identificacionusuario.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para retrieveCustomerDataResponseType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="retrieveCustomerDataResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.americamovil.com/schema/namespace/AccountManagement/v1}ServiceResponseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomerData" type="{http://www.americamovil.com/schema/namespace/AccountManagement/v1}CustomerDataType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "retrieveCustomerDataResponseType")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retrieveCustomerDataResponseType", propOrder = {
    "customerData"
})
public class RetrieveCustomerDataResponseType
    extends ServiceResponseType
{

    @XmlElement(name = "CustomerData")
    protected CustomerDataType customerData;

    /**
     * Obtiene el valor de la propiedad customerData.
     * 
     * @return
     *     possible object is
     *     {@link CustomerDataType }
     *     
     */
    public CustomerDataType getCustomerData() {
        return customerData;
    }

    /**
     * Define el valor de la propiedad customerData.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerDataType }
     *     
     */
    public void setCustomerData(CustomerDataType value) {
        this.customerData = value;
    }

}
