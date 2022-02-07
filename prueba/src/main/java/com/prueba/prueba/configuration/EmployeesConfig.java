package com.prueba.prueba.configuration;


import com.prueba.prueba.client.EmployedClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

/**
 * Created by michael.garcia on 6/02/2022
 */
@Configuration
public class EmployeesConfig {
//    @Bean
//    public Jaxb2Marshaller marshaller() {
//        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
//        // this package must match the package in the <generatePackage> specified in
//        // pom.xml
//        marshaller.setContextPath("com.prueba.prueba.test");
//        return marshaller;
//    }
//
//    @Bean
//    public EmployedClient countryClient(Jaxb2Marshaller marshaller) {
//        EmployedClient client = new EmployedClient();
//        client.setDefaultUri("http://localhost:8080/ws");
//        client.setMarshaller(marshaller);
//        client.setUnmarshaller(marshaller);
//        return client;
//    }
}