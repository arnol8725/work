package com.elektra.banco.tarjetas.model;

import java.io.Serializable;

public class Tarjeta implements Serializable {
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String ultDig;
	public String monto;
	
	
	
	public Tarjeta() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Tarjeta(String ultDig, String monto) {
		super();
		this.ultDig = ultDig;
		this.monto = monto;
	}



	public String getUltDig() {
		return ultDig;
	}
	public void setUltDig(String ultDig) {
		this.ultDig = ultDig;
	}
	public String getMonto() {
		return monto;
	}
	public void setMonto(String monto) {
		this.monto = monto;
	}



	@Override
	public String toString() {
		return "Tarjeta [ultDig=" + ultDig + ", monto=" + monto + "]";
	}
	
	
	
}
