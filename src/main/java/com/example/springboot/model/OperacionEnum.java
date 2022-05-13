package com.example.springboot.model;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum OperacionEnum {
    SUMA("SUMA"),
    RESTA("RESTA");

    private static final OperacionEnum[] valores = new OperacionEnum[]{SUMA, RESTA};

    private String value;

    OperacionEnum(String value) {
        this.value = value;
    }

    private String getValue() {
        return this.value;
    }

    /**
     * convierte el valor obtenido en el enumerado para su posterior decision
     * para realizar la operacion correcta.
     * Como entrada podemos usar la palabra de la operacion ignoramos mayusculas
     *
     * @param valor
     * @return
     */
    @JsonCreator
    public static OperacionEnum valor(String valor) {

        for (int i = 0; i < valores.length; ++i) {
            OperacionEnum opActual = valores[i];
            if (valor.equalsIgnoreCase(opActual.name())) {
                return opActual;
            }
        }

        throw new RuntimeException("Operación no soportada para el valor: " + valor);
    }
}
