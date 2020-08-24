package com.formacionbdi.springboot.app.items.models.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.formacionbdi.springboot.app.items.models.entity.Item;
import com.formacionbdi.springboot.app.items.models.entity.Producto;

@Service
public class ServiceItemImpl implements IServiceItem{

	@Autowired
	private RestTemplate restTemplate; 
	
	@Override
	public Item findById(Long id, Integer cantidad) {
		Map<String, String> pathVariables = new HashMap<>();
		pathVariables.put("id", String.valueOf(id));
		Producto producto =  restTemplate.getForObject("http://localhost:8001/ver/{id}" , Producto.class, pathVariables);
		return new Item(producto, cantidad);
	}

	@Override
	public List<Item> findAll() {
		List<Producto> productos =  Arrays.asList(restTemplate.getForObject("http://localhost:8001/listar", Producto[].class));
		return productos.stream().map(p -> new Item(p,1)).collect(Collectors.toList());
	}


}
