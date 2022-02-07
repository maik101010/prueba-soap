package com.prueba.prueba.http;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by michael.garcia on 6/02/2022
 */
@XmlRootElement(name = "employedRequest")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "names",
})
public class EmployedRequest {
    @XmlElement(required = true)
    protected String names;
    @XmlElement(required = true)
    protected String lastNames;
    @XmlElement(required = true)
    protected String typeDocument;
    @XmlElement(required = true)
    protected String document;
    @XmlElement(required = true)
    protected String birthDate;
    @XmlElement(required = true)
    protected String dateGetCompany;
    @XmlElement(required = true)
    protected String charge;
    @XmlElement(required = true)
    protected double salary;

    public EmployedRequest() {
    }

    public EmployedRequest(String names, String lastNames, String typeDocument, String document, String birthDate, String dateGetCompany, String charge, double salary) {
        this.names = names;
        this.lastNames = lastNames;
        this.typeDocument = typeDocument;
        this.document = document;
        this.birthDate = birthDate;
        this.dateGetCompany = dateGetCompany;
        this.charge = charge;
        this.salary = salary;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getLastNames() {
        return lastNames;
    }

    public void setLastNames(String lastNames) {
        this.lastNames = lastNames;
    }

    public String getTypeDocument() {
        return typeDocument;
    }

    public void setTypeDocument(String typeDocument) {
        this.typeDocument = typeDocument;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getDateGetCompany() {
        return dateGetCompany;
    }

    public void setDateGetCompany(String dateGetCompany) {
        this.dateGetCompany = dateGetCompany;
    }

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
