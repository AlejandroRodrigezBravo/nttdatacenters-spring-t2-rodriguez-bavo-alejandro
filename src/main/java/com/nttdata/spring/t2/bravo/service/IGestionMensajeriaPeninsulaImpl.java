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
public class IGestionMensajeriaPeninsulaImpl implements IGestionMensajeriaService {

	

	@Override
	public void addProductToAnOrder(Pedido pedido, boolean indiciador) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void breakDownOrder(Producto producto, double price) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Pedido createOrder(Producto producto, String direccion, double precio) {
		// TODO Auto-generated method stub
		return null;
	}


}
