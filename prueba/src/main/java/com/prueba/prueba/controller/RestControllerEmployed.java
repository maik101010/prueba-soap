package com.prueba.prueba.controller;

import com.prueba.prueba.domain.EmployedDomain;
import com.prueba.prueba.http.ErrorResponse;
import com.prueba.prueba.services.EmployedServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by michael.garcia on 6/02/2022
 */
@RestController
@RequestMapping("employed")
public class RestControllerEmployed {

    private EmployedServices employedServices;

    public RestControllerEmployed(EmployedServices employedServices) {
        this.employedServices = employedServices;
    }

    @GetMapping("/")
    public ResponseEntity<String> save(@RequestBody EmployedDomain employed) {
        if (!employed.validateData()) {
            return ResponseEntity.badRequest().body(new ErrorResponse().toString());
        }
        return ResponseEntity.ok(employedServices.save(employed).toString());
    }

}
