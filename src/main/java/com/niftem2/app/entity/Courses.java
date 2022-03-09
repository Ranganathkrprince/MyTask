package com.niftem2.app.entity;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ex_courses")
public class Courses {	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
		
	@Column(columnDefinition="TEXT")
	private String exDescription;
	
	private String exName;
	
	
	private String exCoursesCode;
	
	private String exSubjectCode;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ex_create_date", columnDefinition = "DATETIME")
	private Date exCreateDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ex_update_date", columnDefinition = "DATETIME")
	private Date exUpdateDate;

	public Long getId() {
		return id;
	}

	public String getExDescription() {
		return exDescription;
	}

	public String getExName() {
		return exName;
	}

	public String getExCoursesCode() {
		return exCoursesCode;
	}

	public String getExSubjectCode() {
		return exSubjectCode;
	}

	

	public Date getExCreateDate() {
		return exCreateDate;
	}

	public Date getExUpdateDate() {
		return exUpdateDate;
	}

	

	public void setId(Long id) {
		this.id = id;
	}

	public void setExDescription(String exDescription) {
		this.exDescription = exDescription;
	}

	public void setExName(String exName) {
		this.exName = exName;
	}

	public void setExCoursesCode(String exCoursesCode) {
		this.exCoursesCode = exCoursesCode;
	}

	public void setExSubjectCode(String exSubjectCode) {
		this.exSubjectCode = exSubjectCode;
	}

	@Override
	public String toString() {
		return "Courses [id=" + id + ", exDescription=" + exDescription + ", exName=" + exName + ", exCoursesCode="
				+ exCoursesCode + ", exSubjectCode=" + exSubjectCode + ", exCreateDate=" + exCreateDate
				+ ", exUpdateDate=" + exUpdateDate + "]";
	}

	
}
