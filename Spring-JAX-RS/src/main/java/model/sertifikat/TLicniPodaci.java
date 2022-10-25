//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.01.12 at 07:36:17 PM CET 
//


package model.sertifikat;


import model.tipovi.ImePrezime;
import model.tipovi.Pol;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for TLicni_podaci complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TLicni_podaci">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ime_prezime" type="{http://ftn.uns.ac.rs/vakcina/tipovi}Ime_prezime"/>
 *         &lt;element name="pol" type="{http://ftn.uns.ac.rs/vakcina/tipovi}pol"/>
 *         &lt;element name="JMBG">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://ftn.uns.ac.rs/vakcina/tipovi>JMBG">
 *                 &lt;attribute name="property" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="datatype" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="broj_pasosa" type="{http://ftn.uns.ac.rs/vakcina/tipovi}broj_pasosa"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TLicni_podaci", propOrder = {
    "imePrezime",
    "pol",
    "jmbg",
    "brojPasosa"
})
public class TLicniPodaci {

    @XmlElement(name = "ime_prezime", required = true)
    protected ImePrezime imePrezime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Pol pol;
    @XmlElement(name = "JMBG", required = true)
    protected JMBG jmbg;
    @XmlElement(name = "broj_pasosa", required = true)
    protected String brojPasosa;

    /**
     * Gets the value of the imePrezime property.
     * 
     * @return
     *     possible object is
     *     {@link ImePrezime }
     *     
     */
    public ImePrezime getImePrezime() {
        return imePrezime;
    }

    /**
     * Sets the value of the imePrezime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImePrezime }
     *     
     */
    public void setImePrezime(ImePrezime value) {
        this.imePrezime = value;
    }

    /**
     * Gets the value of the pol property.
     * 
     * @return
     *     possible object is
     *     {@link Pol }
     *     
     */
    public Pol getPol() {
        return pol;
    }

    /**
     * Sets the value of the pol property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pol }
     *     
     */
    public void setPol(Pol value) {
        this.pol = value;
    }

    /**
     * Gets the value of the jmbg property.
     * 
     * @return
     *     possible object is
     *     {@link JMBG }
     *     
     */
    public JMBG getJMBG() {
        return jmbg;
    }

    /**
     * Sets the value of the jmbg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JMBG }
     *     
     */
    public void setJMBG(JMBG value) {
        this.jmbg = value;
    }

    /**
     * Gets the value of the brojPasosa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrojPasosa() {
        return brojPasosa;
    }

    /**
     * Sets the value of the brojPasosa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrojPasosa(String value) {
        this.brojPasosa = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://ftn.uns.ac.rs/vakcina/tipovi>JMBG">
     *       &lt;attribute name="property" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="datatype" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class JMBG {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "property")
        @XmlSchemaType(name = "anySimpleType")
        protected String property;
        @XmlAttribute(name = "datatype")
        @XmlSchemaType(name = "anySimpleType")
        protected String datatype;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the property property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProperty() {
            return property;
        }

        /**
         * Sets the value of the property property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProperty(String value) {
            this.property = value;
        }

        /**
         * Gets the value of the datatype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDatatype() {
            return datatype;
        }

        /**
         * Sets the value of the datatype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDatatype(String value) {
            this.datatype = value;
        }

    }

}
