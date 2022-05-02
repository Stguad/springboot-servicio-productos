package com.proyectos.springboot.app.productos.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.proyectos.springboot.app.productos.models.entity.Producto;

public interface ProductoRepository extends CrudRepository<Producto, Long>{}
