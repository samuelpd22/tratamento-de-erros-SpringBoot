package com.studing.handler;

import com.studing.infra.ResourceNotFoundDetails;
import com.studing.infra.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Date;

@ControllerAdvice // controle de retorno de excpetion
public class RestExceptionHandler {
    @ExceptionHandler (ResourceNotFoundException.class)
    public ResponseEntity<?> handleResourceNotFoundException(ResourceNotFoundException rfnException){
        ResourceNotFoundDetails rfnDetails = ResourceNotFoundDetails.ResourceNotFoundDetailsBuilder
                .newBuilder().title("Não encontrado ")
                .status(HttpStatus.NOT_FOUND.value())
                .details(rfnException.getMessage())
                .devMessage(rfnException.getClass().getName()).build();
    return new ResponseEntity<>(rfnDetails, HttpStatus.NOT_FOUND);
    }
}
