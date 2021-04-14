package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.project.dao.UsersRepository;
import com.project.entity.Users;

@Service
public class UsersService {
	
	@Autowired
	private UsersRepository repository1;
	
	@Autowired
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	public List<Users> usersList(){
		List<Users> list=this.repository1.findAll();
		return list;
		
	}
	
	public void usersSave(Users user) {
		user.setPassword(passwordEncoder().encode(user.getPassword()));
		this.repository1.save(user);
		
	}

	public void userDelete(Integer id) {
		this.repository1.deleteById(id);
	}
}
