package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Users;
import com.example.demo.service.UsersService;


@RestController
@CrossOrigin("http://localhost:3000")
public class UsersController {
	@Autowired
	UsersService userSer;
	@PostMapping("/login")
	public String validateUser(@RequestBody Users u)
	{
		return userSer.valideteUser(u.getEmail(), u.getPassword());
	}
	
	@PostMapping("/signup")
	public Users addDetails(@RequestBody Users u)
	{
		return userSer.saveUser(u);
	}

	@GetMapping(value="/getProfile")
	public List<Users> get()
	{
		List<Users> s=userSer.get();
		return s;
	}
	@DeleteMapping(value="/delete/{id}")
	public void Del(@PathVariable int id)
	{
		userSer.Del(id);
	}
	@PutMapping(value="/update")
	public Users updateDetails(@RequestBody Users u)
	{
		return userSer.saveUser(u);
	}

}
