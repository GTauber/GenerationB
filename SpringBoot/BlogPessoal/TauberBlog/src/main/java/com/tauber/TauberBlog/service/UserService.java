package com.tauber.TauberBlog.service;

import java.nio.charset.Charset;
import java.util.Optional;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.tauber.TauberBlog.model.User;
import com.tauber.TauberBlog.model.UserLogin;
import com.tauber.TauberBlog.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public User RegisterUser(User user) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		String passEncoder = encoder.encode(user.getPass());
		user.setPass(passEncoder);
		
		return repository.save(user);
	}
	
	public Optional<UserLogin> Login(Optional<UserLogin> user) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		Optional<User> userName = repository.findByUser(user.get().getUser());
		
		if(userName.isPresent()) { 
			if(encoder.matches(user.get().getPass(), userName.get().getPass()));
			
				String auth = user.get().getUser() + ":" + user.get().getPass();
				byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
				String authHeader ="Basic " + new String(encodedAuth);
				
				user.get().setToken(authHeader);
				user.get().setName(userName.get().getName());
				
				return user;
				
			}
		
	return null;
	}

}
