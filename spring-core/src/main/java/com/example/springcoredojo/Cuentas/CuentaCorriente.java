package com.example.springcoredojo.Cuentas;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


public class CuentaCorriente implements Cuenta{

    private float cantidad;

    public CuentaCorriente(float cantidad) {
        if(cantidad<1000){
            System.out.println("La cantidad minima para crear una cuenta son 1000");
        }else{
            this.cantidad=esquemaImpositivo(cantidad);
            System.out.println("Cuenta creada con exito "+ this.cantidad);
        }
    }

    public float getCantidad() {
        return cantidad;
    }

    public void deposito(float cantidad){
        this.cantidad+=cantidad;
        System.out.println("Deposito exitoso, saldo nuevo: "+this.cantidad);
    }

    public void retiro(float cantidad){
        this.cantidad-=cantidad;
        System.out.println("retito exitoso, saldo nuevo: "+this.cantidad);
    }

    @Override
    public String tipoCuenta() {
        return "Cuenta Corriente";
    }

    @Override
    public float esquemaImpositivo(float cantidad) {
        return (float) (cantidad-(cantidad*0.19));
    }
}
