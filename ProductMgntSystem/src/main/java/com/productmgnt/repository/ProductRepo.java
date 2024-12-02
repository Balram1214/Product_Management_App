package com.productmgnt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.productmgnt.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
