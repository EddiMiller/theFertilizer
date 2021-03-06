//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.12.01 um 12:08:33 PM CET 
//


package xmlData;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.example.org/Fertiliser}usedFertiliser" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.example.org/Fertiliser}usedIngredient" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="requiredFertillser_id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="amount" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "usedFertiliser",
    "usedIngredient"
})
@XmlRootElement(name = "production")
public class Production {

    @XmlElement(required = true)
    protected List<UsedFertiliser> usedFertiliser;
    @XmlElement(required = true)
    protected List<UsedIngredient> usedIngredient;
    @XmlAttribute(name = "requiredFertillser_id", required = true)
    protected int requiredFertillserId;
    @XmlAttribute(name = "amount", required = true)
    protected double amount;

    /**
     * Gets the value of the usedFertiliser property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usedFertiliser property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsedFertiliser().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UsedFertiliser }
     * 
     * 
     */
    public List<UsedFertiliser> getUsedFertiliser() {
        if (usedFertiliser == null) {
            usedFertiliser = new ArrayList<UsedFertiliser>();
        }
        return this.usedFertiliser;
    }

    /**
     * Gets the value of the usedIngredient property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usedIngredient property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsedIngredient().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UsedIngredient }
     * 
     * 
     */
    public List<UsedIngredient> getUsedIngredient() {
        if (usedIngredient == null) {
            usedIngredient = new ArrayList<UsedIngredient>();
        }
        return this.usedIngredient;
    }

    /**
     * Ruft den Wert der requiredFertillserId-Eigenschaft ab.
     * 
     */
    public int getRequiredFertillserId() {
        return requiredFertillserId;
    }

    /**
     * Legt den Wert der requiredFertillserId-Eigenschaft fest.
     * 
     */
    public void setRequiredFertillserId(int value) {
        this.requiredFertillserId = value;
    }

    /**
     * Ruft den Wert der amount-Eigenschaft ab.
     * 
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Legt den Wert der amount-Eigenschaft fest.
     * 
     */
    public void setAmount(double value) {
        this.amount = value;
    }

}
