package com.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.entity.Users;

public interface UsersRepository extends JpaRepository<Users, Integer>{
	
	@Query("select u from Users u where u.username=:username")
	public Users getUsersUsername(String username);

}
