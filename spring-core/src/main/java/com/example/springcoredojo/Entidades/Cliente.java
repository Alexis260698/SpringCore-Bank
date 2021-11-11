package com.example.springcoredojo.Entidades;

import com.example.springcoredojo.Cuentas.Cuenta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

public class Cliente {

    private String nombre;

    private String apellido;

    private ArrayList<Cuenta> cuentas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public void setCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public Cliente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuentas= new ArrayList<>();

    }

    public void cerrarCuenta(String tipo){

        for(int i=0; i<cuentas.size();i++){
            Cuenta c=cuentas.get(i);
            String clase=c.getClass()+"";
            int a=clase.indexOf(tipo);
            if(a != - 1){
            cuentas.remove(cuentas.get(i));
                System.out.println("Cuenta eliminada con exito");
            }
        }
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cuentas=" + cuentas +
                '}';
    }
}
