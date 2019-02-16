package com.indeas.helpdesk.api.reporitory;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.indeas.helpdesk.api.entity.User;

public interface UserRepository extends MongoRepository<User, String>{
	
	public User findByEmail(String email);

}
