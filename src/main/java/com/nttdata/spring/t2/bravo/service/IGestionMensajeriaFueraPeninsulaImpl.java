package com.nttdata.spring.t2.bravo.service;

import org.springframework.stereotype.Service;

import com.nttdata.spring.t2.bravo.repository.Pedido;
import com.nttdata.spring.t2.bravo.repository.Producto;

/**
 * 
 * @author bravo
 *
 */

@Service
public class IGestionMensajeriaFueraPeninsulaImpl implements IGestionMensajeriaService {

	@Override
	public Pedido createOrder(Producto producto, String direccion, double precio) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addProductToAnOrder(Pedido pedido, Producto producto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void breakDownOrder(Pedido pedido) {
		// TODO Auto-generated method stub
		
	}


	



}
