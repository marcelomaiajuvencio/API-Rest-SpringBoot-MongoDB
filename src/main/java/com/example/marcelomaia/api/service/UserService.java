package com.example.marcelomaia.api.service;

import java.util.List;
import java.util.Optional;

import com.example.marcelomaia.api.model.User;

public interface UserService {
	
	public List<User> allUsers();
	public Optional<User> getByUserName(String userName);
	public User insert(User user);
	public void delete(String userName);
	

}
