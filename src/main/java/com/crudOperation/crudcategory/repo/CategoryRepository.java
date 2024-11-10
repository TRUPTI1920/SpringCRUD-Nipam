package com.crudOperation.crudcategory.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudOperation.crudcategory.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
