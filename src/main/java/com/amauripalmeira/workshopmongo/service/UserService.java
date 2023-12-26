package com.amauripalmeira.workshopmongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amauripalmeira.workshopmongo.domain.User;
import com.amauripalmeira.workshopmongo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo ;
	
	public List<User> findAll(){
		return repo.findAll();
		
	}
}
