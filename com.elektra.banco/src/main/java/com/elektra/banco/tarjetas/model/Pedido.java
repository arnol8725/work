package com.elektra.banco.tarjetas.model;

import java.io.Serializable;

public class Pedido implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int noPedido;

	public Pedido(int noPedido) {
		super();
		this.noPedido = noPedido;
	}

	public Pedido() {
		super();
		
	}

	public int getNoPedido() {
		return noPedido;
	}

	public void setNoPedido(int noPedido) {
		this.noPedido = noPedido;
	}

	@Override
	public String toString() {
		return "Pedido [noPedido=" + noPedido + "]";
	}

	
	
	
}
