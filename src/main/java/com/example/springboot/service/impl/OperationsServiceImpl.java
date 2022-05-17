package com.example.springboot.service.impl;

import com.example.springboot.model.OperacionEnum;
import com.example.springboot.service.MathOperation;
import com.example.springboot.service.OperationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class OperationsServiceImpl implements OperationsService {

    @Autowired
    MathOperation mathOperation;

    @Override
    public BigDecimal realizaOperacion(BigDecimal operadorA, BigDecimal operadorB, String operacion) {
        BigDecimal    resultado     = null;
        OperacionEnum operacionEnum = OperacionEnum.valor(operacion);

        if (OperacionEnum.SUMA.equals(operacionEnum)) {
            resultado = mathOperation.suma(operadorA, operadorB);
        } else if (OperacionEnum.RESTA.equals(operacionEnum)) {
            resultado = mathOperation.resta(operadorA, operadorB);
        }

        return resultado;
    }


}
