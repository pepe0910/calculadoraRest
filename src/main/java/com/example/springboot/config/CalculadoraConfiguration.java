package com.example.springboot.config;

import com.example.springboot.util.Tracer;
import io.corp.calculator.TracerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class CalculadoraConfiguration {

    @Bean
    public Tracer tracer() {
        return new Tracer();
    }

}
