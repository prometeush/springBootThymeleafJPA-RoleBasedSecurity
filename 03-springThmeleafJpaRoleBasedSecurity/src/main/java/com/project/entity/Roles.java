package com.project.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class Roles {
   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer role_id;
	
	private  String name;
	
	public Roles() {
		// TODO Auto-generated constructor stub
	}

	public Roles(Integer role_id, String name) {
		
		this.role_id = role_id;
		this.name = name;
	}

	
	public Roles(String name) {
		super();
		this.name = name;
	}

	public Integer getRole_id() {
		return role_id;
	}

	public void setRole_id(Integer role_id) {
		this.role_id = role_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
