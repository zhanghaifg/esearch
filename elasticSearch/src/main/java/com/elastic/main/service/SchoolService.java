package com.elastic.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elastic.main.model.School;
import com.elastic.main.repository.SchoolRepository;

@Service
public class SchoolService {
	
	@Autowired
	private SchoolRepository shcoolRepository;
	
	public Iterable<School> findAll() {
		return shcoolRepository.findAll();
		
	}

}
