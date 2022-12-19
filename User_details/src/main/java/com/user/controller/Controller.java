package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.dao.Dao;
import com.user.model.Model;

@RestController
@RequestMapping("controller")
public class Controller{

	@Autowired
	private Dao service;  
	
	@PostMapping("/add")
	public Model addMethod(@RequestBody Model value) {
		return service.saveMethod(value);
	}
	
	@GetMapping("/getall")
	public List<Model> getMethod(){
		return service.findallMethod();
	}
	
	@GetMapping("/getid")
	public Model getidMethod(int id) {
		return service.findbyidMethod(id);
	}
	
}
