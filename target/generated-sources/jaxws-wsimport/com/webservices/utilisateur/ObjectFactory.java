
package com.webservices.utilisateur;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.webservices.utilisateur package. 
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

    private final static QName _GetId_QNAME = new QName("http://webservices.com/", "getId");
    private final static QName _GetRoleResponse_QNAME = new QName("http://webservices.com/", "getRoleResponse");
    private final static QName _GetRole_QNAME = new QName("http://webservices.com/", "getRole");
    private final static QName _CheckUserExist_QNAME = new QName("http://webservices.com/", "checkUserExist");
    private final static QName _GetIdResponse_QNAME = new QName("http://webservices.com/", "getIdResponse");
    private final static QName _CheckUserResponse_QNAME = new QName("http://webservices.com/", "checkUserResponse");
    private final static QName _CheckUserExistResponse_QNAME = new QName("http://webservices.com/", "checkUserExistResponse");
    private final static QName _CheckUser_QNAME = new QName("http://webservices.com/", "checkUser");
    private final static QName _GetPassResponse_QNAME = new QName("http://webservices.com/", "getPassResponse");
    private final static QName _GetPass_QNAME = new QName("http://webservices.com/", "getPass");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.webservices.utilisateur
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CheckUser }
     * 
     */
    public CheckUser createCheckUser() {
        return new CheckUser();
    }

    /**
     * Create an instance of {@link GetPass }
     * 
     */
    public GetPass createGetPass() {
        return new GetPass();
    }

    /**
     * Create an instance of {@link GetPassResponse }
     * 
     */
    public GetPassResponse createGetPassResponse() {
        return new GetPassResponse();
    }

    /**
     * Create an instance of {@link GetRole }
     * 
     */
    public GetRole createGetRole() {
        return new GetRole();
    }

    /**
     * Create an instance of {@link GetRoleResponse }
     * 
     */
    public GetRoleResponse createGetRoleResponse() {
        return new GetRoleResponse();
    }

    /**
     * Create an instance of {@link GetId }
     * 
     */
    public GetId createGetId() {
        return new GetId();
    }

    /**
     * Create an instance of {@link CheckUserExistResponse }
     * 
     */
    public CheckUserExistResponse createCheckUserExistResponse() {
        return new CheckUserExistResponse();
    }

    /**
     * Create an instance of {@link CheckUserResponse }
     * 
     */
    public CheckUserResponse createCheckUserResponse() {
        return new CheckUserResponse();
    }

    /**
     * Create an instance of {@link GetIdResponse }
     * 
     */
    public GetIdResponse createGetIdResponse() {
        return new GetIdResponse();
    }

    /**
     * Create an instance of {@link CheckUserExist }
     * 
     */
    public CheckUserExist createCheckUserExist() {
        return new CheckUserExist();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "getId")
    public JAXBElement<GetId> createGetId(GetId value) {
        return new JAXBElement<GetId>(_GetId_QNAME, GetId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRoleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "getRoleResponse")
    public JAXBElement<GetRoleResponse> createGetRoleResponse(GetRoleResponse value) {
        return new JAXBElement<GetRoleResponse>(_GetRoleResponse_QNAME, GetRoleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRole }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "getRole")
    public JAXBElement<GetRole> createGetRole(GetRole value) {
        return new JAXBElement<GetRole>(_GetRole_QNAME, GetRole.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckUserExist }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "checkUserExist")
    public JAXBElement<CheckUserExist> createCheckUserExist(CheckUserExist value) {
        return new JAXBElement<CheckUserExist>(_CheckUserExist_QNAME, CheckUserExist.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "getIdResponse")
    public JAXBElement<GetIdResponse> createGetIdResponse(GetIdResponse value) {
        return new JAXBElement<GetIdResponse>(_GetIdResponse_QNAME, GetIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "checkUserResponse")
    public JAXBElement<CheckUserResponse> createCheckUserResponse(CheckUserResponse value) {
        return new JAXBElement<CheckUserResponse>(_CheckUserResponse_QNAME, CheckUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckUserExistResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "checkUserExistResponse")
    public JAXBElement<CheckUserExistResponse> createCheckUserExistResponse(CheckUserExistResponse value) {
        return new JAXBElement<CheckUserExistResponse>(_CheckUserExistResponse_QNAME, CheckUserExistResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "checkUser")
    public JAXBElement<CheckUser> createCheckUser(CheckUser value) {
        return new JAXBElement<CheckUser>(_CheckUser_QNAME, CheckUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPassResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "getPassResponse")
    public JAXBElement<GetPassResponse> createGetPassResponse(GetPassResponse value) {
        return new JAXBElement<GetPassResponse>(_GetPassResponse_QNAME, GetPassResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPass }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.com/", name = "getPass")
    public JAXBElement<GetPass> createGetPass(GetPass value) {
        return new JAXBElement<GetPass>(_GetPass_QNAME, GetPass.class, null, value);
    }

}
