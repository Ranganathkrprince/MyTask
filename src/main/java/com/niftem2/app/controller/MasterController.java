package com.niftem2.app.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.niftem2.app.model.CoursesRequest;
import com.niftem2.app.service.MasterService;

@RequestMapping("/api/master/")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@Validated
public class MasterController {	
	@Autowired
	private MasterService msterService;
	
	

	// Courses
	@PostMapping(value = "/courses/create")
	public Map<String, String> createCourses(@Valid @RequestBody CoursesRequest request) {
		return msterService.createCourses(request);
	}

	@PostMapping(value = "/courses/update")
	public Map<String, String> updateCourses(@Valid @RequestBody CoursesRequest request) {
		return msterService.updateCourses(request);
	}

	@PostMapping(value = "/courses/delete")
	public Map<String, String> deleteCourses(@RequestBody CoursesRequest request) {
		return msterService.deleteCourses(request);
	}

	@PostMapping(value = "/courses/get")
	public Map<String, Object> getCourses( CoursesRequest request) {
		return msterService.getCourses(request);
	}
	
}