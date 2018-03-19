package com.bext.springbootweb.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bext.springbootweb.model.Course;
import com.bext.springbootweb.model.Topic;
import com.bext.springbootweb.service.CourseService;
import com.bext.springbootweb.service.TopicService;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
    @RequestMapping("/temas/{temasId}/cursos")
	public List<Course> getAllCourses(@PathVariable String temasId) {
		return courseService.getAllCourses(temasId);
	}
    
    @RequestMapping("/temas/{temaid}/cursos/{id}")
    public Course getCourse(@PathVariable String id) {
    	return courseService.getCourse(id);
    }
    
    @RequestMapping(method=RequestMethod.POST, value="/temas/{temasId}/cursos")
    public void addCourse(@RequestBody Course course, @PathVariable String temasId) {
    	course.setTopic(new Topic(temasId, "", ""));
    	courseService.addCourse(course);
    }
    
    @RequestMapping(method=RequestMethod.PUT, value="/temas/{temasId}/cursos/{id}")
    public void updateCourse(@RequestBody Course course, @PathVariable String id, @PathVariable String temasId ) {
    	course.setTopic(new Topic(temasId, "", ""));
    	courseService.updateCourse(id, course);
    }
    
    @RequestMapping(method=RequestMethod.DELETE, value="/temas/{temasId}/cursos/{id}")
    public void deleteCourse(@PathVariable String id) {
    	courseService.deleteCourse(id);
    }
}
