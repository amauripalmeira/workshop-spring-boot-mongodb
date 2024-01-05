package com.amauripalmeira.workshopmongo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amauripalmeira.workshopmongo.domain.User;
import com.amauripalmeira.workshopmongo.dto.UserDTO;
import com.amauripalmeira.workshopmongo.repository.UserRepository;
import com.amauripalmeira.workshopmongo.service.exception.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repo ;
	
	public List<User> findAll(){
		return repo.findAll();
		
	}
	public User findById (String id) {
		Optional<User> user = repo.findById(id);
		if (user.isEmpty()) {
			throw new ObjectNotFoundException("Objeto nao encontrado ");
		}
		return  user.get();
	}
	public User insert (User obj ) {
		return repo.insert(obj);
	}
	public User fromDto (UserDTO objdto) {
		return new User (objdto.getId(), objdto.getName(), objdto.getEmail());
	}
}
