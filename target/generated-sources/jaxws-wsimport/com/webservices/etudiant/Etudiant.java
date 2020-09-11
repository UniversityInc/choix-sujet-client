
package com.webservices.etudiant;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Etudiant", targetNamespace = "http://webservices.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Etudiant {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getDate", targetNamespace = "http://webservices.com/", className = "com.webservices.etudiant.GetDate")
    @ResponseWrapper(localName = "getDateResponse", targetNamespace = "http://webservices.com/", className = "com.webservices.etudiant.GetDateResponse")
    @Action(input = "http://webservices.com/Etudiant/getDateRequest", output = "http://webservices.com/Etudiant/getDateResponse")
    public String getDate(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getIdEtudiantByIdSujet", targetNamespace = "http://webservices.com/", className = "com.webservices.etudiant.GetIdEtudiantByIdSujet")
    @ResponseWrapper(localName = "getIdEtudiantByIdSujetResponse", targetNamespace = "http://webservices.com/", className = "com.webservices.etudiant.GetIdEtudiantByIdSujetResponse")
    @Action(input = "http://webservices.com/Etudiant/getIdEtudiantByIdSujetRequest", output = "http://webservices.com/Etudiant/getIdEtudiantByIdSujetResponse")
    public String getIdEtudiantByIdSujet(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "updateSujetEtudiantNull", targetNamespace = "http://webservices.com/", className = "com.webservices.etudiant.UpdateSujetEtudiantNull")
    @ResponseWrapper(localName = "updateSujetEtudiantNullResponse", targetNamespace = "http://webservices.com/", className = "com.webservices.etudiant.UpdateSujetEtudiantNullResponse")
    @Action(input = "http://webservices.com/Etudiant/updateSujetEtudiantNullRequest", output = "http://webservices.com/Etudiant/updateSujetEtudiantNullResponse")
    public void updateSujetEtudiantNull(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getIdEtudiantFromIdSujet", targetNamespace = "http://webservices.com/", className = "com.webservices.etudiant.GetIdEtudiantFromIdSujet")
    @ResponseWrapper(localName = "getIdEtudiantFromIdSujetResponse", targetNamespace = "http://webservices.com/", className = "com.webservices.etudiant.GetIdEtudiantFromIdSujetResponse")
    @Action(input = "http://webservices.com/Etudiant/getIdEtudiantFromIdSujetRequest", output = "http://webservices.com/Etudiant/getIdEtudiantFromIdSujetResponse")
    public int getIdEtudiantFromIdSujet(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getIdEtudiantFromCompte", targetNamespace = "http://webservices.com/", className = "com.webservices.etudiant.GetIdEtudiantFromCompte")
    @ResponseWrapper(localName = "getIdEtudiantFromCompteResponse", targetNamespace = "http://webservices.com/", className = "com.webservices.etudiant.GetIdEtudiantFromCompteResponse")
    @Action(input = "http://webservices.com/Etudiant/getIdEtudiantFromCompteRequest", output = "http://webservices.com/Etudiant/getIdEtudiantFromCompteResponse")
    public int getIdEtudiantFromCompte(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "updateSujetEtudiant", targetNamespace = "http://webservices.com/", className = "com.webservices.etudiant.UpdateSujetEtudiant")
    @ResponseWrapper(localName = "updateSujetEtudiantResponse", targetNamespace = "http://webservices.com/", className = "com.webservices.etudiant.UpdateSujetEtudiantResponse")
    @Action(input = "http://webservices.com/Etudiant/updateSujetEtudiantRequest", output = "http://webservices.com/Etudiant/updateSujetEtudiantResponse")
    public void updateSujetEtudiant(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getNom", targetNamespace = "http://webservices.com/", className = "com.webservices.etudiant.GetNom")
    @ResponseWrapper(localName = "getNomResponse", targetNamespace = "http://webservices.com/", className = "com.webservices.etudiant.GetNomResponse")
    @Action(input = "http://webservices.com/Etudiant/getNomRequest", output = "http://webservices.com/Etudiant/getNomResponse")
    public String getNom(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPrenom", targetNamespace = "http://webservices.com/", className = "com.webservices.etudiant.GetPrenom")
    @ResponseWrapper(localName = "getPrenomResponse", targetNamespace = "http://webservices.com/", className = "com.webservices.etudiant.GetPrenomResponse")
    @Action(input = "http://webservices.com/Etudiant/getPrenomRequest", output = "http://webservices.com/Etudiant/getPrenomResponse")
    public String getPrenom(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getIdSjt", targetNamespace = "http://webservices.com/", className = "com.webservices.etudiant.GetIdSjt")
    @ResponseWrapper(localName = "getIdSjtResponse", targetNamespace = "http://webservices.com/", className = "com.webservices.etudiant.GetIdSjtResponse")
    @Action(input = "http://webservices.com/Etudiant/getIdSjtRequest", output = "http://webservices.com/Etudiant/getIdSjtResponse")
    public int getIdSjt(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getIdSujet", targetNamespace = "http://webservices.com/", className = "com.webservices.etudiant.GetIdSujet")
    @ResponseWrapper(localName = "getIdSujetResponse", targetNamespace = "http://webservices.com/", className = "com.webservices.etudiant.GetIdSujetResponse")
    @Action(input = "http://webservices.com/Etudiant/getIdSujetRequest", output = "http://webservices.com/Etudiant/getIdSujetResponse")
    public int getIdSujet(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "avoirSujet", targetNamespace = "http://webservices.com/", className = "com.webservices.etudiant.AvoirSujet")
    @ResponseWrapper(localName = "avoirSujetResponse", targetNamespace = "http://webservices.com/", className = "com.webservices.etudiant.AvoirSujetResponse")
    @Action(input = "http://webservices.com/Etudiant/avoirSujetRequest", output = "http://webservices.com/Etudiant/avoirSujetResponse")
    public boolean avoirSujet(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getIdCompte", targetNamespace = "http://webservices.com/", className = "com.webservices.etudiant.GetIdCompte")
    @ResponseWrapper(localName = "getIdCompteResponse", targetNamespace = "http://webservices.com/", className = "com.webservices.etudiant.GetIdCompteResponse")
    @Action(input = "http://webservices.com/Etudiant/getIdCompteRequest", output = "http://webservices.com/Etudiant/getIdCompteResponse")
    public int getIdCompte(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getNumero", targetNamespace = "http://webservices.com/", className = "com.webservices.etudiant.GetNumero")
    @ResponseWrapper(localName = "getNumeroResponse", targetNamespace = "http://webservices.com/", className = "com.webservices.etudiant.GetNumeroResponse")
    @Action(input = "http://webservices.com/Etudiant/getNumeroRequest", output = "http://webservices.com/Etudiant/getNumeroResponse")
    public String getNumero(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getLieu", targetNamespace = "http://webservices.com/", className = "com.webservices.etudiant.GetLieu")
    @ResponseWrapper(localName = "getLieuResponse", targetNamespace = "http://webservices.com/", className = "com.webservices.etudiant.GetLieuResponse")
    @Action(input = "http://webservices.com/Etudiant/getLieuRequest", output = "http://webservices.com/Etudiant/getLieuResponse")
    public String getLieu(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getEmail", targetNamespace = "http://webservices.com/", className = "com.webservices.etudiant.GetEmail")
    @ResponseWrapper(localName = "getEmailResponse", targetNamespace = "http://webservices.com/", className = "com.webservices.etudiant.GetEmailResponse")
    @Action(input = "http://webservices.com/Etudiant/getEmailRequest", output = "http://webservices.com/Etudiant/getEmailResponse")
    public String getEmail(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns float
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getMC", targetNamespace = "http://webservices.com/", className = "com.webservices.etudiant.GetMC")
    @ResponseWrapper(localName = "getMCResponse", targetNamespace = "http://webservices.com/", className = "com.webservices.etudiant.GetMCResponse")
    @Action(input = "http://webservices.com/Etudiant/getMCRequest", output = "http://webservices.com/Etudiant/getMCResponse")
    public float getMC(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns float
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getMUF", targetNamespace = "http://webservices.com/", className = "com.webservices.etudiant.GetMUF")
    @ResponseWrapper(localName = "getMUFResponse", targetNamespace = "http://webservices.com/", className = "com.webservices.etudiant.GetMUFResponse")
    @Action(input = "http://webservices.com/Etudiant/getMUFRequest", output = "http://webservices.com/Etudiant/getMUFResponse")
    public float getMUF(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg5
     * @param arg4
     * @param arg1
     * @param arg0
     * @param arg7
     * @param arg6
     * @param arg8
     */
    @WebMethod
    @RequestWrapper(localName = "updateEtudiant", targetNamespace = "http://webservices.com/", className = "com.webservices.etudiant.UpdateEtudiant")
    @ResponseWrapper(localName = "updateEtudiantResponse", targetNamespace = "http://webservices.com/", className = "com.webservices.etudiant.UpdateEtudiantResponse")
    @Action(input = "http://webservices.com/Etudiant/updateEtudiantRequest", output = "http://webservices.com/Etudiant/updateEtudiantResponse")
    public void updateEtudiant(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        String arg4,
        @WebParam(name = "arg5", targetNamespace = "")
        String arg5,
        @WebParam(name = "arg6", targetNamespace = "")
        String arg6,
        @WebParam(name = "arg7", targetNamespace = "")
        String arg7,
        @WebParam(name = "arg8", targetNamespace = "")
        String arg8);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "compareMoy", targetNamespace = "http://webservices.com/", className = "com.webservices.etudiant.CompareMoy")
    @ResponseWrapper(localName = "compareMoyResponse", targetNamespace = "http://webservices.com/", className = "com.webservices.etudiant.CompareMoyResponse")
    @Action(input = "http://webservices.com/Etudiant/compareMoyRequest", output = "http://webservices.com/Etudiant/compareMoyResponse")
    public int compareMoy(
        @WebParam(name = "arg0", targetNamespace = "")
        float arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        float arg1);

}
