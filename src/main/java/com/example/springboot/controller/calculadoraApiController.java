package com.example.springboot.controller;

import com.example.springboot.model.OperacionEnum;
import com.example.springboot.service.OperationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.math.BigInteger;


public class calculadoraApiController implements calculadoraApi {

    @Autowired
    OperationsService operationsService;

    @Override
    public ResponseEntity<BigInteger> calcular(BigInteger primerNumero, BigInteger segundoNumero, String operacion) {

        BigInteger resultado = null;
        OperacionEnum operacionEnum = OperacionEnum.valor(operacion);
        
        if (OperacionEnum.SUMA.equals(operacionEnum)) {
            resultado = operationsService.suma(primerNumero, segundoNumero);
        } else if (OperacionEnum.RESTA.equals(operacionEnum)) {
            resultado = operationsService.resta(primerNumero, segundoNumero);
        }

        return new ResponseEntity<>(resultado, HttpStatus.OK);
    }
}
