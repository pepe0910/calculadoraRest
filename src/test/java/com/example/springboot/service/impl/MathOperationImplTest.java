package com.example.springboot.service.impl;

import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.math.BigDecimal;

public class MathOperationImplTest {

    @InjectMocks
    private MathOperationImpl mathOperation;

    @BeforeClass
    public void initMocks() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSuma() {

        BigDecimal result = mathOperation.suma(BigDecimal.valueOf(1), BigDecimal.valueOf(1));
        Assert.assertNotNull(result);
        Assert.assertEquals(result, BigDecimal.valueOf(2));
    }

    @Test
    public void testResta() {

        BigDecimal result = mathOperation.resta(BigDecimal.valueOf(5), BigDecimal.valueOf(1));
        Assert.assertNotNull(result);
        Assert.assertEquals(result, BigDecimal.valueOf(4));
    }

    @Test
    public void testResta_negativa() {

        BigDecimal result = mathOperation.resta(BigDecimal.valueOf(5), BigDecimal.valueOf(9));
        Assert.assertNotNull(result);
        Assert.assertEquals(result, BigDecimal.valueOf(-4));
    }
}