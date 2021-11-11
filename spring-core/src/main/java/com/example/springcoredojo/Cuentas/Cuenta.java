package com.example.springcoredojo.Cuentas;

import org.springframework.stereotype.Component;


public interface Cuenta {

    float esquemaImpositivo(float cantidad);

    String tipoCuenta();

}
