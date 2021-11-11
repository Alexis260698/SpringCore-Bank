package com.example.springcoredojo.Entorno;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("Produccion")
public class EntornoProduccion implements Entorno {

    @Override
    public String configuracion() {
        return "Entorno de Produccion";
    }
}
