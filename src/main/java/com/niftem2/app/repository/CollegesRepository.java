package com.niftem2.app.repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.niftem2.app.entity.Colleges;

public interface CollegesRepository extends CrudRepository<Colleges, Long> {

	List<Colleges> findByExNameAndExIsDelete(String exName, boolean exIsDelete);
	
	@Modifying
	@Transactional
	@Query(value = "update ex_colleges set ex_name = ?1 ,ex_identifier =?2 ,ex_address =?3,ex_email =?4,ex_telephone =?5,ex_is_active =?6  , ex_update_date = ?7 ,ex_local_name=?8, ex_fax=?9, ex_place=?10, ex_description=?12 where id =?11", nativeQuery = true)
	int updateCollegeRecord(String exName, String exIdentifier, String exAddress, String exEmail, String exTelephone,
			Boolean exIsActive, Date date, String exlocalname, String fax, String place, Long id, String descript);

	
	@Modifying
	@Transactional
	@Query(value = "update ex_colleges set ex_is_delete = ?1  ,ex_is_active = ?2  where id =?3", nativeQuery = true)
	int deleteCollege(Boolean exIsDelete, Boolean is_active, Long id);

	List<Colleges> findByExIsDelete(boolean exIsDelete);
	
	Optional<Colleges> findByIdAndExIsDeleteAndExIsActive(Long colleges, boolean delete, boolean active);

	Optional<Colleges> findByExNameAndExIsDeleteAndExIsActive(String collegeName, boolean isDelete, boolean isActive);
	
	

	List<Colleges> findByExNameAndExIsDeleteAndExIdentifier(String name, boolean b, String exIdentifier);

	Optional<Colleges> findByExIdentifierAndExIsDeleteAndExIsActive(String exIdentifier, boolean b, boolean c);

	List<Colleges> findByExIdentifierAndExIsDelete(String exIdentifier, boolean b);

	Optional<Colleges> findByIdAndExIsDeleteAndExIsActive(Colleges colleges, boolean delete, boolean active);

	Optional<Colleges> findByExIsDeleteAndExIsActiveAndId(boolean b, boolean c, Long colleges);
	

}
