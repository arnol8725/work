package com.appdeveloperblog.app.ws.MobileAppWebApplication.controller;

import java.awt.PageAttributes.MediaType;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appdeveloperblog.app.ws.MobileAppWebApplication.entity.User;

@RestController
@RequestMapping("/users")
public class UserController {
	@GetMapping("/getUser/{userId}")
	public String getUser(@PathVariable String userId) {
		return "get user was call with userId=" + userId ;
	}
	@PostMapping(path ="createUser", 
			consumes = {
					org.springframework.http.MediaType.APPLICATION_XML_VALUE,
					org.springframework.http.MediaType.APPLICATION_JSON_VALUE
			},
			produces = {
					org.springframework.http.MediaType.APPLICATION_XML_VALUE,
					org.springframework.http.MediaType.APPLICATION_JSON_VALUE
			}
			)
	public ResponseEntity<User> createUser(@Valid @RequestBody User user, BindingResult result) 
	{
		if (result.hasErrors()) {
			return ResponseEntity<User>(new User(), HttpStatus.OK);
		}
		
		User users = new User(user.idUser,user.nameUser,user.emailUser);
				
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
	
	@PutMapping
	public String updateUser() 
	{
		return "update  user was called";
	}
	
	@DeleteMapping
	public String deleteUser() 
	{
		return "delete  user was called";
	}
	
	
}
