package com.restaurant.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurant.model.Product;
import com.restaurant.wrapper.ProductWrapper;

public interface ProductDao extends JpaRepository<Product, Integer> {

	List<ProductWrapper> getAllProduct();
}
