package com.bennytech.meuprimeiroprojeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bennytech.meuprimeiroprojeto.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	
}
