package com.example.springboot.service.impl;

import com.example.springboot.service.OperationsService;

import java.math.BigInteger;

public class OperationsServiceImpl implements OperationsService {


    @Override
    public BigInteger suma(BigInteger numA, BigInteger numB) {
        return numA.add(numB);
    }

    @Override
    public BigInteger resta(BigInteger numA, BigInteger numB) {
        return numA.subtract(numB);
    }
}
