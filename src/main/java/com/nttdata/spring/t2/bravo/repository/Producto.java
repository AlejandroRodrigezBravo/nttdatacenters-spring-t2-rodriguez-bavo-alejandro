package com.nttdata.spring.t2.bravo.repository;

public class Producto {

	/**Atributo identificador de producto*/
	private Long id;
	
	/**Atributo nombre de producto*/
	private String nombre;
	
	/**Atributo precio con IVA de producto*/
	private  double precioPvp;
	
	/**Atributprecio sin IVA de producto*/
	private  double precioSinImpuesto;

	/**
	 * Constructo de la clase producto
	 * @param id
	 * @param nombre
	 * @param precioSinImpuesto
	 */
	public Producto(Long id, String nombre, double precioSinImpuesto) {
		this.id = id;
		this.nombre = nombre;
		this.precioSinImpuesto = precioSinImpuesto;
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
	public String getNombre() {
		return nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * 
	 * @return
	 */
	public double getPrecioPvp() {
		return precioPvp;
	}

	/**
	 * 
	 * @param precioPvp
	 */
	public void setPrecioPvp(double precioPvp) {
		this.precioPvp = precioPvp;
	}

	/**
	 * 
	 * @return
	 */
	public double getPrecioSinImpuesto() {
		return precioSinImpuesto;
	}

	/**
	 * 
	 * @param precioSinImpuesto
	 */
	public void setPrecioSinImpuesto(double precioSinImpuesto) {
		this.precioSinImpuesto = precioSinImpuesto;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", precioPvp=" + precioPvp + ", precioSinImpuesto="
				+ precioSinImpuesto + "]";
	}

	/**
	 * Método para clonar producto.
	 */
	@Override
	public Producto clone() {
		
		//Clon
		final Producto productoClonado = new Producto(this.id, this.nombre, this.precioSinImpuesto);
		
		return productoClonado;
		
	}
	
}
