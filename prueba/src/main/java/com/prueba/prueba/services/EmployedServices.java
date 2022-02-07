package com.prueba.prueba.services;

import com.prueba.prueba.client.EmployedClient;
import com.prueba.prueba.model.EmployedModel;
import com.prueba.prueba.model.EmployedResponse;
import com.prueba.prueba.repository.EmployedRepository;
import org.springframework.stereotype.Service;

/**
 * Created by michael.garcia on 6/02/2022
 */
@Service
public class EmployedServices {

    private EmployedRepository employedRepository;
    private EmployedClient employedClient;


    public EmployedServices(EmployedRepository employedRepository, EmployedClient employedClient) {
        this.employedRepository = employedRepository;
        this.employedClient = employedClient;
    }

    public EmployedResponse save(EmployedModel employed) {
        //call to another services
        employedClient.sendToWsAndSave(employed);
        EmployedResponse employedResponse = new EmployedResponse();
        employedResponse.setTimeWithinCompany(employed.getTimeWithinCompany());
        employedResponse.setAge(employed.getAge());
        return employedResponse;
    }
}
