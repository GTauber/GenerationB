package com.tauber.TauberBlog.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tauber.TauberBlog.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	public Optional<User> findByUser(String user);

}
