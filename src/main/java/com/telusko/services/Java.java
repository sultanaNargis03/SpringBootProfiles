package com.telusko.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("java")
public class Java implements Courses {

	@Override
	public boolean registerToCourse(Double cost) 
	{
		System.out.println("Java course registered amount paid "+cost);
		return true;
	}

}
