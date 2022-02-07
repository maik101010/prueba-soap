package com.prueba.prueba.controller;

import com.prueba.prueba.constanst.Formatter;
import com.prueba.prueba.entity.Employed;
import com.prueba.prueba.repository.EmployedRepository;
import com.prueba.prueba.ws.EmployedRequest;
import com.prueba.prueba.ws.EmployedResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.time.LocalDate;

/**
 * Created by michael.garcia on 6/02/2022
 */
@Endpoint
public class XmlControllerEmployed {
    //    private static final String NAMESPACE_URI = "localhost:8080/gs-producing-web-service";
    private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

    private final EmployedRepository employedRepository;

    public XmlControllerEmployed(EmployedRepository employedRepository) {
        this.employedRepository = employedRepository;
    }


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "employedRequest")
    @ResponsePayload
    public EmployedResponse saveEmployed(@RequestPayload EmployedRequest request) {
        EmployedResponse response = new EmployedResponse();
        response.setNames(request.getNames());
        employedRepository.save(mapperRequestToEntity(request));
        return response;
    }

    private Employed mapperRequestToEntity(EmployedRequest request) {
        Employed employed = new Employed();
        employed.setNames(request.getNames());
        employed.setLastNames(request.getLastNames());
        employed.setBirthDate(LocalDate.parse(request.getBirthDate(), Formatter.dateTimeFormatter));
        employed.setSalary(request.getSalary());
        employed.setDocument(request.getDocument());
        employed.setCharge(request.getCharge());
        employed.setDateGetCompany(LocalDate.parse(request.getBirthDate(), Formatter.dateTimeFormatter));
        employed.setTypeDocument(request.getTypeDocument());

        return employed;
    }
}

