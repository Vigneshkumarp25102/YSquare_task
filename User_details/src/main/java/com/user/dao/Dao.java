package com.user.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.model.Model;
import com.user.service.InService;

@Service
public class Dao {

	@Autowired
	private InService reposService;
	
	public Model saveMethod(Model value) {
		return reposService.save(value);
	}
	
	public List<Model> findallMethod(){
		return reposService.findAll();
	}
	
	public Model findbyidMethod(int id) {
		return reposService.findById(id).orElse(null);
	}
}
