package com.eletronicos.ForHouse.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eletronicos.ForHouse.model.ProductModel;
import com.eletronicos.ForHouse.repository.ProductRepository;

@RestController
@RequestMapping("/product")
@CrossOrigin(value = "*", allowedHeaders = "*")
public class ProductController {
	
	@Autowired
	private ProductRepository Repository;
	
	@GetMapping
	public ResponseEntity<List<ProductModel>> getAll(){
		return ResponseEntity.ok(Repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ProductModel> getById(@PathVariable long id){
		return Repository.findById(id).map(Ans -> ResponseEntity.ok(Ans))
				.orElse(ResponseEntity.badRequest().build());
		
	}
	
	@PostMapping 
	public ResponseEntity<ProductModel> post (@RequestBody ProductModel post) {
		return ResponseEntity.status(HttpStatus.CREATED).body(Repository.save(post));
	}
	
	@PutMapping 
	public ResponseEntity<ProductModel> put (@RequestBody ProductModel post) {
		return ResponseEntity.status(HttpStatus.CREATED).body(Repository.save(post));
	}
	
	@DeleteMapping("/{id}")
	public void delete (@PathVariable long id) {
		Repository.deleteById(id);
	}
	
	@GetMapping("/{value1}/{value2}")
	public ResponseEntity<List<ProductModel>> GetProductBRange(@PathVariable double value1, @PathVariable double value2) {
		return ResponseEntity.ok(Repository.PriceRange(value1, value2));
	}
	
	@GetMapping("/bytype/{tipoid}/{value}")
	public ResponseEntity<List<ProductModel>> RangeType(@PathVariable int tipoid, @PathVariable BigDecimal value){
		return ResponseEntity.ok(Repository.RangePriceTipo(tipoid, value));
	}

}
