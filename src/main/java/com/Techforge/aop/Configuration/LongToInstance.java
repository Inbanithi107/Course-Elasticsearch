package com.Techforge.aop.Configuration;
import java.time.Instant;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class LongToInstance implements Converter<Long, Instant>{

	@Override
	public Instant convert(Long source) {
		
		return Instant.ofEpochSecond(source);
	}

}
