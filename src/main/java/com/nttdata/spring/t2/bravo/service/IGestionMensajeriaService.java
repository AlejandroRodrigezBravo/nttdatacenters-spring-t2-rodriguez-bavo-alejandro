package com.nttdata.spring.t2.bravo.service;

import com.nttdata.spring.t2.bravo.repository.Pedido;
import com.nttdata.spring.t2.bravo.repository.Producto;

public interface IGestionMensajeriaService {

	/**
	 * Método para creación de pedido
	 * @param producto a crear
	 * @param direccion a enviar
	 * @param precio valor del pedido
	 * @return devuelve un pedido, null en caso contrario
	 */
	public Pedido createOrder(Producto producto, String direccion, double precio);
	
	
	/**
	 * Método para añadir un producto al pedido
	 * @param producto a añadir al pedido
	 * @param indiciador 
	 */
	public void addProductToAnOrder(Pedido pedido, Producto producto );
	
	/**
	 * Método para desglose de orden
	 * @param producto
	 * @param price
	 */
	public void breakDownOrder(Pedido pedido);
	
}
