package com.example.springcoredojo.Cuentas;

import com.example.springcoredojo.Entidades.Cliente;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


public class CajaDeAhorro implements Cuenta {



    private float cantidad;

    public CajaDeAhorro(float cantidad) {
        if(cantidad<1000){
            System.out.println("La cantidad minima para crear una cuenta son 1000");
        }else{
            this.cantidad=esquemaImpositivo(cantidad);
            System.out.println("Cuenta creada con exito "+ this.cantidad);
        }

    }

    public void deposito(float cantidad){
        this.cantidad+=cantidad;
        System.out.println("Deposito exitoso, saldo nuevo: "+this.cantidad);
    }

    public void retiro(float cantidad){
        if(fondosSuficientes(cantidad)){
            this.cantidad-=cantidad;
            System.out.println("Retiro exitoso, saldo nuevo: "+ this.cantidad);
        }
    }

    public boolean fondosSuficientes(float cantidad){
        return this.cantidad-cantidad>0 ? true:false;
    }

    public float getCantidad() {
        return cantidad;
    }


    @Override
    public float esquemaImpositivo(float cantidad) {
        return (float) (cantidad-(cantidad*0.15));
    }

    @Override
    public String tipoCuenta() {
        return "Caja de Ahorro";
    }
}
