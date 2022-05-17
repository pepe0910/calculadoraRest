package com.example.springboot.service.impl;

import com.example.springboot.service.MathOperation;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.math.BigDecimal;

import static org.mockito.Mockito.when;
import static org.testng.Assert.*;

public class OperationsServiceImplTest {

    @InjectMocks
    private OperationsServiceImpl operationsService;

    @Mock
    private MathOperationImpl mathOperation;

    @BeforeClass
    public void initMocks() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testRealizaOperacion_suma() {
        when(mathOperation.suma(BigDecimal.valueOf(1), BigDecimal.valueOf(1))).thenReturn(BigDecimal.valueOf(2));

        BigDecimal result = operationsService.realizaOperacion(BigDecimal.valueOf(1), BigDecimal.valueOf(1), "suma");
        Assert.assertNotNull(result);
        Assert.assertEquals(result, BigDecimal.valueOf(2));
    }

    @Test
    public void testRealizaOperacion_resta() {
        when(mathOperation.resta(BigDecimal.valueOf(1), BigDecimal.valueOf(1))).thenReturn(BigDecimal.valueOf(0));

        BigDecimal result = operationsService.realizaOperacion(BigDecimal.valueOf(1), BigDecimal.valueOf(1), "resta");
        Assert.assertNotNull(result);
        Assert.assertEquals(result, BigDecimal.valueOf(0));
    }

    @Test
    public void testRealizaOperacion_notSoportada() {
        try {
            operationsService.realizaOperacion(BigDecimal.valueOf(1), BigDecimal.valueOf(1), "otraOper");
            Assert.fail();
        } catch (Exception ex) {
            Assert.assertNotNull(ex);
            Assert.assertEquals(ex.getMessage(), "Operación no soportada para el valor: otraOper" );
        }

    }
}