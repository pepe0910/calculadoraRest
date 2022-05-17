package com.example.springboot.service.impl;

import com.example.springboot.service.MathOperation;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class MathOperationImpl implements MathOperation {

    @Override
    public BigDecimal suma(BigDecimal numA, BigDecimal numB) {
        return numA.add(numB);
    }

    @Override
    public BigDecimal resta(BigDecimal numA, BigDecimal numB) {
        return numA.subtract(numB);
    }


}
