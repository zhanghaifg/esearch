package com.elastic.main.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.elastic.main.model.School;
import com.elastic.main.service.SchoolService;

@RestController
public class SchoolController {
	
	@Autowired
	private SchoolService schoolService;
	
	@RequestMapping(value="/schools",method=RequestMethod.GET)
	public Iterable<School>	 getAll() {
		 Iterable<School> school = schoolService.findAll();
		 System.out.println("--------getAll---------");
		 for(School x : school){
			 System.out.println(x.getName()+", "+x.getCity()+", id: "+x.getId()+", rating: "+x.getRating());
//			 System.out.println(x.toString());
		 }
		 return school;
	}
}
