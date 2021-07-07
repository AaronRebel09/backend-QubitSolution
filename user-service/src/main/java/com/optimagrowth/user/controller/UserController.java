package com.optimagrowth.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.optimagrowth.user.model.User;
import com.optimagrowth.user.service.UserService;

@RestController
@RequestMapping(value="v1/User")
public class UserController {
    @Autowired
    private UserService service;


    @RequestMapping(value="/{UserId}",method = RequestMethod.GET)
    public ResponseEntity<User> getUser( @PathVariable("UserId") Long UserId) {
        return ResponseEntity.ok(service.findById(UserId));
    }

    @RequestMapping(value="/{UserId}",method = RequestMethod.PUT)
    public void updateUser( @PathVariable("UserId") Long id, @RequestBody User User) {
    	User.setId(id);
        service.update(User);
    }

    @PostMapping
    public ResponseEntity<User>  saveUser(@RequestBody User User) {
    	return ResponseEntity.ok(service.create(User));
    }

    @RequestMapping(value="/{UserId}",method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUser( @PathVariable("UserId") Long id) {    	
        service.delete(id);
    }

}
