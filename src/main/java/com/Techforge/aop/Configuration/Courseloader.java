package com.Techforge.aop.Configuration;

import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.util.List;

import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.type.ReferenceType;
import javax.lang.model.type.TypeKind;
import javax.lang.model.type.TypeVisitor;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import com.Techforge.aop.Entity.Course;
import com.Techforge.aop.Repository.CourseRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

@Component
public class Courseloader implements CommandLineRunner{
	
	private final ObjectMapper mapper;
	
	private final CourseRepository courseRepository;
	
	/**
	 * Constructor Injection from ApplicationContext
	 * @param mapper injected from Bean annotated method
	 */
	public Courseloader(ObjectMapper mapper, CourseRepository repository) {
		this.mapper = mapper;
		this.courseRepository = repository;
	}

	@Override
	public void run(String... args) throws Exception {
		courseRepository.deleteAll();
		InputStream stream = new ClassPathResource("sample-courses (1).json").getInputStream();
		List<Course> courses = mapper.readValue(stream, new TypeReference<List<Course>>() {});
		courseRepository.saveAll(courses);
		System.out.println("courses saved successfully");
		
	}

}
