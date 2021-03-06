package com.prueba.prueba.client;

import com.prueba.prueba.domain.EmployedDomain;
import com.prueba.prueba.ws.EmployedRequest;
import com.prueba.prueba.ws.EmployedResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

/**
 * Created by michael.garcia on 6/02/2022
 * //
 */
@Component
public class EmployedClient extends WebServiceGatewaySupport {

    private static final Logger log = LoggerFactory.getLogger(EmployedClient.class);

    public EmployedResponse sendToWsAndSave(EmployedDomain employedModel) {
        EmployedRequest request = new EmployedRequest();
        request.setNames(employedModel.getNames());
        request.setLastNames(employedModel.getLastNames());
        request.setBirthDate(employedModel.getBirthDate());
        request.setSalary(employedModel.getSalary());
        request.setDocument(employedModel.getDocument());
        request.setCharge(employedModel.getCharge());
        request.setDateGetCompany(employedModel.getDateGetCompany());
        request.setTypeDocument(employedModel.getTypeDocument());

        log.info("Requesting location for " + request);
        //TODO: It's messing the implementation
//        EmployedResponse response = (EmployedResponse) getWebServiceTemplate()
//                .marshalSendAndReceive("http://localhost:8080/ws/employees", request,
//                        new SoapActionCallback(
//                                "http://spring.io/guides/gs-producing-web-service/EmployedRequest"));
        return null;
    }

}
