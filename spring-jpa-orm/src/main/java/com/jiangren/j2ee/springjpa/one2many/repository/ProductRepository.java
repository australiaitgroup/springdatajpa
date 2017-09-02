package com.jiangren.j2ee.springjpa.one2many.repository;

import com.jiangren.j2ee.springjpa.one2many.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer>{
}
