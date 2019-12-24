package com.formaciondbi.springboot.app.items.models;

import java.io.Serializable;
import java.util.Date;



public class Producto implements Serializable {
	
	
	
	private Long id;
	private String nombre;
	private Double precio;
	private Date createAt;
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Producto(Long id, String nombre, Double precio, Date createAt) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.createAt = createAt;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", createAt=" + createAt + "]";
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2950429905270392344L;	
	

}
