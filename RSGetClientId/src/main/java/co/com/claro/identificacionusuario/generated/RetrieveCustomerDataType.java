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
 * <p>Clase Java para retrieveCustomerDataType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="retrieveCustomerDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.americamovil.com/schema/namespace/AccountManagement/v1}ServiceRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "retrieveCustomerData")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retrieveCustomerDataType", propOrder = {
    "accountId"
})
public class RetrieveCustomerDataType
    extends ServiceRequestType
{

    @XmlElement(name = "AccountId", required = true)
    protected String accountId;

    /**
     * Obtiene el valor de la propiedad accountId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Define el valor de la propiedad accountId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountId(String value) {
        this.accountId = value;
    }

}
