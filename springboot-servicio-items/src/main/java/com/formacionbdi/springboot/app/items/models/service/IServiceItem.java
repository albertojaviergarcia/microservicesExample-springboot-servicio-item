package com.formacionbdi.springboot.app.items.models.service;

import java.util.List;

import com.formacionbdi.springboot.app.items.models.entity.Item;

public interface IServiceItem {

	public Item findById(Long id, Integer cantidad);
	public List<Item> findAll();
}
