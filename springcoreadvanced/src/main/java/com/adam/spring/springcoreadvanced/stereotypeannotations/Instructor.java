package com.adam.spring.springcoreadvanced.stereotypeannotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Instructor {
	
	@Value("10")
	private int id;
	
	@Value("#{topics}")
	private List<String> topics;
	
	@Autowired
	private Profile profile;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Value("Adam")
	private String name;

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", topics=" + topics + ", profile=" + profile + ", name=" + name + "]";
	}

	
	
	

}
