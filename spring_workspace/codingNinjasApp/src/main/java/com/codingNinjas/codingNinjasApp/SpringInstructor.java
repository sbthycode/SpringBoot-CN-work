package com.codingNinjas.codingNinjasApp;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("springInstructor")
public class SpringInstructor implements Instructor {

	String name;
	String age;

	@Override
	public void setInstructorDetails(String name, String age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String takeClass() {
		return "Hi my name is " + 
				this.name + " and I will be your Srping instructor";
	}

	@PostConstruct
	public void init() {
		System.out.println("spring instructor bean created");
	}
	
	@PreDestroy
	public void cleanup() {
		System.out.println("spring instructor bean about to be destroyed");
	}
}
