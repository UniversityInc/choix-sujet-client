
package com.webservices.sujet;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.webservices.sujet package. 
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

    private final static QName _AddSujet_QNAME = new QName("http://webservices.com/", "addSujet");
    private final static QName _AddSujetResponse_QNAME = new QName("http://webservices.com/", "addSujetResponse");
    private final static QName _GetTitreResponse_QNAME = new QName("http://webservices.com/", "getTitreResponse");
    private final static QName _GetIdEnsResponse_QNAME = new QName("http://webservices.com/", "getIdEnsResponse");
    private final static QName _CheckDispo_QNAME = new QName("http://webservices.com/", "checkDispo");
    private final static QName _GetEnonce_QNAME = new QName("http://webservices.com/", "getEnonce");
    private final static QName _GetPrisResponse_QNAME = new QName("http://webservices.com/", "getPrisResponse");
    private final static QName _CheckDispoResponse_QNAME = new QName("http://webservices.com/", "checkDispoResponse");
    private final static QName _GetIdEns_QNAME = new QName("http://webservices.com/", "getIdEns");
    private final static QName _GetEnonceResponse_QNAME = new QName("http://webservices.com/", "getEnonceResponse");
    private final static QName _GetTitre_QNAME = new QName("http://webservices.com/", "getTitre");
    private final static QName _UpdateSujet_QNAME = new QName("http://webservices.com/", "updateSujet");
    private final static QName _GetPris_QNAME = new QName("http://webservices.com/", "getPris");
    private final static QName _UpdateSujetResponse_QNAME = new QName("http://webservices.com/", "updateSujetResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.webservices.sujet
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPris }
     * 
     */
    public GetPris createGetPris() {
        return new GetPris();
    }

    /**
     * Create an instance of {@link UpdateSujetResponse }
     * 
     */
    public UpdateSujetResponse createUpdateSujetResponse() {
        return new UpdateSujetResponse();
    }

    /**
     * Create an instance of {@link UpdateSujet }
     * 
     */
    public UpdateSujet createUpdateSujet() {
        return new UpdateSujet();
    }

    /**
     * Create an instance of {@link GetEnonceResponse }
     * 
     */
    public GetEnonceResponse createGetEnonceResponse() {
        return new GetEnonceResponse();
    }

    /**
     * Create an instance of {@link CheckDispoResponse }
     * 
     */
    public CheckDispoResponse createCheckDispoResponse() {
        return new CheckDispoResponse();
    }

    /**
     * Create an instance of {@link GetIdEns }
     * 
     */
    public GetIdEns createGetIdEns() {
        return new GetIdEns();
    }

    /**
     * Create an instance of {@link GetTitre }
     * 
     */
    public GetTitre createGetTitre() {
        return new GetTitre();
    }

    /**
     * Create an instance of {@link GetEnonce }
     * 
     */
    public GetEnonce createGetEnonce() {
        return new GetEnonce();
    }

    /**
     * Create an instance of {@link GetPrisResponse }
     * 
     */
    public GetPrisResponse createGetPrisResponse() {
        return new GetPrisResponse();
    }

    /**
     * Create an instance of {@link AddSujet }
     * 
     */
    public AddSujet createAddSujet() {
        return new AddSujet();
    }

    /**
     * Create an instance of {@link CheckDispo }
     * 
     */
    public CheckDispo createCheckDispo() {
        return new CheckDispo();
    }

    /**
     * Create an instance of {@link GetIdEnsResponse }
     * 
     */
    public GetIdEnsResponse createGetIdEnsResponse() {
        return new GetIdEnsResponse();
    }

    /**
     * Create an instance of {@link AddSujetResponse }
     * 
     */
    public AddSujetResponse createAddSujetResponse() {
        return new AddSujetResponse();
    }

    /**
     * Create an instance of {@link GetTitreResponse }
     * 
     */
    public GetTitreResponse createGetTitreResponse() {
        return new GetTitreResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddSujet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "addSujet")
    public JAXBElement<AddSujet> createAddSujet(AddSujet value) {
        return new JAXBElement<AddSujet>(_AddSujet_QNAME, AddSujet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddSujetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "addSujetResponse")
    public JAXBElement<AddSujetResponse> createAddSujetResponse(AddSujetResponse value) {
        return new JAXBElement<AddSujetResponse>(_AddSujetResponse_QNAME, AddSujetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTitreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "getTitreResponse")
    public JAXBElement<GetTitreResponse> createGetTitreResponse(GetTitreResponse value) {
        return new JAXBElement<GetTitreResponse>(_GetTitreResponse_QNAME, GetTitreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIdEnsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "getIdEnsResponse")
    public JAXBElement<GetIdEnsResponse> createGetIdEnsResponse(GetIdEnsResponse value) {
        return new JAXBElement<GetIdEnsResponse>(_GetIdEnsResponse_QNAME, GetIdEnsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckDispo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "checkDispo")
    public JAXBElement<CheckDispo> createCheckDispo(CheckDispo value) {
        return new JAXBElement<CheckDispo>(_CheckDispo_QNAME, CheckDispo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEnonce }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "getEnonce")
    public JAXBElement<GetEnonce> createGetEnonce(GetEnonce value) {
        return new JAXBElement<GetEnonce>(_GetEnonce_QNAME, GetEnonce.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPrisResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "getPrisResponse")
    public JAXBElement<GetPrisResponse> createGetPrisResponse(GetPrisResponse value) {
        return new JAXBElement<GetPrisResponse>(_GetPrisResponse_QNAME, GetPrisResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckDispoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "checkDispoResponse")
    public JAXBElement<CheckDispoResponse> createCheckDispoResponse(CheckDispoResponse value) {
        return new JAXBElement<CheckDispoResponse>(_CheckDispoResponse_QNAME, CheckDispoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIdEns }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "getIdEns")
    public JAXBElement<GetIdEns> createGetIdEns(GetIdEns value) {
        return new JAXBElement<GetIdEns>(_GetIdEns_QNAME, GetIdEns.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEnonceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "getEnonceResponse")
    public JAXBElement<GetEnonceResponse> createGetEnonceResponse(GetEnonceResponse value) {
        return new JAXBElement<GetEnonceResponse>(_GetEnonceResponse_QNAME, GetEnonceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTitre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "getTitre")
    public JAXBElement<GetTitre> createGetTitre(GetTitre value) {
        return new JAXBElement<GetTitre>(_GetTitre_QNAME, GetTitre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSujet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "updateSujet")
    public JAXBElement<UpdateSujet> createUpdateSujet(UpdateSujet value) {
        return new JAXBElement<UpdateSujet>(_UpdateSujet_QNAME, UpdateSujet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPris }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "getPris")
    public JAXBElement<GetPris> createGetPris(GetPris value) {
        return new JAXBElement<GetPris>(_GetPris_QNAME, GetPris.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSujetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "updateSujetResponse")
    public JAXBElement<UpdateSujetResponse> createUpdateSujetResponse(UpdateSujetResponse value) {
        return new JAXBElement<UpdateSujetResponse>(_UpdateSujetResponse_QNAME, UpdateSujetResponse.class, null, value);
    }

}
