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
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

@Component
public class Courseloader implements CommandLineRunner{
	
	private final ObjectMapper mapper;
	
	public Courseloader(ObjectMapper mapper) {
		this.mapper = mapper;
	}

	@Override
	public void run(String... args) throws Exception {
		
		InputStream stream = new ClassPathResource("sample-courses.json").getInputStream();
		List<Course> courses = mapper.readValue(stream, new TypeReference<List<Course>>() {});
		for(Course course : courses) {
			System.out.println(course.toString());
		}
		
	}

}
