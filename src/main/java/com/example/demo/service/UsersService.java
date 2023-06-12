package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Users;
import com.example.demo.repository.UsersRepository;


@Service
public class UsersService {
	@Autowired
	UsersRepository userRep;
	public Users saveUser(Users l)
	{
		return userRep.save(l);
	}
	public String valideteUser(String email,String password)
	{
		String result=" ";
		Users l=userRep.findByEmail(email);
		if(l==null)
		{
			result="User not found";
		}
		else
		{
			if(l.getPassword().equals(password))
			{
				result="Login success";
			}
			else
			{
				result="Login failed";
			}
		}
		return result;
	}

	public List<Users> get()
	{
		List<Users> um=userRep.findAll();
		return um;
	}
	public void Del(int id)
	{
		userRep.deleteById(id);
	}
	public Users updateUser(Users l)
	{
		return userRep.save(l);
	}
}
