package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.MitArbeiterRepository;
import com.project.entity.MitArbeiter;

@Service
public class MitarbeiterService {
	
	@Autowired
	private MitArbeiterRepository repository2;
	
	public List<MitArbeiter> mitarbeiterList(){
		List<MitArbeiter> list=this.repository2.findAll();
		return list;
	}
	
	public void mitarbeiterSave(MitArbeiter mitarbeiter) {
		this.repository2.save(mitarbeiter);
	}
	
	public void mitarbeiterUpdate(MitArbeiter mitarbeiter) {
		this.repository2.save(mitarbeiter);
	}
	public void mitarbeiteDelete(Integer id) {
		this.repository2.deleteById(id);
	}
	
	public MitArbeiter mitarbeiterFindById(Integer id) {
		MitArbeiter mitarbeiter=this.repository2.findById(id).get();
		return mitarbeiter;
	}

}
