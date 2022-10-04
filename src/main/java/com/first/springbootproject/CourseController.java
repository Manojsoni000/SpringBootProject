package com.first.springbootproject;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//In this Coursecontroller we create a course controller and want to return back :- id, name, author
//In this Course controller we want to build a rest API so we use annotation @RestController


@RestController
public class CourseController {
	
	//Make Url for this "/courses" someone hit this URL our this page will call so we use @RequestMapping
	
	@RequestMapping("/courses")
	public List<Course> retriveAllCourses() {
		return Arrays.asList(new Course(1, "Learn AWS", "Udemy"), new Course(2, "Learn Python", "W3School"));
	}
}
 