package com.test.productStore.controllers;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.productStore.models.Product;
import com.test.productStore.models.Store;
import com.test.productStore.services.StoreService;

@RestController
@RequestMapping("/Store")
public class StroreController {

	@Autowired
	private StoreService storeService;
	
	@GetMapping
	public List<Store> getAllStores() {
		return storeService.getStores();
	}
	
	@GetMapping(value = "/Products/{idStore}")
	public Set<Product> getProductsOfStore(@PathVariable int idStore) {
		return storeService.getProductOfStore(idStore);
	}
	
}
