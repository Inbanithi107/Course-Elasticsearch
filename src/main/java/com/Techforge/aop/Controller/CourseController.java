package com.Techforge.aop.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Techforge.aop.Entity.Course;
import com.Techforge.aop.Service.CourseService;

@RestController
@RequestMapping("/api/search")
public class CourseController {
	
	private final CourseService courseService;
	
	public CourseController(CourseService service) {
		this.courseService = service;
	}
	
	@GetMapping("/searchcourse")
	public ResponseEntity<List<Course>> getCoursesByTitleOrDescription(@RequestParam String q){
		
		return new ResponseEntity<List<Course>>(courseService.getCoursesByTiltleOrDescription(q), HttpStatus.OK);
		
	}

}
