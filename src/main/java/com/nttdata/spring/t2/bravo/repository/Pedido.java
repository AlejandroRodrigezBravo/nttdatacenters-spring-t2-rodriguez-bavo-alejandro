package com.nttdata.spring.t2.bravo.repository;

import java.util.List;

public class Pedido {

	private Long id;
	
	private String destinatario;
	
	private String direccionEntrega;
	
	private boolean espiciales;
	
	private List<Producto> producto;

	public Pedido() {
		
	}
	
	public Pedido createOrder(List<Producto> producto, String destinatario, String direccion) {
	
		
		return null;
		
	}
	
}
