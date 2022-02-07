package com.prueba.prueba.model;

import com.prueba.prueba.constanst.Formatter;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;
import java.util.Objects;

/**
 * Created by michael.garcia on 6/02/2022
 */
public class EmployedModel {
    private String names;
    private String lastNames;
    private String typeDocument;
    private String document;
    private String birthDate;
    private String dateGetCompany;
    private String charge;
    private Double salary;

    public EmployedModel(String names, String lastNames, String typeDocument, String document, String birthDate, String dateGetCompany, String charge, Double salary) {
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

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployedModel{" +
                "names='" + names + '\'' +
                ", lastNames='" + lastNames + '\'' +
                ", typeDocument='" + typeDocument + '\'' +
                ", document='" + document + '\'' +
                ", birthDate=" + birthDate +
                ", dateGetCompany=" + dateGetCompany +
                ", charge='" + charge + '\'' +
                ", salary=" + salary +
                '}';
    }

    public boolean validateData() {
        boolean result = true;
        if (names == null || lastNames == null || typeDocument == null || document == null || birthDate == null || dateGetCompany == null || charge == null || salary == null) {
            return false;
        }
        if (names.isEmpty() || Objects.requireNonNull(lastNames).isEmpty() || typeDocument.isEmpty() || document.isEmpty() || charge.isEmpty()) {
            result = false;
        }
        if (!(typeDocument.equals("CC") || typeDocument.equals("TI") || typeDocument.equals("CE"))) {
            result = false;
        }
        if (salary < 0) {
            result = false;
        }
        if (!validateFormat(birthDate, dateGetCompany)) {
            result = false;
        }
        return result;
    }

    private boolean validateFormat(String birthDate, String dateGetCompany) {
        try {
            Formatter.dateTimeFormatter.parse(birthDate);
            Formatter.dateTimeFormatter.parse(dateGetCompany);
        } catch (DateTimeParseException e) {
            return false;
        }
        return true;
    }

    public LocalDate getTimeWithinCompany() {
        LocalDate dateGetCompany = LocalDate.parse(this.dateGetCompany, Formatter.dateTimeFormatter);
        Period period = Period.between(dateGetCompany, LocalDate.now());
        return LocalDate.of(period.getYears(), period.getMonths(), period.getDays());
    }

    public LocalDate getAge() {
        LocalDate age = LocalDate.parse(this.birthDate, Formatter.dateTimeFormatter);
        Period period = Period.between(age, LocalDate.now());
        return LocalDate.of(period.getYears(), period.getMonths(), period.getDays());
    }
}
