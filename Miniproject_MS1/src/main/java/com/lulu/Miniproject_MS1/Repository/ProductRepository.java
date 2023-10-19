package com.lulu.Miniproject_MS1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lulu.Miniproject_MS1.Entity.Product;



public interface ProductRepository extends JpaRepository<Product, Integer> {

}
