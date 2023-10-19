package com.lulu.Miniproject_MS1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.base.Optional;
import com.lulu.Miniproject_MS1.Entity.Product;
import com.lulu.Miniproject_MS1.Repository.ProductRepository;

import jakarta.persistence.EntityNotFoundException;

@RestController //we use it create rest api end point along with http Methods

//like get,post,delete ,put,patch
//@RequestMapping("/sps")

public class ProductController {
	@Autowired

	ProductRepository productRepository;


	@GetMapping("/sps/getProduct")

	public List<Product> getJPQL() {

 

		return productRepository.findAll(); // select * from <TableName>;

 

	}


	@PostMapping("/sps/addProduct")

	public Product createuser(@RequestBody Product prod) {

		return productRepository.save(prod);

	}
	///Delete Operations  @PathVariable..

			@DeleteMapping("/sps/deleteProduct/{id}")
			public void deletProduct(@PathVariable("id") Integer id  ) {

		 

				productRepository.deleteById(id); // select * from <TableName>;

		 
}


			@PutMapping("/sps/updatesport/{id}")

			 

					public Product updatePurchase(@PathVariable int id, @RequestBody Product updatedProduct) {

			 

					    java.util.Optional<Product> existingProduct = productRepository.findById(id);

		

			 

					    if (existingProduct.isPresent()) {

			 
                        Product productToUpdate = existingProduct.get();

			 

					        

			 

					        // Update the fields of the existing product with the new data

			 

					        if (updatedProduct.getName() != null) {

			 

					            productToUpdate.setName(updatedProduct.getName());

			 

					        }

			 

			 

					        if (updatedProduct.getCost() != 0.0) {

			 

					            productToUpdate.setCost(updatedProduct.getCost());

			 

					        }

			 

				

			 

					        // Save the updated product to the repository

			 

					        return productRepository.save(productToUpdate);

			 

					    } else {

			 

					        // Handle the case where the product with the given ID doesn't exist

			 

					        throw new EntityNotFoundException("Sports Product with ID " + id + " not found");

			 

					    }

			 

					}
}