package com.example.springboot.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

public interface calculadoraApi {

    @GetMapping(value = "/calcula")
    public ResponseEntity<BigDecimal> calcular(@RequestParam(name = "operador1") BigDecimal primerNumero,
            @RequestParam(name = "operador2") BigDecimal segundoNumero,
            @RequestParam(name = "operacion") String operacion);


}
