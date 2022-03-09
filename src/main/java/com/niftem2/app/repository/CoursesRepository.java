package com.niftem2.app.repository;

import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niftem2.app.entity.Courses;

@Repository
@Service
@Transactional
public interface CoursesRepository extends CrudRepository<Courses, Long>{


	
	@Modifying
	@Transactional
	@Query(value = "update ex_courses set ex_is_delete = ?1,ex_is_active=?2  where id =?3", nativeQuery = true)
	int deleteCourses(Boolean exIsDelete, Boolean is_active, Long id);
	

	List<Courses> findByExIsDelete(boolean exIsDelete);



	List<Courses> findByExName(String exName);



	@Modifying
	@Transactional
	@Query(value = "update ex_courses set ex_is_delete = ?1,ex_is_active=?2  where id =?3", nativeQuery = true)
	int updateCourses(String exName, String exDescription, Date date, Boolean exIsActive, String exCoursesCode,
			Long id);
}