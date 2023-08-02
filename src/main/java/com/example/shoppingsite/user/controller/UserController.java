package com.example.shoppingsite.user.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.shoppingsite.user.dto.UserDto;
import com.example.shoppingsite.user.service.Userservice;

@RestController()
@RequestMapping("/user")
public class UserController {

	@Autowired
	private Userservice userservice;
	
	@PostMapping("/adduser")
	private ResponseEntity<UserDto> addUser(@RequestBody UserDto userDto) {
		UserDto userDtoObject;
	 try {
		 
	    userDtoObject= this.userservice.addUser(userDto);
	    return  ResponseEntity.of(Optional.of(userDtoObject));
	    
	 }catch(Exception ex) {
		 
	     ex.printStackTrace();
		 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		 
	 }
	}
	
	@GetMapping("/test")
	private String Test() {
		
	return "working";
	}
}
