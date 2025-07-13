package com.Techforge.aop.Repository;

import java.util.List;

import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.Techforge.aop.Entity.Course;

public interface CourseRepository extends ElasticsearchRepository<Course, String>{
	
	@Query("""
			{
			  "bool": {
			    "should": [
			      { "prefix": { "title.keyword": "?0" } },
			      { "prefix": { "description.keyword": "?0" } }
			    ]
			  }
			}
			""")
	List<Course> findByKeyword(String query);

}
