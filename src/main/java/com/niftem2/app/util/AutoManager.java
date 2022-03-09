package com.niftem2.app.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.niftem2.app.repository.CoursesRepository;;

@Component
public class AutoManager {



	@Autowired
	public CoursesRepository courses;
	
}
