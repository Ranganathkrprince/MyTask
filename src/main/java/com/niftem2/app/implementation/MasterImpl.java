package com.niftem2.app.implementation;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.niftem2.app.entity.Courses;
import com.niftem2.app.model.CoursesRequest;
import com.niftem2.app.service.MasterService;
import com.niftem2.app.util.AutoManager;

@Service
@Transactional

public class MasterImpl extends AutoManager implements MasterService {
	private static Logger logger = LoggerFactory.getLogger("master-log");
	private Date date2;


@Override
	public Map<String, String> createCourses(CoursesRequest request) {
		Map<String, String> info = new LinkedHashMap<>();
		try {
			List<Courses> tasks = new ArrayList<Courses>();
		

			tasks = super.courses
					.findByExName(
							request.getExName());
			if (tasks.size() > 0) {
				info.put("status", "2");
				info.put("message", "Course name already exists");
				return info;
			}

			Date date = new Date();
			Courses courses = new Courses();
			courses.setExName(request.getExName());
			courses.setExDescription(request.getExDescription());
			courses.setExCoursesCode(request.getExCoursesCode());
			courses.setExSubjectCode(request.getExSubjectCode());
			
			super.courses.save(courses);
			info.put("status", "1");
			info.put("message", "Course created successfully");
			info.put("id", courses.getId().toString());
			return info;

		} catch (Exception e) {
			logger.error("Exception occured" + e);
			StringWriter errors = new StringWriter();
			e.printStackTrace(new PrintWriter(errors));
			logger.error(errors.toString());
			info.put("status", "0");
			info.put("message", "Something went wrong");
			return info;
		}
	}





@Override
	public Map<String, String> updateCourses(@Valid CoursesRequest request) {
		// TODO Auto-generated method stub
		Map<String, String> info = new LinkedHashMap<>();
		try {
			Optional<Courses> Courses = super.courses.findById(request.getId());
			if (request.getId() == null || !Courses.isPresent()) {
				info.put("status", "2");
				info.put("message", "Course id not present");
				return info;
			}

			List<Courses> result = new ArrayList<Courses>();
			

			result = super.courses
					.findByExName(
							request.getExName());

			
			
			if (result.size() > 0 && result.get(0).getId() != request.getId()) {
				info.put("status", "2");
				info.put("message", "Course name already exists");
				return info;
			}

			Date date = new Date();

			int retval = super.courses.updateCourses(request.getExName(), request.getExDescription(), date,
					request.getExIsActive(), request.getExCoursesCode(), request.getId());
			if (retval == 1) {
				// update mapping table

				info.put("status", "1");
				info.put("message", "Courses updated successfully");
				return info;
			} else {
				info.put("status", "2");
				info.put("message", "Courses id not present");
				return info;
			}

		} catch (Exception e) {
			logger.error("Exception occured" + e);
			StringWriter errors = new StringWriter();
			e.printStackTrace(new PrintWriter(errors));
			logger.error(errors.toString());
			info.put("status", "0");
			info.put("message", "Something went wrong");
			return info;
		}
	}




@Override
	public Map<String, String> deleteCourses(CoursesRequest request) {
		// TODO Auto-generated method stub
		Map<String, String> info = new LinkedHashMap<>();
		try {
			Optional<Courses> task = super.courses.findById(request.getId());
			if (task.isPresent()) {
				Boolean exIsDelete = true;
				Boolean is_active = false;
				int result = super.courses.deleteCourses(exIsDelete, is_active, task.get().getId());
				if (result == 0) {
					info.put("status", "2");
					info.put("message", "Something went wrong");
					return info;
				}
				info.put("status", "1");
				info.put("message", "Course deleted successfully");
				return info;
			}
			info.put("status", "2");
			info.put("message", "Course id not present");
			return info;
		} catch (Exception e) {
			logger.error("Exception occured" + e);
			StringWriter errors = new StringWriter();
			e.printStackTrace(new PrintWriter(errors));
			logger.error(errors.toString());
			info.put("status", "0");
			info.put("message", "Something went wrong");
			return info;
		}
	}

	@Override
	public Map<String, Object> getCourses(CoursesRequest request) {
		// TODO Auto-generated method stub
		Map<String, Object> info = new LinkedHashMap<>();
		try {
			List<Courses> tasks = super.courses.findByExIsDelete(false);
			if (tasks.size() <= 0) {
				info.put("status", "2");
				info.put("message", "Courses not created");
				return info;
			} else {
				List dataList = new LinkedList();
				for (Courses e : tasks) {
					Map<Object, Object> coursesdata = new HashMap<Object, Object>();
					coursesdata.put("id", e.getId());
					coursesdata.put("exName", e.getExName());
					coursesdata.put("exDescription", e.getExDescription());
					
					coursesdata.put("exSubjectCode", e.getExSubjectCode());
					coursesdata.put("exCoursesCode", e.getExCoursesCode());
					
					dataList.add(coursesdata);
				}
				info.put("status", "1");
				info.put("message", "success");
				info.put("details", dataList);
				return info;
			}

		} catch (Exception e) {
			logger.error("Exception occured" + e);
			StringWriter errors = new StringWriter();
			e.printStackTrace(new PrintWriter(errors));
			logger.error(errors.toString());
			info.put("status", "0");
			info.put("message", "Something went wrong");
			return info;
		}
	}
}