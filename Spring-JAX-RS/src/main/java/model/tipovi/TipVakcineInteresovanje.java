//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.02.07 at 03:15:04 PM CET 
//


package model.tipovi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tip_vakcine_interesovanje.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tip_vakcine_interesovanje">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Pfizer-BioNTech"/>
 *     &lt;enumeration value="Sputnik V (Gamaleya \u0438\u0441\u0442\u0440\u0430\u0436\u0438\u0432\u0430\u0447\u043a\u0438 \u0446\u0435\u043d\u0442\u0430\u0440)"/>
 *     &lt;enumeration value="Sinopharm"/>
 *     &lt;enumeration value="AstraZeneca"/>
 *     &lt;enumeration value="Moderna"/>
 *     &lt;enumeration value="Bilo koja"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tip_vakcine_interesovanje")
@XmlEnum
public enum TipVakcineInteresovanje {

    @XmlEnumValue("Pfizer-BioNTech")
    PFIZER_BIO_N_TECH("Pfizer-BioNTech"),
    @XmlEnumValue("Sputnik V")
    SPUTNIK_V("Sputnik V"),
    @XmlEnumValue("Sinopharm")
    SINOPHARM("Sinopharm"),
    @XmlEnumValue("AstraZeneca")
    ASTRA_ZENECA("AstraZeneca"),
    @XmlEnumValue("Moderna")
    MODERNA("Moderna"),
    @XmlEnumValue("Bilo koja")
    BILO_KOJA("Bilo koja");
    private final String value;

    TipVakcineInteresovanje(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipVakcineInteresovanje fromValue(String v) {
        for (TipVakcineInteresovanje c: TipVakcineInteresovanje.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
