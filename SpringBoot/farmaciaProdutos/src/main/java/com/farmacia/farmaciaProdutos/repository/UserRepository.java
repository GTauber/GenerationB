package com.farmacia.farmaciaProdutos.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmacia.farmaciaProdutos.model.User;


public interface UserRepository extends JpaRepository<User, Long> {
	
	public Optional<User> findByUser(String user);

}
