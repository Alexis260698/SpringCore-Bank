package com.example.springcoredojo;

import com.example.springcoredojo.Banco.Banco;
import com.example.springcoredojo.Banco.Sucursal;
import com.example.springcoredojo.Configuration.AppConfiguration;
import com.example.springcoredojo.Cuentas.CajaDeAhorro;
import com.example.springcoredojo.Cuentas.CuentaCorriente;
import com.example.springcoredojo.Entidades.Cliente;
import com.example.springcoredojo.Entorno.Entorno;
import com.example.springcoredojo.Entorno.EntornoDesarrollo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;

import java.util.ArrayList;

@SpringBootApplication
public class SpringCoreDojoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreDojoApplication.class, args);

		ApplicationContext appcontext = new ClassPathXmlApplicationContext("Configuracion.xml");
		Entorno entorno= (Entorno) appcontext.getBean("Entorno");

		if(entorno.configuracion().equals("Desarrollo")){
			System.out.println("\n"+"NOTA: Actualmente te encuentras en el entorno de desarrollo"+"\n"
			+"Por lo tanto las operaciones realizadas NO son con dinero ni cuentas reales");
		}

		Environment enviroment= appcontext.getEnvironment();
		System.out.println(enviroment.getActiveProfiles());

		//Cliente cliente= (Cliente) appcontext.getBean("cliente");
		//System.out.println(cliente.getApellido());

		/*
		CajaDeAhorro cuenta2= new CajaDeAhorro(1000);
		cuenta2.retiro(200);
		cuenta2.deposito(500);

		CuentaCorriente cuenta= new CuentaCorriente(1000);
		cuenta.retiro(100);
		cuenta.deposito(400);


		Cliente cliente= new Cliente("Alexis","Hernandez");
		Cliente cliente2= new Cliente("Guillermo","Nieto");

		ArrayList<Cliente> clientes= new ArrayList<>();
		clientes.add(cliente);
		clientes.add(cliente2);

		Sucursal sucursal = new Sucursal("Reforma Agraria");
		Sucursal sucursal2 = new Sucursal("Constituyentes");
		ArrayList<Sucursal> sucursales= new ArrayList<>();
		sucursales.add(sucursal);
		sucursales.add(sucursal2);


		cliente.setCuenta(cuenta);
		cliente.setCuenta(cuenta2);

		cliente.getCuentas().forEach(c-> System.out.println(c.tipoCuenta()));

		Banco banco=Banco.getInstance(clientes,sucursales,"BBVA");

		*/





	}




}
