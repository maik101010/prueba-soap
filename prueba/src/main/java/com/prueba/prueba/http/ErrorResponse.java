package com.prueba.prueba.http;

/**
 * Created by michael.garcia on 6/02/2022
 */
public class ErrorResponse {
    private String message;

    public ErrorResponse() {
        this.message = "Error en validacion de datos";
    }

    @Override
    public String toString() {
        return "ErrorResponse{" +
                "message='" + message + '\'' +
                '}';
    }
}
