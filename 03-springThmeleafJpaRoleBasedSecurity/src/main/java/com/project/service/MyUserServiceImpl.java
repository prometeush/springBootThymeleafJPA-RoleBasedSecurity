package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.project.dao.UsersRepository;
import com.project.entity.Users;

public class MyUserServiceImpl implements UserDetailsService{
	
	@Autowired
	private UsersRepository repos;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Users users=this.repos.getUsersUsername(username);
		if(users==null) {
			throw new UsernameNotFoundException("es wurde nicht gefunden");
		}
		return new MyUserDetails(users);
	}

}
