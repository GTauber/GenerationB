package com.tauber.TauberBlog.controller;

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

import com.tauber.TauberBlog.model.Posts;
import com.tauber.TauberBlog.repository.PostsRepository;

@RestController
@RequestMapping("/posts")
@CrossOrigin("*")
public class PostsController {
	@Autowired
	private PostsRepository Repository;
	
	@GetMapping
	public ResponseEntity<List<Posts>> GetAll(){
		return ResponseEntity.ok(Repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Posts> GetById(@PathVariable long id){
		return Repository.findById(id).map(Ans -> ResponseEntity.ok(Ans)).orElse(ResponseEntity.notFound().build());
	}
	@GetMapping("/title/{title}")
	public ResponseEntity<List<Posts>> GetByTitle(@PathVariable String title){
		return ResponseEntity.ok(Repository.findAllByTitleContainingIgnoreCase(title));
	}
	
	@PostMapping
	public ResponseEntity<Posts> post (@RequestBody Posts post){
		return ResponseEntity.status(HttpStatus.CREATED).body(Repository.save(post));
	}
	@PutMapping
	public ResponseEntity<Posts> put (@RequestBody Posts post){
		return ResponseEntity.status(HttpStatus.OK).body(Repository.save(post));
	}
	@DeleteMapping("/{id}")
	public void delete (@PathVariable long id) {
		Repository.deleteById(id);
		
	}
}


