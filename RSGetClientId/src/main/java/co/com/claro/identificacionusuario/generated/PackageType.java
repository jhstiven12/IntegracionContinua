//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.06.16 a las 06:16:32 PM COT 
//


package co.com.claro.identificacionusuario.generated;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para PackageType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PackageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PackageId" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="Unit" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="isPackageActivated" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="isRecurrencyApplicable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="NextBillPeriod" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ApplicableDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="PackageCost" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageType", propOrder = {
    "packageId",
    "quantity",
    "unit",
    "description",
    "isPackageActivated",
    "isRecurrencyApplicable",
    "nextBillPeriod",
    "applicableDate",
    "packageCost"
})
public class PackageType {

    @XmlElement(name = "PackageId", required = true)
    protected BigInteger packageId;
    @XmlElement(name = "Quantity", required = true)
    protected BigInteger quantity;
    @XmlElement(name = "Unit", required = true)
    protected String unit;
    @XmlElement(name = "Description", required = true)
    protected String description;
    protected boolean isPackageActivated;
    protected boolean isRecurrencyApplicable;
    @XmlElement(name = "NextBillPeriod", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nextBillPeriod;
    @XmlElement(name = "ApplicableDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar applicableDate;
    @XmlElement(name = "PackageCost")
    protected double packageCost;

    /**
     * Obtiene el valor de la propiedad packageId.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPackageId() {
        return packageId;
    }

    /**
     * Define el valor de la propiedad packageId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPackageId(BigInteger value) {
        this.packageId = value;
    }

    /**
     * Obtiene el valor de la propiedad quantity.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantity() {
        return quantity;
    }

    /**
     * Define el valor de la propiedad quantity.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantity(BigInteger value) {
        this.quantity = value;
    }

    /**
     * Obtiene el valor de la propiedad unit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Define el valor de la propiedad unit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * Obtiene el valor de la propiedad description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define el valor de la propiedad description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Obtiene el valor de la propiedad isPackageActivated.
     * 
     */
    public boolean isIsPackageActivated() {
        return isPackageActivated;
    }

    /**
     * Define el valor de la propiedad isPackageActivated.
     * 
     */
    public void setIsPackageActivated(boolean value) {
        this.isPackageActivated = value;
    }

    /**
     * Obtiene el valor de la propiedad isRecurrencyApplicable.
     * 
     */
    public boolean isIsRecurrencyApplicable() {
        return isRecurrencyApplicable;
    }

    /**
     * Define el valor de la propiedad isRecurrencyApplicable.
     * 
     */
    public void setIsRecurrencyApplicable(boolean value) {
        this.isRecurrencyApplicable = value;
    }

    /**
     * Obtiene el valor de la propiedad nextBillPeriod.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextBillPeriod() {
        return nextBillPeriod;
    }

    /**
     * Define el valor de la propiedad nextBillPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextBillPeriod(XMLGregorianCalendar value) {
        this.nextBillPeriod = value;
    }

    /**
     * Obtiene el valor de la propiedad applicableDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApplicableDate() {
        return applicableDate;
    }

    /**
     * Define el valor de la propiedad applicableDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApplicableDate(XMLGregorianCalendar value) {
        this.applicableDate = value;
    }

    /**
     * Obtiene el valor de la propiedad packageCost.
     * 
     */
    public double getPackageCost() {
        return packageCost;
    }

    /**
     * Define el valor de la propiedad packageCost.
     * 
     */
    public void setPackageCost(double value) {
        this.packageCost = value;
    }

}
