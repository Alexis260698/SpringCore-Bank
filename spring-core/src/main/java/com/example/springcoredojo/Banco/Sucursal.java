package com.example.springcoredojo.Banco;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class Sucursal {
    private String direccion;

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Sucursal(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Sucursal{" +
                "direccion='" + direccion + '\'' +
                '}';
    }
}
