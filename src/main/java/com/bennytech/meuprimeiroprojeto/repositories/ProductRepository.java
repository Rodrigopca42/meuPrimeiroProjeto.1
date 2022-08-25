package com.bennytech.meuprimeiroprojeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bennytech.meuprimeiroprojeto.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	
	
}
