package com.test.productStore.services;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.productStore.models.Product;
import com.test.productStore.models.Store;
import com.test.productStore.repositories.StoreRepository;

@Service
public class StoreService {
	
	@Autowired
	private StoreRepository storeRepository;
	
	public List<Store> getStores() {
		return (List<Store>) storeRepository.findAll();
	}
	
	public Set<Product> getProductOfStore(int idStore) {
		return storeRepository.findById(idStore).get().getProducts();
	}
}
