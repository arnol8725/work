package com.elektra.banco.tarjetas.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.elektra.banco.tarjetas.model.*;

@RestController()
@CrossOrigin(origins = { "*" })
public class ControllerTarjetas {
	
	@PostMapping("/esAmex")
	public Respuesta lsitar2(@RequestBody Pedido pedido){
		//return itemServices.findAll();
		Tarjeta t = new Tarjeta("1907","150");
		List<Tarjeta> detTarjetas = new ArrayList<Tarjeta>();
		detTarjetas.add(t);
		DetalleTarjeta det = new DetalleTarjeta("2287966","De Aquina Mondragon Maria Silvia",""+pedido.noPedido,"1000",detTarjetas);
		
		Respuesta resp = new Respuesta(false,"",false,pedido.noPedido,det);
		return resp;
	}
	
	

}
