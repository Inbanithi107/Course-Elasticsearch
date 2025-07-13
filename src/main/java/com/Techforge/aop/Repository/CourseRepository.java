package com.Techforge.aop.Repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.Techforge.aop.Entity.Course;

public interface CourseRepository extends ElasticsearchRepository<Course, String>{

}
