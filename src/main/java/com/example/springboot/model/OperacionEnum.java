package com.example.springboot.model;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum OperacionEnum {
    SUMA("+"),
    RESTA("-");

    private static final OperacionEnum[] valores = new OperacionEnum[]{SUMA, RESTA};

    private String signo;

    OperacionEnum(String signo) {
        this.signo = signo;
    }

    private String getSigno() {
        return this.signo;
    }

    /**
     * convierte el valor obtenido en el enumerado para su posterior decision
     * para realizar la operacion correcta.
     * Como entrada podemos usar la palabra de la operacion ignoramos mayusculas y el signo.
     * @param valor
     * @return
     */
    @JsonCreator
    public static OperacionEnum valor(String valor) {

        for (int i = 0; i < valores.length; ++i) {
            OperacionEnum opActual = valores[i];
            if (valor.equalsIgnoreCase(opActual.name()) ||
                valor.equalsIgnoreCase(opActual.getSigno())) {
                return opActual;
            }
        }

        throw new RuntimeException("Operación no soportada para el valor: " + valor);
    }
}
