package com.elastic.main.model;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.elastic.main.repository.SchoolRepository;

@Component
public class Load {
	
	@Autowired
	ElasticsearchOperations operations;
	
	@Autowired
	SchoolRepository schoolRepository;
	
	@PostConstruct
	@Transactional
	public void loadAll() {
		
//		operations.putMapping(School.class);
/*		String name = "CMS";
		String description = "Central Middle";
		String street = "School";
		String city = "Eden Priaire";
		String state = "MN";
		String zip = "55347";
		List<Double> location = new ArrayList<Double>();
		location.add(23.3);
		location.add(27.5);
		int fees = 2300;
		List<String> tags = new ArrayList<String>();
		tags.add("new");
		String rating = "4.78";
		School school = new School();
		school.setCity(city);
		school.setDescription(description);
		school.setFees(fees);
		school.setLocation(location);
		school.setName(name);
		school.setRating(rating);
		school.setState(state);
		school.setStreet(street);
		school.setTags(tags);
		school.setZip(zip);
		
		schoolRepository.save(school);*/
		System.out.println("-------------****Load ALL*****----------------");
	}
}
