
package cliente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cliente package. 
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

    private final static QName _CelparaFah_QNAME = new QName("http://controle/", "celparaFah");
    private final static QName _FahparaCelResponse_QNAME = new QName("http://controle/", "fahparaCelResponse");
    private final static QName _CelparaFahResponse_QNAME = new QName("http://controle/", "celparaFahResponse");
    private final static QName _FahparaCel_QNAME = new QName("http://controle/", "fahparaCel");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cliente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CelparaFahResponse }
     * 
     */
    public CelparaFahResponse createCelparaFahResponse() {
        return new CelparaFahResponse();
    }

    /**
     * Create an instance of {@link FahparaCel }
     * 
     */
    public FahparaCel createFahparaCel() {
        return new FahparaCel();
    }

    /**
     * Create an instance of {@link CelparaFah }
     * 
     */
    public CelparaFah createCelparaFah() {
        return new CelparaFah();
    }

    /**
     * Create an instance of {@link FahparaCelResponse }
     * 
     */
    public FahparaCelResponse createFahparaCelResponse() {
        return new FahparaCelResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CelparaFah }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controle/", name = "celparaFah")
    public JAXBElement<CelparaFah> createCelparaFah(CelparaFah value) {
        return new JAXBElement<CelparaFah>(_CelparaFah_QNAME, CelparaFah.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FahparaCelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controle/", name = "fahparaCelResponse")
    public JAXBElement<FahparaCelResponse> createFahparaCelResponse(FahparaCelResponse value) {
        return new JAXBElement<FahparaCelResponse>(_FahparaCelResponse_QNAME, FahparaCelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CelparaFahResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controle/", name = "celparaFahResponse")
    public JAXBElement<CelparaFahResponse> createCelparaFahResponse(CelparaFahResponse value) {
        return new JAXBElement<CelparaFahResponse>(_CelparaFahResponse_QNAME, CelparaFahResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FahparaCel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controle/", name = "fahparaCel")
    public JAXBElement<FahparaCel> createFahparaCel(FahparaCel value) {
        return new JAXBElement<FahparaCel>(_FahparaCel_QNAME, FahparaCel.class, null, value);
    }

}
