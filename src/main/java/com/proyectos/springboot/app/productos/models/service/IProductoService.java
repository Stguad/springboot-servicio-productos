package com.proyectos.springboot.app.productos.models.service;

import java.util.List;

import com.proyectos.springboot.app.productos.models.entity.Producto;

public interface IProductoService {

	public List<Producto> findAll();
	
	public Producto findyById(Long id);
	
	
}
