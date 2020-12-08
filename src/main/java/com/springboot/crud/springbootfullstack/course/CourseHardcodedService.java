package com.springboot.crud.springbootfullstack.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CourseHardcodedService {

	private static List<Course> courses = new ArrayList<>();
	private static long idCounter = 0;
	
	static {
		courses.add(new Course(++idCounter, "in30Minutes", "Learn Full Stack with spring boot"));
		courses.add(new Course(++idCounter, "in30Minutes", "Learn Full Stack "));
		courses.add(new Course(++idCounter, "in30Minutes", "Learn Micto Services"));
		courses.add(new Course(++idCounter, "in30Minutes", "Learn Full Stack with spring boot"));
	}
	
	public List<Course> findAll(){
		return courses;
	}
}
