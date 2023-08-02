package com.example.shoppingsite.user.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.shoppingsite.user.entity.Address;
import com.example.shoppingsite.user.entity.User;
public interface AddressRepo extends JpaRepository<Address, Integer>{

}
