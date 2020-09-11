
package com.webservices.sujet;

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
@WebService(name = "Sujet", targetNamespace = "http://webservices.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Sujet {


    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "updateSujet", targetNamespace = "http://webservices.com/", className = "com.webservices.sujet.UpdateSujet")
    @ResponseWrapper(localName = "updateSujetResponse", targetNamespace = "http://webservices.com/", className = "com.webservices.sujet.UpdateSujetResponse")
    @Action(input = "http://webservices.com/Sujet/updateSujetRequest", output = "http://webservices.com/Sujet/updateSujetResponse")
    public void updateSujet(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getIdEns", targetNamespace = "http://webservices.com/", className = "com.webservices.sujet.GetIdEns")
    @ResponseWrapper(localName = "getIdEnsResponse", targetNamespace = "http://webservices.com/", className = "com.webservices.sujet.GetIdEnsResponse")
    @Action(input = "http://webservices.com/Sujet/getIdEnsRequest", output = "http://webservices.com/Sujet/getIdEnsResponse")
    public int getIdEns(
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
    @RequestWrapper(localName = "getPris", targetNamespace = "http://webservices.com/", className = "com.webservices.sujet.GetPris")
    @ResponseWrapper(localName = "getPrisResponse", targetNamespace = "http://webservices.com/", className = "com.webservices.sujet.GetPrisResponse")
    @Action(input = "http://webservices.com/Sujet/getPrisRequest", output = "http://webservices.com/Sujet/getPrisResponse")
    public int getPris(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "addSujet", targetNamespace = "http://webservices.com/", className = "com.webservices.sujet.AddSujet")
    @ResponseWrapper(localName = "addSujetResponse", targetNamespace = "http://webservices.com/", className = "com.webservices.sujet.AddSujetResponse")
    @Action(input = "http://webservices.com/Sujet/addSujetRequest", output = "http://webservices.com/Sujet/addSujetResponse")
    public void addSujet(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "checkDispo", targetNamespace = "http://webservices.com/", className = "com.webservices.sujet.CheckDispo")
    @ResponseWrapper(localName = "checkDispoResponse", targetNamespace = "http://webservices.com/", className = "com.webservices.sujet.CheckDispoResponse")
    @Action(input = "http://webservices.com/Sujet/checkDispoRequest", output = "http://webservices.com/Sujet/checkDispoResponse")
    public String checkDispo(
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
    @RequestWrapper(localName = "getTitre", targetNamespace = "http://webservices.com/", className = "com.webservices.sujet.GetTitre")
    @ResponseWrapper(localName = "getTitreResponse", targetNamespace = "http://webservices.com/", className = "com.webservices.sujet.GetTitreResponse")
    @Action(input = "http://webservices.com/Sujet/getTitreRequest", output = "http://webservices.com/Sujet/getTitreResponse")
    public String getTitre(
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
    @RequestWrapper(localName = "getEnonce", targetNamespace = "http://webservices.com/", className = "com.webservices.sujet.GetEnonce")
    @ResponseWrapper(localName = "getEnonceResponse", targetNamespace = "http://webservices.com/", className = "com.webservices.sujet.GetEnonceResponse")
    @Action(input = "http://webservices.com/Sujet/getEnonceRequest", output = "http://webservices.com/Sujet/getEnonceResponse")
    public String getEnonce(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

}
