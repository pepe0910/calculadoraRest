package com.example.springboot.service;

import org.springframework.stereotype.Service;

import java.math.BigInteger;


public interface OperationsService {

    BigInteger suma(BigInteger numA, BigInteger numB);

    BigInteger resta(BigInteger numA, BigInteger numB);

}
