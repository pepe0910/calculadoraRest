package com.example.springboot.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class OperationsServiceTest {

    OperationsService operationsService = OperationsServiceImpl();

    @Test
    void suma() {
        BigInteger result = operationsService.suma(BigInteger.valueOf(1), BigInteger.valueOf(1));
        Assertions.assertNull(result);
        Assertions.assertEquals(result, BigInteger.valueOf(2));
    }

    @Test
    void resta() {
        BigInteger result = operationsService.resta(BigInteger.valueOf(1), BigInteger.valueOf(1));
        Assertions.assertNull(result);
        Assertions.assertEquals(result, BigInteger.valueOf(0));
    }
}