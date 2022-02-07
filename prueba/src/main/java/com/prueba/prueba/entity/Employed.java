package com.prueba.prueba.entity;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * Created by michael.garcia on 6/02/2022
 */
@Entity
@Table(name = "empleado")
public class Employed {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "nombres")
    private String names;
    @Column(name = "apellidos")
    private String lastNames;
    @Column(name = "tipo_documento")
    private String typeDocument;
    @Column(name = "numero_documento")
    private String document;
    @Column(name = "fecha_nacimiento")
    private LocalDate birthDate;
    @Column(name = "fecha_company")
    private LocalDate dateGetCompany;
    @Column(name = "cargo")
    private String charge;
    @Column(name = "salario")
    private Double salary;

    public Employed(Long id, String names, String lastNames, String typeDocument, String document, LocalDate birthDate, LocalDate dateGetCompany, String charge, Double salary) {
        this.id = id;
        this.names = names;
        this.lastNames = lastNames;
        this.typeDocument = typeDocument;
        this.document = document;
        this.birthDate = birthDate;
        this.dateGetCompany = dateGetCompany;
        this.charge = charge;
        this.salary = salary;
    }

    public Employed() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDate getDateGetCompany() {
        return dateGetCompany;
    }

    public void setDateGetCompany(LocalDate dateGetCompany) {
        this.dateGetCompany = dateGetCompany;
    }

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employed{" +
                "id=" + id +
                ", names='" + names + '\'' +
                ", lastNames='" + lastNames + '\'' +
                ", typeDocument='" + typeDocument + '\'' +
                ", document='" + document + '\'' +
                ", birthDate=" + birthDate +
                ", dateGetCompany=" + dateGetCompany +
                ", charge='" + charge + '\'' +
                ", salary=" + salary +
                '}';
    }
}
