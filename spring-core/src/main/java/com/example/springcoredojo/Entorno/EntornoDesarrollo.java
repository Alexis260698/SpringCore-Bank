package com.example.springcoredojo.Entorno;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("Desarrollo")
public class EntornoDesarrollo implements Entorno{

    @Override
    public String configuracion() {
        return "Desarrollo";
    }
}
