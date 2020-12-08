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
	
	public Course deleteById(long id) {
		Course course = findById(id);
		
		if(course == null) {
			return null;
		}
		
		if(courses.remove(course)) {
			return course;
		}
		
		return null;
	}
	
	public Course findById(long id) {
		for(Course course: courses) {
			if(course.getId() == id) {
				return course;
			}
		}
		return null;
	}
}
