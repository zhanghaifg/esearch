package com.service.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.elastic.main.ElasticSearchApplication;
import com.elastic.main.model.School;
import com.elastic.main.service.SchoolService;

//@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ElasticSearchApplication.class)
public class ShcoolServiceTest {

	@Autowired
	private SchoolService schoolService;
	
	@Autowired
    private ElasticsearchTemplate esTemplate;
	
	@Before
    public void before() {
        esTemplate.putMapping(School.class);
    }

	@Test
	public void testFindAll() {
		
		assertTrue(true);
	}

}
