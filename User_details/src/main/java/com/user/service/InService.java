package com.user.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.model.Model;

public interface InService extends JpaRepository<Model,Integer> {

}
