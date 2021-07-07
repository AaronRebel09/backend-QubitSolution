package com.optimagrowth.user.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.optimagrowth.user.model.User;
import com.optimagrowth.user.repository.UserRepository;

@Service
public class UserService {
	
    @Autowired
    private UserRepository repository;

    public User findById(Long UserId) {
    	Optional<User> opt = repository.findById(UserId);
        return (opt.isPresent()) ? opt.get() : null;
    }

    public User create(User User){    	
        User = repository.save(User);
        return User;

    }

    public void update(User User){
    	repository.save(User);
    }

    public void delete(Long id){
    	repository.deleteById(id);
    }
}