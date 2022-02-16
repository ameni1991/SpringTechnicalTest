package com.test.productStore.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.test.productStore.models.Store;

@Repository
public interface StoreRepository extends CrudRepository<Store, Integer> {

}
