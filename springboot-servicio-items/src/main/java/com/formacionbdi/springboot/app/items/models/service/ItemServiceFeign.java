package com.formacionbdi.springboot.app.items.models.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formacionbdi.springboot.app.items.clientes.ProductoClienteRest;
import com.formacionbdi.springboot.app.items.models.entity.Item;
import com.formacionbdi.springboot.app.items.models.entity.Producto;

@Service("serviceFeign")
public class ItemServiceFeign implements ItemService{

	@Autowired 
	private ProductoClienteRest clienteFeign;

	@Override
	public Item findById(Long id, Integer cantidad) {
		Producto producto = clienteFeign.ver(id);
		return new Item(producto, cantidad);
	}

	@Override
	public List<Item> findAll() {
		return clienteFeign.listar().stream().map(p -> new Item(p,1)).collect(Collectors.toList());
	}

}
