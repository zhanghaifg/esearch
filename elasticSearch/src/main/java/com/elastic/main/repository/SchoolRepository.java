package com.elastic.main.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.elastic.main.model.School;

@Repository
public interface SchoolRepository extends ElasticsearchRepository<School, String> {

}
