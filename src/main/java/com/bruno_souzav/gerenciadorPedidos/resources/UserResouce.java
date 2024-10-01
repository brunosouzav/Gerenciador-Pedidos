package com.bruno_souzav.gerenciadorPedidos.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bruno_souzav.gerenciadorPedidos.entites.User;

@RestController
@RequestMapping (value = "/users")
public class UserResouce {
	
	@GetMapping
	public ResponseEntity<User> finAll(){
		User u = new User(1L, "Bruno Souza", "bruno@gmail.com", "999999", "123");
		return ResponseEntity.ok().body(u);
	}
}
