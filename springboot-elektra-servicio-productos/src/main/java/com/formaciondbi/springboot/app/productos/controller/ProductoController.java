package com.formaciondbi.springboot.app.productos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.formaciondbi.springboot.app.productos.model.entity.Producto;
import com.formaciondbi.springboot.app.productos.model.service.IProductoService;

@RestController
public class ProductoController {
	
	@Autowired
	private IProductoService productoService;
	
	@GetMapping("/listar")
	public List<Producto> listar(){
		
		return productoService.findAll();
	}
	@GetMapping("/listar/{id}")
	public Producto detalle(@PathVariable Long id){
		
		return productoService.findById(id);
	}

}
