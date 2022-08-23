package com.bennytech.meuprimeiroprojeto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bennytech.meuprimeiroprojeto.entities.Category;
import com.bennytech.meuprimeiroprojeto.repositories.CategoryRepository;

@SpringBootApplication
public class MeuprimeiroprojetoApplication  implements CommandLineRunner{
	
	@Autowired
	private CategoryRepository categoryRepository;

	public static void main(String[] args) {
		SpringApplication.run(MeuprimeiroprojetoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category cat1 = new Category (1L, "Eletrônicos");
		Category cat2 = new Category (2L, "Livross");
		
		categoryRepository.save(cat1);
		categoryRepository.save(cat2);
	}

}
