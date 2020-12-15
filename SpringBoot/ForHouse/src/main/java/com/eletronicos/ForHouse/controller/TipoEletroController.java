package com.eletronicos.ForHouse.controller;

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

import com.eletronicos.ForHouse.model.TipoEletroModel;
import com.eletronicos.ForHouse.repository.TipoEletroRepository;


@RestController
@RequestMapping("/eletro")
@CrossOrigin(value = "*", allowedHeaders = "*")
public class TipoEletroController {
	
	@Autowired
	private TipoEletroRepository  Repository;
	
	@GetMapping
	public ResponseEntity<List<TipoEletroModel>> getAll(){
		return ResponseEntity.ok(Repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<TipoEletroModel> getById(@PathVariable long id){
		return Repository.findById(id).map(Ans -> ResponseEntity.ok(Ans))
				.orElse(ResponseEntity.badRequest().build());
		
	}
	
	@PostMapping 
	public ResponseEntity<TipoEletroModel> post (@RequestBody TipoEletroModel post) {
		return ResponseEntity.status(HttpStatus.CREATED).body(Repository.save(post));
	}
	
	@PutMapping 
	public ResponseEntity<TipoEletroModel> put (@RequestBody TipoEletroModel post) {
		return ResponseEntity.status(HttpStatus.CREATED).body(Repository.save(post));
	}
	
	@DeleteMapping("/{id}")
	public void delete (@PathVariable long id) {
		Repository.deleteById(id);
	}

}


