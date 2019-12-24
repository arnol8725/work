package com.formaciondbi.springboot.app.productos.model.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.formaciondbi.springboot.app.productos.model.entity.Producto;

@Repository
public interface ProductoRepository extends CrudRepository<Producto, Long> {

}
