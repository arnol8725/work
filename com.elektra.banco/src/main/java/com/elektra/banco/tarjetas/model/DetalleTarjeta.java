package com.elektra.banco.tarjetas.model;

import java.io.Serializable;
import java.util.List;

public class DetalleTarjeta implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
		        public String noCuenta;
		        public String nombre;
		        public String pedido;  
		        public String noAutorizacion;
		      
		        public List<Tarjeta> tarjetas;

				public DetalleTarjeta() {
					super();
					// TODO Auto-generated constructor stub
				}

				public DetalleTarjeta(String noCuenta, String nombre, String pedido, String noAutorizacion,
						List<Tarjeta> tarjetas) {
					super();
					this.noCuenta = noCuenta;
					this.nombre = nombre;
					this.pedido = pedido;
					this.noAutorizacion = noAutorizacion;
					this.tarjetas = tarjetas;
				}

				public String getNoCuenta() {
					return noCuenta;
				}

				public void setNoCuenta(String noCuenta) {
					this.noCuenta = noCuenta;
				}

				public String getNombre() {
					return nombre;
				}

				public void setNombre(String nombre) {
					this.nombre = nombre;
				}

				public String getPedido() {
					return pedido;
				}

				public void setPedido(String pedido) {
					this.pedido = pedido;
				}

				public String getNoAutorizacion() {
					return noAutorizacion;
				}

				public void setNoAutorizacion(String noAutorizacion) {
					this.noAutorizacion = noAutorizacion;
				}

				public List<Tarjeta> getTarjetas() {
					return tarjetas;
				}

				public void setTarjetas(List<Tarjeta> tarjetas) {
					this.tarjetas = tarjetas;
				}

				@Override
				public String toString() {
					return "DetalleTarjeta [noCuenta=" + noCuenta + ", nombre=" + nombre + ", pedido=" + pedido
							+ ", noAutorizacion=" + noAutorizacion + ", tarjetas=" + tarjetas + "]";
				}
				
		        
				
		        
		        
		    
}
