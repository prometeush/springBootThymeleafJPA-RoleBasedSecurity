package com.project.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "mitarbeiter")
public class MitArbeiter {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String vorname;
	private String nachname;
	private String email;
	
	@Column(name = "prog_sprache")
	private String progSprache;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date anfang;
	
	private String gender;
	
	public MitArbeiter() {
		// TODO Auto-generated constructor stub
	}

	public MitArbeiter(Integer id, String vorname, String nachname, String email, String progSprache, Date anfang,
			String gender) {
		
		this.id = id;
		this.vorname = vorname;
		this.nachname = nachname;
		this.email = email;
		this.progSprache = progSprache;
		this.anfang = anfang;
		this.gender = gender;
	}

	public MitArbeiter(String vorname, String nachname, String email, String progSprache, Date anfang, String gender) {
		
		this.vorname = vorname;
		this.nachname = nachname;
		this.email = email;
		this.progSprache = progSprache;
		this.anfang = anfang;
		this.gender = gender;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProgSprache() {
		return progSprache;
	}

	public void setProgSprache(String progSprache) {
		this.progSprache = progSprache;
	}

	public Date getAnfang() {
		return anfang;
	}

	public void setAnfang(Date anfang) {
		this.anfang = anfang;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
