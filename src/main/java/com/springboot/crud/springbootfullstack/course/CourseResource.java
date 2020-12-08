package com.springboot.crud.springbootfullstack.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = { "http://localhost:3000", "https://my-react-app20201208.herokuapp.com"})
@RestController
public class CourseResource {

	@Autowired
	private CourseHardcodedService courseManagementService;
	
	@GetMapping("/")
	String hello() {
		return "hello fahran";
	}
	
	@GetMapping("/instructors/{username}/courses")
	public List<Course> getAllCourses(@PathVariable String username){
		 return courseManagementService.findAll();
	}
}
