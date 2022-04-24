package com.nttdata.spring.t2.bravo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.spring.t2.bravo.service.IGestionMensajeriaFueraPeninsulaImpl;
import com.nttdata.spring.t2.bravo.service.IGestionMensajeriaPeninsulaImpl;

@SpringBootApplication
public class NttdataAppTaller2 implements CommandLineRunner {

	@Autowired
	private IGestionMensajeriaPeninsulaImpl servicioPeninsula;
	
	@Autowired
	private IGestionMensajeriaFueraPeninsulaImpl servicioEspeciales;
	
	public static void main(String[] args) {
		SpringApplication.run(NttdataAppTaller2.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
