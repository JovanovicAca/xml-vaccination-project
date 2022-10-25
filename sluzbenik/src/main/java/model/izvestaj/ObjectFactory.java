//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.01.12 at 07:35:31 PM CET 
//


package model.izvestaj;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the rs.ac.uns.ftn.vakcina.izvestaj package. 
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

    private final static QName _InfoProizvodjac_QNAME = new QName("http://ftn.uns.ac.rs/vakcina/izvestaj", "info_proizvodjac");
    private final static QName _InfoDoza_QNAME = new QName("http://ftn.uns.ac.rs/vakcina/izvestaj", "info_doza");
    private final static QName _RasporedDozaVakcinaBrojDoze_QNAME = new QName("http://ftn.uns.ac.rs/vakcina/izvestaj", "raspored_doza_vakcina_broj_doze");
    private final static QName _RasporedDozaVakcinaProizvodjac_QNAME = new QName("http://ftn.uns.ac.rs/vakcina/izvestaj", "raspored_doza_vakcina_proizvodjac");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: rs.ac.uns.ftn.vakcina.izvestaj
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IzvestajOImunizaciji }
     * 
     */
    public IzvestajOImunizaciji createIzvestajOImunizaciji() {
        return new IzvestajOImunizaciji();
    }

    /**
     * Create an instance of {@link TProizvodjac }
     * 
     */
    public TProizvodjac createTProizvodjac() {
        return new TProizvodjac();
    }

    /**
     * Create an instance of {@link TDoza }
     * 
     */
    public TDoza createTDoza() {
        return new TDoza();
    }

    /**
     * Create an instance of {@link IzvestajOImunizaciji.PocetniDatum }
     * 
     */
    public IzvestajOImunizaciji.PocetniDatum createIzvestajOImunizacijiPocetniDatum() {
        return new IzvestajOImunizaciji.PocetniDatum();
    }

    /**
     * Create an instance of {@link IzvestajOImunizaciji.ZavrsniDatum }
     * 
     */
    public IzvestajOImunizaciji.ZavrsniDatum createIzvestajOImunizacijiZavrsniDatum() {
        return new IzvestajOImunizaciji.ZavrsniDatum();
    }

    /**
     * Create an instance of {@link RasporedDozaBroj }
     * 
     */
    public RasporedDozaBroj createRasporedDozaBroj() {
        return new RasporedDozaBroj();
    }

    /**
     * Create an instance of {@link RasporedDozaProizvodjac }
     * 
     */
    public RasporedDozaProizvodjac createRasporedDozaProizvodjac() {
        return new RasporedDozaProizvodjac();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TProizvodjac }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ftn.uns.ac.rs/vakcina/izvestaj", name = "info_proizvodjac")
    public JAXBElement<TProizvodjac> createInfoProizvodjac(TProizvodjac value) {
        return new JAXBElement<TProizvodjac>(_InfoProizvodjac_QNAME, TProizvodjac.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TDoza }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ftn.uns.ac.rs/vakcina/izvestaj", name = "info_doza")
    public JAXBElement<TDoza> createInfoDoza(TDoza value) {
        return new JAXBElement<TDoza>(_InfoDoza_QNAME, TDoza.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RasporedDozaBroj }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ftn.uns.ac.rs/vakcina/izvestaj", name = "raspored_doza_vakcina_broj_doze")
    public JAXBElement<RasporedDozaBroj> createRasporedDozaVakcinaBrojDoze(RasporedDozaBroj value) {
        return new JAXBElement<RasporedDozaBroj>(_RasporedDozaVakcinaBrojDoze_QNAME, RasporedDozaBroj.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RasporedDozaProizvodjac }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ftn.uns.ac.rs/vakcina/izvestaj", name = "raspored_doza_vakcina_proizvodjac")
    public JAXBElement<RasporedDozaProizvodjac> createRasporedDozaVakcinaProizvodjac(RasporedDozaProizvodjac value) {
        return new JAXBElement<RasporedDozaProizvodjac>(_RasporedDozaVakcinaProizvodjac_QNAME, RasporedDozaProizvodjac.class, null, value);
    }

}