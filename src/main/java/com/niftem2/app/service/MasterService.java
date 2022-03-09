package com.niftem2.app.service;

import java.util.Map;
import com.niftem2.app.model.CoursesRequest;

public interface MasterService {

	
	
	
	Map<String, String> createCourses(CoursesRequest request);
	Map<String, String> updateCourses(CoursesRequest request);
	Map<String, String> deleteCourses(CoursesRequest request);
	Map<String, Object> getCourses(CoursesRequest request);


}
