package com.example.springboot.service;

import com.example.springboot.service.impl.OperationsServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

class OperationsServiceTest {

    OperationsService operationsService = new OperationsServiceImpl();

    @Test
    void suma() {
        BigInteger result = operationsService.suma(BigInteger.valueOf(1), BigInteger.valueOf(1));
        Assertions.assertNotNull(result);
        Assertions.assertEquals(result, BigInteger.valueOf(2));
    }

    @Test
    void resta() {
        BigInteger result = operationsService.resta(BigInteger.valueOf(1), BigInteger.valueOf(1));
        Assertions.assertNotNull(result);
        Assertions.assertEquals(result, BigInteger.valueOf(0));
    }
}