package com.nttdata.spring.t2.bravo.service;

import com.nttdata.spring.t2.bravo.repository.Pedido;
import com.nttdata.spring.t2.bravo.repository.Producto;

public interface IGestionMensajeriaService {

	
	public Pedido createOrder(Producto producto, String direccion, double precio);
	
	
	public void addProductToAnOrder(Pedido pedido, boolean indiciador );
	
	
	public void breakDownOrder(Producto producto, double price);
	
}
