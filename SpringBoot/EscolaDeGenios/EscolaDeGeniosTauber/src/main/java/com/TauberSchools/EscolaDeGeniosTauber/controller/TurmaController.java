package com.TauberSchools.EscolaDeGeniosTauber.controller;

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

import com.TauberSchools.EscolaDeGeniosTauber.model.Turma;
import com.TauberSchools.EscolaDeGeniosTauber.repository.TurmaRepository;

@RestController
@RequestMapping("/turma")
@CrossOrigin("*")
public class TurmaController {
	@Autowired
	private TurmaRepository Repository;
	
	@GetMapping
	public ResponseEntity<List<Turma>> GetAll(){
		return ResponseEntity.ok(Repository.findAll());
		
	}
	@GetMapping("/{id}")
	public ResponseEntity<Turma> GetByIdTurma(@PathVariable long id){
		return Repository.findById(id).map(Ans -> ResponseEntity.ok(Ans)).orElse(ResponseEntity.notFound().build());
	}
	@PostMapping
	public ResponseEntity<Turma> post (@RequestBody Turma post){
		return ResponseEntity.status(HttpStatus.CREATED).body(Repository.save(post));
	}
	@PutMapping
	public ResponseEntity<Turma> put (@RequestBody Turma post){
		return ResponseEntity.status(HttpStatus.CREATED).body(Repository.save(post));
	}
	@DeleteMapping("/{id}")
	public void delete (@PathVariable long id) {
		Repository.deleteById(id);
	}
	
}




