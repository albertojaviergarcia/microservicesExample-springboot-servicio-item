package com.formacionbdi.springboot.app.items.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.formacionbdi.springboot.app.items.models.entity.Item;
import com.formacionbdi.springboot.app.items.models.service.IServiceItem;

@RestController
public class ItemController {

	@Autowired
	private IServiceItem serviceItem;
	
	@GetMapping("/listar")
	public List<Item> listar(){
		return serviceItem.findAll();
	}
	
	@GetMapping("/ver/{id}/cantidad/{cantidad}")
	public Item detalle(@PathVariable Long id, @PathVariable Integer cantidad) {
		return serviceItem.findById(id, cantidad);
	}
	
}
