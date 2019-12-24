package com.elektra.banco.tarjetas.model;

import java.io.Serializable;

public class Respuesta implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public boolean error;
	public String mensaje;
	public boolean esAmex;
	public int pedido;
	public DetalleTarjeta detTarjeta;
	
	public Respuesta() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Respuesta(boolean error, String mensaje, boolean esAmex, int pedido, DetalleTarjeta detTarjeta) {
		super();
		this.error = error;
		this.mensaje = mensaje;
		this.esAmex = esAmex;
		this.pedido = pedido;
		this.detTarjeta = detTarjeta;
	}



	public int  getPedido() {
		return pedido;
	}
	public void setPedido(int pedido) {
		this.pedido = pedido;
	}
	
	public boolean isError() {
		return error;
	}
	public void setError(boolean error) {
		this.error = error;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public boolean isEsAmex() {
		return esAmex;
	}
	public void setEsAmex(boolean esAmex) {
		this.esAmex = esAmex;
	}
	public DetalleTarjeta getDetTarjeta() {
		return detTarjeta;
	}
	public void setDetTarjeta(DetalleTarjeta detTarjeta) {
		this.detTarjeta = detTarjeta;
	}
	@Override
	public String toString() {
		return "Respuesta [error=" + error + ", mensaje=" + mensaje + ", esAmex=" + esAmex + ", pedido=" + pedido
				+ ", detTarjeta=" + detTarjeta + "]";
	}
	
	
	
}
