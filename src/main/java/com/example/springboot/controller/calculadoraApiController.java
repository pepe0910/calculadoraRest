package com.example.springboot.controller;

import com.example.springboot.service.OperationsService;
import com.example.springboot.util.Tracer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/api/v1")
public class calculadoraApiController implements calculadoraApi {

    @Autowired
    private OperationsService operationsService;

    @Autowired
    private Tracer tracer;

    @Override
    public ResponseEntity<BigDecimal> calcular(BigDecimal primerNumero, BigDecimal segundoNumero, String operacion) {

        BigDecimal resultado = null;
        try {
            resultado = operationsService.realizaOperacion(primerNumero, segundoNumero, operacion);
            tracer.trace(primerNumero + " " + operacion + " " + segundoNumero + " = " + resultado);
        } catch (Exception ex) {
            tracer.trace(ex.getMessage());
            throw ex;
        }
        return new ResponseEntity<>(resultado, HttpStatus.OK);

    }


    @ExceptionHandler({Exception.class})
    public ResponseEntity<String> handleException(Exception ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }
}
