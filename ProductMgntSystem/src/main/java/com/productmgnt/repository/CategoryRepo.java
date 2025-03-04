package com.productmgnt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.productmgnt.entity.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
 