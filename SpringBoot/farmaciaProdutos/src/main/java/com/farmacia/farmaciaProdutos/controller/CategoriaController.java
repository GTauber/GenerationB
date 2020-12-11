package com.farmacia.farmaciaProdutos.controller;

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

import com.farmacia.farmaciaProdutos.model.CategoriaModel;
import com.farmacia.farmaciaProdutos.repository.CategoriaRepository;



@RestController
@RequestMapping("/Category")
@CrossOrigin(value = "*", allowedHeaders = "*")
public class CategoriaController {
	
	@Autowired
	private CategoriaRepository Repository;
	
	@GetMapping
	public ResponseEntity<List<CategoriaModel>> getAll(){
		return ResponseEntity.ok(Repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<CategoriaModel> getById(@PathVariable long id){
		return Repository.findById(id).map(Ans -> ResponseEntity.ok(Ans))
				.orElse(ResponseEntity.badRequest().build());
		
	}
	
	@PostMapping 
	public ResponseEntity<CategoriaModel> post (@RequestBody CategoriaModel post) {
		return ResponseEntity.status(HttpStatus.CREATED).body(Repository.save(post));
	}
	
	@PutMapping 
	public ResponseEntity<CategoriaModel> put (@RequestBody CategoriaModel post) {
		return ResponseEntity.status(HttpStatus.CREATED).body(Repository.save(post));
	}
	
	@DeleteMapping("/{id}")
	public void delete (@PathVariable long id) {
		Repository.deleteById(id);
	}

}



