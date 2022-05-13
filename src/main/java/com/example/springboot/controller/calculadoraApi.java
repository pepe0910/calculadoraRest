package com.example.springboot.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
@RequestMapping("/api/v1")
public interface calculadoraApi {

    @GetMapping(value = "/calcula")
    public ResponseEntity<BigInteger> calcular(@RequestParam(name = "operador1") BigInteger primerNumero,
            @RequestParam(name = "operador2") BigInteger segundoNumero,
            @RequestParam(name = "operacion") String operacion);


}
