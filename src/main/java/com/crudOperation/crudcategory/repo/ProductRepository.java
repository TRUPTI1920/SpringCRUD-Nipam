package com.crudOperation.crudcategory.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudOperation.crudcategory.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}