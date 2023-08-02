package com.example.shoppingsite.user.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shoppingsite.user.dto.UserDto;
import com.example.shoppingsite.user.entity.Address;
import com.example.shoppingsite.user.entity.User;
import com.example.shoppingsite.user.repo.AddressRepo;
import com.example.shoppingsite.user.repo.UserRepo;

@Service
public class Userservice {

	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private AddressRepo addressRepo;
	
	public UserDto addUser(UserDto userDto) {
		User user =new User();
		Address address =new Address();
		System.out.println(userDto.toString());
		BeanUtils.copyProperties(userDto, user);
		System.out.println(user.toString());
		BeanUtils.copyProperties(userDto.getAddress(),address );
		System.out.println(address.toString());
		
		
		user.setAddress(address);
		
		
		System.out.println(user.toString());
     
	    this.addressRepo.save(address);
	    this.userRepo.save(user); 
	    return userDto;
		
	    
	}
}
