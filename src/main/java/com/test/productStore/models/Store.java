package com.test.productStore.models;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "store")
public class Store {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "store_id")
	private int storeId;
	
	@Column(name = "store_name")
	private String storeName;
	
	@Column(name = "adress")
	private String adress;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "store")
    private Set<Product> products;

	public Store() {
	}

	public Store(String storeName, String adress) {
		super();
		this.storeName = storeName;
		this.adress = adress;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}
}
