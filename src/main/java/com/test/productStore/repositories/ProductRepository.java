package com.test.productStore.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.test.productStore.models.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

}
