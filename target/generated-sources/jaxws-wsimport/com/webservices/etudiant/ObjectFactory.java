
package com.webservices.etudiant;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.webservices.etudiant package. 
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

    private final static QName _CompareMoy_QNAME = new QName("http://webservices.com/", "compareMoy");
    private final static QName _GetDate_QNAME = new QName("http://webservices.com/", "getDate");
    private final static QName _UpdateSujetEtudiant_QNAME = new QName("http://webservices.com/", "updateSujetEtudiant");
    private final static QName _GetNom_QNAME = new QName("http://webservices.com/", "getNom");
    private final static QName _GetDateResponse_QNAME = new QName("http://webservices.com/", "getDateResponse");
    private final static QName _GetNomResponse_QNAME = new QName("http://webservices.com/", "getNomResponse");
    private final static QName _GetIdEtudiantFromIdSujetResponse_QNAME = new QName("http://webservices.com/", "getIdEtudiantFromIdSujetResponse");
    private final static QName _GetIdCompteResponse_QNAME = new QName("http://webservices.com/", "getIdCompteResponse");
    private final static QName _GetPrenom_QNAME = new QName("http://webservices.com/", "getPrenom");
    private final static QName _UpdateSujetEtudiantNull_QNAME = new QName("http://webservices.com/", "updateSujetEtudiantNull");
    private final static QName _GetMUFResponse_QNAME = new QName("http://webservices.com/", "getMUFResponse");
    private final static QName _GetIdSujet_QNAME = new QName("http://webservices.com/", "getIdSujet");
    private final static QName _GetIdEtudiantByIdSujetResponse_QNAME = new QName("http://webservices.com/", "getIdEtudiantByIdSujetResponse");
    private final static QName _GetMCResponse_QNAME = new QName("http://webservices.com/", "getMCResponse");
    private final static QName _GetMUF_QNAME = new QName("http://webservices.com/", "getMUF");
    private final static QName _GetPrenomResponse_QNAME = new QName("http://webservices.com/", "getPrenomResponse");
    private final static QName _GetLieuResponse_QNAME = new QName("http://webservices.com/", "getLieuResponse");
    private final static QName _GetEmail_QNAME = new QName("http://webservices.com/", "getEmail");
    private final static QName _GetIdCompte_QNAME = new QName("http://webservices.com/", "getIdCompte");
    private final static QName _UpdateEtudiantResponse_QNAME = new QName("http://webservices.com/", "updateEtudiantResponse");
    private final static QName _GetIdSjt_QNAME = new QName("http://webservices.com/", "getIdSjt");
    private final static QName _CompareMoyResponse_QNAME = new QName("http://webservices.com/", "compareMoyResponse");
    private final static QName _GetIdEtudiantFromIdSujet_QNAME = new QName("http://webservices.com/", "getIdEtudiantFromIdSujet");
    private final static QName _GetMC_QNAME = new QName("http://webservices.com/", "getMC");
    private final static QName _AvoirSujet_QNAME = new QName("http://webservices.com/", "avoirSujet");
    private final static QName _GetEmailResponse_QNAME = new QName("http://webservices.com/", "getEmailResponse");
    private final static QName _AvoirSujetResponse_QNAME = new QName("http://webservices.com/", "avoirSujetResponse");
    private final static QName _GetIdSjtResponse_QNAME = new QName("http://webservices.com/", "getIdSjtResponse");
    private final static QName _GetIdSujetResponse_QNAME = new QName("http://webservices.com/", "getIdSujetResponse");
    private final static QName _UpdateSujetEtudiantNullResponse_QNAME = new QName("http://webservices.com/", "updateSujetEtudiantNullResponse");
    private final static QName _UpdateSujetEtudiantResponse_QNAME = new QName("http://webservices.com/", "updateSujetEtudiantResponse");
    private final static QName _GetIdEtudiantFromCompteResponse_QNAME = new QName("http://webservices.com/", "getIdEtudiantFromCompteResponse");
    private final static QName _GetIdEtudiantFromCompte_QNAME = new QName("http://webservices.com/", "getIdEtudiantFromCompte");
    private final static QName _GetIdEtudiantByIdSujet_QNAME = new QName("http://webservices.com/", "getIdEtudiantByIdSujet");
    private final static QName _GetNumero_QNAME = new QName("http://webservices.com/", "getNumero");
    private final static QName _GetLieu_QNAME = new QName("http://webservices.com/", "getLieu");
    private final static QName _GetNumeroResponse_QNAME = new QName("http://webservices.com/", "getNumeroResponse");
    private final static QName _UpdateEtudiant_QNAME = new QName("http://webservices.com/", "updateEtudiant");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.webservices.etudiant
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetMUF }
     * 
     */
    public GetMUF createGetMUF() {
        return new GetMUF();
    }

    /**
     * Create an instance of {@link GetPrenomResponse }
     * 
     */
    public GetPrenomResponse createGetPrenomResponse() {
        return new GetPrenomResponse();
    }

    /**
     * Create an instance of {@link GetLieuResponse }
     * 
     */
    public GetLieuResponse createGetLieuResponse() {
        return new GetLieuResponse();
    }

    /**
     * Create an instance of {@link GetMUFResponse }
     * 
     */
    public GetMUFResponse createGetMUFResponse() {
        return new GetMUFResponse();
    }

    /**
     * Create an instance of {@link UpdateSujetEtudiantNull }
     * 
     */
    public UpdateSujetEtudiantNull createUpdateSujetEtudiantNull() {
        return new UpdateSujetEtudiantNull();
    }

    /**
     * Create an instance of {@link GetIdEtudiantByIdSujetResponse }
     * 
     */
    public GetIdEtudiantByIdSujetResponse createGetIdEtudiantByIdSujetResponse() {
        return new GetIdEtudiantByIdSujetResponse();
    }

    /**
     * Create an instance of {@link GetMCResponse }
     * 
     */
    public GetMCResponse createGetMCResponse() {
        return new GetMCResponse();
    }

    /**
     * Create an instance of {@link GetIdSujet }
     * 
     */
    public GetIdSujet createGetIdSujet() {
        return new GetIdSujet();
    }

    /**
     * Create an instance of {@link GetNomResponse }
     * 
     */
    public GetNomResponse createGetNomResponse() {
        return new GetNomResponse();
    }

    /**
     * Create an instance of {@link GetDateResponse }
     * 
     */
    public GetDateResponse createGetDateResponse() {
        return new GetDateResponse();
    }

    /**
     * Create an instance of {@link GetPrenom }
     * 
     */
    public GetPrenom createGetPrenom() {
        return new GetPrenom();
    }

    /**
     * Create an instance of {@link GetIdCompteResponse }
     * 
     */
    public GetIdCompteResponse createGetIdCompteResponse() {
        return new GetIdCompteResponse();
    }

    /**
     * Create an instance of {@link GetIdEtudiantFromIdSujetResponse }
     * 
     */
    public GetIdEtudiantFromIdSujetResponse createGetIdEtudiantFromIdSujetResponse() {
        return new GetIdEtudiantFromIdSujetResponse();
    }

    /**
     * Create an instance of {@link CompareMoy }
     * 
     */
    public CompareMoy createCompareMoy() {
        return new CompareMoy();
    }

    /**
     * Create an instance of {@link GetDate }
     * 
     */
    public GetDate createGetDate() {
        return new GetDate();
    }

    /**
     * Create an instance of {@link GetNom }
     * 
     */
    public GetNom createGetNom() {
        return new GetNom();
    }

    /**
     * Create an instance of {@link UpdateSujetEtudiant }
     * 
     */
    public UpdateSujetEtudiant createUpdateSujetEtudiant() {
        return new UpdateSujetEtudiant();
    }

    /**
     * Create an instance of {@link GetLieu }
     * 
     */
    public GetLieu createGetLieu() {
        return new GetLieu();
    }

    /**
     * Create an instance of {@link GetIdEtudiantByIdSujet }
     * 
     */
    public GetIdEtudiantByIdSujet createGetIdEtudiantByIdSujet() {
        return new GetIdEtudiantByIdSujet();
    }

    /**
     * Create an instance of {@link GetNumero }
     * 
     */
    public GetNumero createGetNumero() {
        return new GetNumero();
    }

    /**
     * Create an instance of {@link GetIdEtudiantFromCompte }
     * 
     */
    public GetIdEtudiantFromCompte createGetIdEtudiantFromCompte() {
        return new GetIdEtudiantFromCompte();
    }

    /**
     * Create an instance of {@link GetNumeroResponse }
     * 
     */
    public GetNumeroResponse createGetNumeroResponse() {
        return new GetNumeroResponse();
    }

    /**
     * Create an instance of {@link UpdateEtudiant }
     * 
     */
    public UpdateEtudiant createUpdateEtudiant() {
        return new UpdateEtudiant();
    }

    /**
     * Create an instance of {@link UpdateSujetEtudiantNullResponse }
     * 
     */
    public UpdateSujetEtudiantNullResponse createUpdateSujetEtudiantNullResponse() {
        return new UpdateSujetEtudiantNullResponse();
    }

    /**
     * Create an instance of {@link UpdateSujetEtudiantResponse }
     * 
     */
    public UpdateSujetEtudiantResponse createUpdateSujetEtudiantResponse() {
        return new UpdateSujetEtudiantResponse();
    }

    /**
     * Create an instance of {@link GetIdSjtResponse }
     * 
     */
    public GetIdSjtResponse createGetIdSjtResponse() {
        return new GetIdSjtResponse();
    }

    /**
     * Create an instance of {@link GetIdSujetResponse }
     * 
     */
    public GetIdSujetResponse createGetIdSujetResponse() {
        return new GetIdSujetResponse();
    }

    /**
     * Create an instance of {@link AvoirSujetResponse }
     * 
     */
    public AvoirSujetResponse createAvoirSujetResponse() {
        return new AvoirSujetResponse();
    }

    /**
     * Create an instance of {@link GetEmailResponse }
     * 
     */
    public GetEmailResponse createGetEmailResponse() {
        return new GetEmailResponse();
    }

    /**
     * Create an instance of {@link GetIdEtudiantFromCompteResponse }
     * 
     */
    public GetIdEtudiantFromCompteResponse createGetIdEtudiantFromCompteResponse() {
        return new GetIdEtudiantFromCompteResponse();
    }

    /**
     * Create an instance of {@link GetIdEtudiantFromIdSujet }
     * 
     */
    public GetIdEtudiantFromIdSujet createGetIdEtudiantFromIdSujet() {
        return new GetIdEtudiantFromIdSujet();
    }

    /**
     * Create an instance of {@link AvoirSujet }
     * 
     */
    public AvoirSujet createAvoirSujet() {
        return new AvoirSujet();
    }

    /**
     * Create an instance of {@link GetMC }
     * 
     */
    public GetMC createGetMC() {
        return new GetMC();
    }

    /**
     * Create an instance of {@link GetIdSjt }
     * 
     */
    public GetIdSjt createGetIdSjt() {
        return new GetIdSjt();
    }

    /**
     * Create an instance of {@link GetEmail }
     * 
     */
    public GetEmail createGetEmail() {
        return new GetEmail();
    }

    /**
     * Create an instance of {@link GetIdCompte }
     * 
     */
    public GetIdCompte createGetIdCompte() {
        return new GetIdCompte();
    }

    /**
     * Create an instance of {@link UpdateEtudiantResponse }
     * 
     */
    public UpdateEtudiantResponse createUpdateEtudiantResponse() {
        return new UpdateEtudiantResponse();
    }

    /**
     * Create an instance of {@link CompareMoyResponse }
     * 
     */
    public CompareMoyResponse createCompareMoyResponse() {
        return new CompareMoyResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompareMoy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "compareMoy")
    public JAXBElement<CompareMoy> createCompareMoy(CompareMoy value) {
        return new JAXBElement<CompareMoy>(_CompareMoy_QNAME, CompareMoy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "getDate")
    public JAXBElement<GetDate> createGetDate(GetDate value) {
        return new JAXBElement<GetDate>(_GetDate_QNAME, GetDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSujetEtudiant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "updateSujetEtudiant")
    public JAXBElement<UpdateSujetEtudiant> createUpdateSujetEtudiant(UpdateSujetEtudiant value) {
        return new JAXBElement<UpdateSujetEtudiant>(_UpdateSujetEtudiant_QNAME, UpdateSujetEtudiant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "getNom")
    public JAXBElement<GetNom> createGetNom(GetNom value) {
        return new JAXBElement<GetNom>(_GetNom_QNAME, GetNom.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "getDateResponse")
    public JAXBElement<GetDateResponse> createGetDateResponse(GetDateResponse value) {
        return new JAXBElement<GetDateResponse>(_GetDateResponse_QNAME, GetDateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNomResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "getNomResponse")
    public JAXBElement<GetNomResponse> createGetNomResponse(GetNomResponse value) {
        return new JAXBElement<GetNomResponse>(_GetNomResponse_QNAME, GetNomResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIdEtudiantFromIdSujetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "getIdEtudiantFromIdSujetResponse")
    public JAXBElement<GetIdEtudiantFromIdSujetResponse> createGetIdEtudiantFromIdSujetResponse(GetIdEtudiantFromIdSujetResponse value) {
        return new JAXBElement<GetIdEtudiantFromIdSujetResponse>(_GetIdEtudiantFromIdSujetResponse_QNAME, GetIdEtudiantFromIdSujetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIdCompteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "getIdCompteResponse")
    public JAXBElement<GetIdCompteResponse> createGetIdCompteResponse(GetIdCompteResponse value) {
        return new JAXBElement<GetIdCompteResponse>(_GetIdCompteResponse_QNAME, GetIdCompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPrenom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "getPrenom")
    public JAXBElement<GetPrenom> createGetPrenom(GetPrenom value) {
        return new JAXBElement<GetPrenom>(_GetPrenom_QNAME, GetPrenom.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSujetEtudiantNull }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "updateSujetEtudiantNull")
    public JAXBElement<UpdateSujetEtudiantNull> createUpdateSujetEtudiantNull(UpdateSujetEtudiantNull value) {
        return new JAXBElement<UpdateSujetEtudiantNull>(_UpdateSujetEtudiantNull_QNAME, UpdateSujetEtudiantNull.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMUFResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "getMUFResponse")
    public JAXBElement<GetMUFResponse> createGetMUFResponse(GetMUFResponse value) {
        return new JAXBElement<GetMUFResponse>(_GetMUFResponse_QNAME, GetMUFResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIdSujet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "getIdSujet")
    public JAXBElement<GetIdSujet> createGetIdSujet(GetIdSujet value) {
        return new JAXBElement<GetIdSujet>(_GetIdSujet_QNAME, GetIdSujet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIdEtudiantByIdSujetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "getIdEtudiantByIdSujetResponse")
    public JAXBElement<GetIdEtudiantByIdSujetResponse> createGetIdEtudiantByIdSujetResponse(GetIdEtudiantByIdSujetResponse value) {
        return new JAXBElement<GetIdEtudiantByIdSujetResponse>(_GetIdEtudiantByIdSujetResponse_QNAME, GetIdEtudiantByIdSujetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMCResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "getMCResponse")
    public JAXBElement<GetMCResponse> createGetMCResponse(GetMCResponse value) {
        return new JAXBElement<GetMCResponse>(_GetMCResponse_QNAME, GetMCResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMUF }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "getMUF")
    public JAXBElement<GetMUF> createGetMUF(GetMUF value) {
        return new JAXBElement<GetMUF>(_GetMUF_QNAME, GetMUF.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPrenomResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "getPrenomResponse")
    public JAXBElement<GetPrenomResponse> createGetPrenomResponse(GetPrenomResponse value) {
        return new JAXBElement<GetPrenomResponse>(_GetPrenomResponse_QNAME, GetPrenomResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLieuResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "getLieuResponse")
    public JAXBElement<GetLieuResponse> createGetLieuResponse(GetLieuResponse value) {
        return new JAXBElement<GetLieuResponse>(_GetLieuResponse_QNAME, GetLieuResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "getEmail")
    public JAXBElement<GetEmail> createGetEmail(GetEmail value) {
        return new JAXBElement<GetEmail>(_GetEmail_QNAME, GetEmail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIdCompte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "getIdCompte")
    public JAXBElement<GetIdCompte> createGetIdCompte(GetIdCompte value) {
        return new JAXBElement<GetIdCompte>(_GetIdCompte_QNAME, GetIdCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateEtudiantResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "updateEtudiantResponse")
    public JAXBElement<UpdateEtudiantResponse> createUpdateEtudiantResponse(UpdateEtudiantResponse value) {
        return new JAXBElement<UpdateEtudiantResponse>(_UpdateEtudiantResponse_QNAME, UpdateEtudiantResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIdSjt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "getIdSjt")
    public JAXBElement<GetIdSjt> createGetIdSjt(GetIdSjt value) {
        return new JAXBElement<GetIdSjt>(_GetIdSjt_QNAME, GetIdSjt.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompareMoyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "compareMoyResponse")
    public JAXBElement<CompareMoyResponse> createCompareMoyResponse(CompareMoyResponse value) {
        return new JAXBElement<CompareMoyResponse>(_CompareMoyResponse_QNAME, CompareMoyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIdEtudiantFromIdSujet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "getIdEtudiantFromIdSujet")
    public JAXBElement<GetIdEtudiantFromIdSujet> createGetIdEtudiantFromIdSujet(GetIdEtudiantFromIdSujet value) {
        return new JAXBElement<GetIdEtudiantFromIdSujet>(_GetIdEtudiantFromIdSujet_QNAME, GetIdEtudiantFromIdSujet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "getMC")
    public JAXBElement<GetMC> createGetMC(GetMC value) {
        return new JAXBElement<GetMC>(_GetMC_QNAME, GetMC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AvoirSujet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "avoirSujet")
    public JAXBElement<AvoirSujet> createAvoirSujet(AvoirSujet value) {
        return new JAXBElement<AvoirSujet>(_AvoirSujet_QNAME, AvoirSujet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "getEmailResponse")
    public JAXBElement<GetEmailResponse> createGetEmailResponse(GetEmailResponse value) {
        return new JAXBElement<GetEmailResponse>(_GetEmailResponse_QNAME, GetEmailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AvoirSujetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "avoirSujetResponse")
    public JAXBElement<AvoirSujetResponse> createAvoirSujetResponse(AvoirSujetResponse value) {
        return new JAXBElement<AvoirSujetResponse>(_AvoirSujetResponse_QNAME, AvoirSujetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIdSjtResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "getIdSjtResponse")
    public JAXBElement<GetIdSjtResponse> createGetIdSjtResponse(GetIdSjtResponse value) {
        return new JAXBElement<GetIdSjtResponse>(_GetIdSjtResponse_QNAME, GetIdSjtResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIdSujetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "getIdSujetResponse")
    public JAXBElement<GetIdSujetResponse> createGetIdSujetResponse(GetIdSujetResponse value) {
        return new JAXBElement<GetIdSujetResponse>(_GetIdSujetResponse_QNAME, GetIdSujetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSujetEtudiantNullResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "updateSujetEtudiantNullResponse")
    public JAXBElement<UpdateSujetEtudiantNullResponse> createUpdateSujetEtudiantNullResponse(UpdateSujetEtudiantNullResponse value) {
        return new JAXBElement<UpdateSujetEtudiantNullResponse>(_UpdateSujetEtudiantNullResponse_QNAME, UpdateSujetEtudiantNullResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSujetEtudiantResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "updateSujetEtudiantResponse")
    public JAXBElement<UpdateSujetEtudiantResponse> createUpdateSujetEtudiantResponse(UpdateSujetEtudiantResponse value) {
        return new JAXBElement<UpdateSujetEtudiantResponse>(_UpdateSujetEtudiantResponse_QNAME, UpdateSujetEtudiantResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIdEtudiantFromCompteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "getIdEtudiantFromCompteResponse")
    public JAXBElement<GetIdEtudiantFromCompteResponse> createGetIdEtudiantFromCompteResponse(GetIdEtudiantFromCompteResponse value) {
        return new JAXBElement<GetIdEtudiantFromCompteResponse>(_GetIdEtudiantFromCompteResponse_QNAME, GetIdEtudiantFromCompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIdEtudiantFromCompte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "getIdEtudiantFromCompte")
    public JAXBElement<GetIdEtudiantFromCompte> createGetIdEtudiantFromCompte(GetIdEtudiantFromCompte value) {
        return new JAXBElement<GetIdEtudiantFromCompte>(_GetIdEtudiantFromCompte_QNAME, GetIdEtudiantFromCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIdEtudiantByIdSujet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "getIdEtudiantByIdSujet")
    public JAXBElement<GetIdEtudiantByIdSujet> createGetIdEtudiantByIdSujet(GetIdEtudiantByIdSujet value) {
        return new JAXBElement<GetIdEtudiantByIdSujet>(_GetIdEtudiantByIdSujet_QNAME, GetIdEtudiantByIdSujet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNumero }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "getNumero")
    public JAXBElement<GetNumero> createGetNumero(GetNumero value) {
        return new JAXBElement<GetNumero>(_GetNumero_QNAME, GetNumero.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLieu }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "getLieu")
    public JAXBElement<GetLieu> createGetLieu(GetLieu value) {
        return new JAXBElement<GetLieu>(_GetLieu_QNAME, GetLieu.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNumeroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "getNumeroResponse")
    public JAXBElement<GetNumeroResponse> createGetNumeroResponse(GetNumeroResponse value) {
        return new JAXBElement<GetNumeroResponse>(_GetNumeroResponse_QNAME, GetNumeroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateEtudiant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "updateEtudiant")
    public JAXBElement<UpdateEtudiant> createUpdateEtudiant(UpdateEtudiant value) {
        return new JAXBElement<UpdateEtudiant>(_UpdateEtudiant_QNAME, UpdateEtudiant.class, null, value);
    }

}
