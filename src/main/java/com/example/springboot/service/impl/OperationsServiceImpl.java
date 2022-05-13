package com.example.springboot.service.impl;

import com.example.springboot.service.OperationsService;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
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
