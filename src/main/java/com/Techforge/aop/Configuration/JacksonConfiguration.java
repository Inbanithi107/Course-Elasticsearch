package com.Techforge.aop.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

/**
 * Responsible for configuring Jackason ObjectMapper
 */
@Configuration
public class JacksonConfiguration {
	
	/**
	 * This bean is used to initialize Objectmapper with JavaTimemodule for
	 * mapping sample-course to Java object
	 * @return instance of ObjectMapper 
	 */
	@Bean
	public ObjectMapper registerModule() {
		ObjectMapper mapper = new ObjectMapper();
		mapper.registerModule(new JavaTimeModule());
		mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
		return mapper;
	}

}
