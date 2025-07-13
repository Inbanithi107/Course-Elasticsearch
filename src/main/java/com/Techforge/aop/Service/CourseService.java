package com.Techforge.aop.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Techforge.aop.Entity.Course;
import com.Techforge.aop.Repository.CourseRepository;

@Service
public class CourseService {
	
	private final CourseRepository courseRepository;
	
	public CourseService(CourseRepository repository) {
		this.courseRepository = repository;
	}
	
	public List<Course> getCoursesByTiltleOrDescription(String query){
		return courseRepository.findByKeyword(query);
	}

}
