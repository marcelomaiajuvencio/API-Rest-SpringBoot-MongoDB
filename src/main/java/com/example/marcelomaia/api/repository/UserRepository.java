package com.example.marcelomaia.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.marcelomaia.api.model.User;

public interface UserRepository extends MongoRepository<User, String>{

}
