package com.nttdata.spring.t2.bravo.repository;

import java.util.ArrayList;
import java.util.List;

public class Pedido{

	/** Atributo identificador de pedido */
	private Long id;

	/** Atributo destinatario de pedido */
	private String destinatario;

	/** Atributo dirección de entrega de pedido */
	private String direccionEntrega;

	/** Atributo especial de pedido */
	// Se pretende controlar con un if else para saber si son fuera de la peninsula
	private boolean espiciales;

	/** Lista de producto */
	// Relación de producto con pedido
	private List<Producto> producto;

	/**
	 * Cosntructor de pedido
	 * 
	 * @param id
	 * @param destinatario
	 * @param direccionEntrega
	 * @param espiciales
	 * @param producto
	 */
	public Pedido(Long id, String destinatario, String direccionEntrega, boolean espiciales) {
		super();
		this.id = id;
		this.destinatario = destinatario;
		this.direccionEntrega = direccionEntrega;
		this.espiciales = espiciales;
		this.producto = new ArrayList<>();
	}

	/**
	 * 
	 * @return
	 */
	public Long getId() {
		return id;
	}
	
	/**
	 * 
	 * @param id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 
	 * @return
	 */
	public String getDestinatario() {
		return destinatario;
	}

	/**
	 * 
	 * @param destinatario
	 */
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	/**
	 * 
	 * @return
	 */
	public String getDireccionEntrega() {
		return direccionEntrega;
	}

	/**
	 * 
	 * @param direccionEntrega
	 */
	public void setDireccionEntrega(String direccionEntrega) {
		this.direccionEntrega = direccionEntrega;
	}

	/**
	 * 
	 * @return
	 */
	public boolean isEspiciales() {
		return espiciales;
	}

	/**
	 * 
	 * @param espiciales
	 */
	public void setEspiciales(boolean espiciales) {
		this.espiciales = espiciales;
	}

	/**
	 * 
	 * @return
	 */
	public List<Producto> getProducto() {
		return producto;
	}

	/**
	 * 
	 * @param producto
	 */
	public void setProducto(List<Producto> producto) {
		this.producto = producto;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", destinatario=" + destinatario + ", direccionEntrega=" + direccionEntrega
				+ ", espiciales=" + espiciales + ", producto=" + producto + "]";
	}

	

}
