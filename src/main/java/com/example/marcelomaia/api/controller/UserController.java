package com.example.marcelomaia.api.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.marcelomaia.api.model.User;
import com.example.marcelomaia.api.service.UserService;

@RestController
@RequestMapping("/users")
@CrossOrigin(maxAge = 10, origins = {"http://localhost:4200"})
public class UserController {
	
	@Autowired
	private UserService  userService;
	
	@GetMapping
	public List<User> allUsers(){
		return this.userService.allUsers();
		
	}
	
	@GetMapping("/{username}")
	public Optional<User> getByUserName(@PathVariable String username){
		return this.userService.getByUserName(username);
		
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public User insert(@RequestBody User user){
		return this.userService.insert(user);
		
	}
	
	@DeleteMapping("/{username}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable String username){
		this.userService.delete(username);
		
	}
	
	
	

}
