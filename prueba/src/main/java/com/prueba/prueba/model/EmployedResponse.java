package com.prueba.prueba.model;

import java.time.LocalDate;

/**
 * Created by michael.garcia on 6/02/2022
 */
public class EmployedResponse {
    private LocalDate timeWithinCompany;
    private LocalDate age;

    public EmployedResponse() {
    }

    public EmployedResponse(LocalDate timeWithinCompany, LocalDate age) {
        this.timeWithinCompany = timeWithinCompany;
        this.age = age;
    }

    public LocalDate getTimeWithinCompany() {
        return timeWithinCompany;
    }

    public void setTimeWithinCompany(LocalDate timeWithinCompany) {
        this.timeWithinCompany = timeWithinCompany;
    }

    public LocalDate getAge() {
        return age;
    }

    public void setAge(LocalDate age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "EmployedResponse{" +
                "timeWithinCompany=" + timeWithinCompany +
                ", age=" + age +
                '}';
    }
}
