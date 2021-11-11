package com.example.springcoredojo.Banco;

import com.example.springcoredojo.Entidades.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;


public class Banco {

    private ArrayList<Cliente> clientes;
    private ArrayList<Sucursal> sucursales;
    private String nombre;

    private static  Banco instancia;

    public static Banco getInstance(ArrayList<Cliente>clientes, ArrayList<Sucursal> sucursales,String nombre){
        if(instancia== null){
            instancia=new Banco(clientes,sucursales,nombre);
        }
        return instancia;
    }

    public Banco(){}

    public Banco(ArrayList<Cliente> clientes, ArrayList<Sucursal> sucursales, String nombre) {
        this.clientes = clientes;
        this.sucursales = sucursales;
        nombre = nombre;
    }

    public void addCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Sucursal> getSucursales() {
        return sucursales;
    }

    public void setSucursales(ArrayList<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        nombre = nombre;
    }
}
