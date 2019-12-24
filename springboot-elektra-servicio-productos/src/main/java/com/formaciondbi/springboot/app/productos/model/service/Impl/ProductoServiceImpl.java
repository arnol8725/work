package com.formaciondbi.springboot.app.productos.model.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formaciondbi.springboot.app.productos.model.dao.ProductoRepository;
import com.formaciondbi.springboot.app.productos.model.entity.Producto;
import com.formaciondbi.springboot.app.productos.model.service.IProductoService;

@Service
public class ProductoServiceImpl implements IProductoService {
	
	@Autowired
    private ProductoRepository productoRepository;
	@Override
	@Transactional(readOnly=true)
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
	    
		return (List<Producto>)productoRepository.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Producto findById(Long id) {
		// TODO Auto-generated method stub
		
		return productoRepository.findById(id).orElse(null);
	}

}
