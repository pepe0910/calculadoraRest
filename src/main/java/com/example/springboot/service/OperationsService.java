package com.example.springboot.service;

import java.math.BigDecimal;


public interface OperationsService {

    BigDecimal realizaOperacion(BigDecimal numA, BigDecimal numB, String operacion);

}
