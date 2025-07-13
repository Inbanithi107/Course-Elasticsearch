package com.Techforge.aop.Entity;

import java.math.BigDecimal;
import java.time.Instant;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import com.Techforge.aop.Types.ActivityType;

@Document(indexName = "course")
public class Course {
	
	@Id
	private String id;
	
	private String title;
	
	private String description;
	
	private String category;
	
	private ActivityType type;
	
	private int minAge;
	
	private int maxAge;
	
	private BigDecimal price;
	
	private Instant nextSessionDate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public ActivityType getType() {
		return type;
	}

	public void setType(ActivityType type) {
		this.type = type;
	}

	public int getMinAge() {
		return minAge;
	}

	public void setMinAge(int minAge) {
		this.minAge = minAge;
	}

	public int getMaxAge() {
		return maxAge;
	}

	public void setMaxAge(int maxAge) {
		this.maxAge = maxAge;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Instant getNextSessionDate() {
		return nextSessionDate;
	}

	public void setNextSessionDate(Instant nextSessionDate) {
		this.nextSessionDate = nextSessionDate;
	}
	
	

}
