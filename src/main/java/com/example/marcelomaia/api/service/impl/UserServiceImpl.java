package com.example.marcelomaia.api.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.marcelomaia.api.model.User;
import com.example.marcelomaia.api.repository.UserRepository;
import com.example.marcelomaia.api.service.UserService;


@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<User> allUsers() {
		return this.userRepository.findAll();
				
	}

	@Override
	public Optional<User> getByUserName(String userName) {
		return this.userRepository.findById(userName);
	}

	@Override
	public User insert(User user) {
		return this.userRepository.save(user);
	}

	@Override
	public void delete(String userName) {
		this.userRepository.deleteById(userName);
		
	}

	
	
	

	

	

}
