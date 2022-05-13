package com.example.springboot.controller;

import com.example.springboot.model.OperacionEnum;
import com.example.springboot.service.OperationsService;
import io.corp.calculator.TracerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
@RequestMapping("/api/v1")
public class calculadoraApiController implements calculadoraApi {

    @Autowired
    OperationsService operationsService;

    private TracerImpl tracer = new TracerImpl();

    @Override
    public ResponseEntity<BigInteger> calcular(BigInteger primerNumero, BigInteger segundoNumero, String operacion) {

        BigInteger    resultado     = null;
        OperacionEnum operacionEnum = OperacionEnum.valor(operacion);


        if (OperacionEnum.SUMA.equals(operacionEnum)) {
            resultado = operationsService.suma(primerNumero, segundoNumero);
        } else if (OperacionEnum.RESTA.equals(operacionEnum)) {
            resultado = operationsService.resta(primerNumero, segundoNumero);
        }
        tracer.trace(resultado);

        return new ResponseEntity<>(resultado, HttpStatus.OK);
    }
}
