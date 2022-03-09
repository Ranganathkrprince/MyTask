package com.niftem2.app.model;

import java.util.Arrays;
import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author Parthasaradhi
 *
 */
public class CoursesRequest {

	@NotEmpty@NotNull@NotBlank(message = "Please provide a name")
	private String exName;

	private String exDescription;

	@NotNull(message = "Programme is required")
	private Long programmes;

	private Long id;
	
	private String exSubjectCode;
	
	@NotNull(message = "Please provide a exIsActive 0/1")
	private Boolean exIsActive;
	
	@NotNull(message = "programmeyear is required")
	private Long programmeYear;
	
	@NotNull(message = "semester is required")
	private Long semester;
	
	@NotNull(message = "department is required")
	private Long department;
	
	@NotNull(message = "degree is required")
	private Long degree;
	
	@NotNull(message = "exStudentId is required")
	private Long exStudentId;
	
	@NotNull(message = "stream is required")
	private Long stream;
	
	@NotNull(message="please provide colleges")
	private Long colleges;
		
	
	
	@NotNull(message = "Please provide a exIsSatisfactory 0/1")
	private Boolean exIsSatisfactory;
	
	
	@NotNull(message = "Please provide a exIsIndustrialVisit 0/1")
	private Boolean exIsIndustrialVisit;
	
	
	@NotNull(message = "Please provide a exIsVillageAdoption 0/1")
	private Boolean exIsVillageAdoption;
	
	@NotNull(message = "Please provide a exIsIndustrialTrainingOrInternship 0/1")
	private Boolean exIsIndustrialTrainingOrInternship;
	
	@NotNull(message = "Please provide a exIsResearchProject 0/1")
	private Boolean exIsResearchProject;
	
	@NotNull(message = "Please provide a exIsProject 0/1")
	private Boolean exIsProject;
	
	@NotNull(message = "Please provide a exIsElective 0/1")
	private Boolean exIsElective;
	
	@NotNull(message = "Please provide a exIsSeminar 0/1")
	private Boolean exIsSeminar;
	
	@NotNull(message = "Please provide a exIsElective 0/1")
	private Boolean exIscompulsory;
	
	@NotEmpty@NotNull@NotBlank(message = "Please provide exCoursesCode")
	private String exCoursesCode;
		
	@NotNull(message = "creditHours is required")
	private Long  creditHours;

	@NotNull(message = "academicyear is required")
	private Long academicYear;
	
	@NotNull(message = "batch is required")
	private Long batch;

	@NotNull(message="please provide coursesType")
	private List<Long> coursesType ;
	private Long user;
	
	private Long courses;
	
	private MultipartFile exSyllabus;
	
	private MultipartFile exFeereceipt;
	
	private MultipartFile exMarksheet;
	
	private String exRollNo;
	
	 MultipartFile[] files;
	 
	 @NotEmpty@NotNull@NotBlank(message = "Please provide Identifier")
	    private String exIdentifier;


	public String getExName() {
		return exName;
	}

	public String getExDescription() {
		return exDescription;
	}

	public Long getProgrammes() {
		return programmes;
	}

	public Long getId() {
		return id;
	}

	public String getExSubjectCode() {
		return exSubjectCode;
	}

	public Boolean getExIsActive() {
		return exIsActive;
	}

	public Long getProgrammeYear() {
		return programmeYear;
	}

	public Long getSemester() {
		return semester;
	}

	public Long getDepartment() {
		return department;
	}

	public Long getDegree() {
		return degree;
	}

	public Long getStream() {
		return stream;
	}

	public Long getColleges() {
		return colleges;
	}

	public Boolean getExIsSatisfactory() {
		return exIsSatisfactory;
	}

	public Boolean getExIsProject() {
		return exIsProject;
	}

	public Boolean getExIsElective() {
		return exIsElective;
	}

	public Boolean getExIsSeminar() {
		return exIsSeminar;
	}

	public Boolean getExIscompulsory() {
		return exIscompulsory;
	}

	public String getExCoursesCode() {
		return exCoursesCode;
	}

	public Long getCreditHours() {
		return creditHours;
	}

	public Long getAcademicYear() {
		return academicYear;
	}

	public Long getBatch() {
		return batch;
	}

	public List<Long> getCoursesType() {
		return coursesType;
	}

	public Long getUser() {
		return user;
	}

	public Long getCourses() {
		return courses;
	}

	public MultipartFile getExSyllabus() {
		return exSyllabus;
	}

	public MultipartFile getExMarksheet() {
		return exMarksheet;
	}

	public String getExRollNo() {
		return exRollNo;
	}

	public MultipartFile[] getFiles() {
		return files;
	}

	public void setExName(String exName) {
		this.exName = exName;
	}

	public void setExDescription(String exDescription) {
		this.exDescription = exDescription;
	}

	public void setProgrammes(Long programmes) {
		this.programmes = programmes;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setExSubjectCode(String exSubjectCode) {
		this.exSubjectCode = exSubjectCode;
	}

	public void setExIsActive(Boolean exIsActive) {
		this.exIsActive = exIsActive;
	}

	public void setProgrammeYear(Long programmeYear) {
		this.programmeYear = programmeYear;
	}

	public void setSemester(Long semester) {
		this.semester = semester;
	}

	public void setDepartment(Long department) {
		this.department = department;
	}

	public void setDegree(Long degree) {
		this.degree = degree;
	}

	public void setStream(Long stream) {
		this.stream = stream;
	}

	public void setColleges(Long colleges) {
		this.colleges = colleges;
	}

	public void setExIsSatisfactory(Boolean exIsSatisfactory) {
		this.exIsSatisfactory = exIsSatisfactory;
	}

	public void setExIsProject(Boolean exIsProject) {
		this.exIsProject = exIsProject;
	}

	public void setExIsElective(Boolean exIsElective) {
		this.exIsElective = exIsElective;
	}

	public void setExIsSeminar(Boolean exIsSeminar) {
		this.exIsSeminar = exIsSeminar;
	}

	public void setExIscompulsory(Boolean exIscompulsory) {
		this.exIscompulsory = exIscompulsory;
	}

	public void setExCoursesCode(String exCoursesCode) {
		this.exCoursesCode = exCoursesCode;
	}

	public void setCreditHours(Long creditHours) {
		this.creditHours = creditHours;
	}

	public void setAcademicYear(Long academicYear) {
		this.academicYear = academicYear;
	}

	public void setBatch(Long batch) {
		this.batch = batch;
	}

	public void setCoursesType(List<Long> coursesType) {
		this.coursesType = coursesType;
	}

	public void setUser(Long user) {
		this.user = user;
	}

	public void setCourses(Long courses) {
		this.courses = courses;
	}

	public void setExSyllabus(MultipartFile exSyllabus) {
		this.exSyllabus = exSyllabus;
	}

	public void setExMarksheet(MultipartFile exMarksheet) {
		this.exMarksheet = exMarksheet;
	}

	public void setExRollNo(String exRollNo) {
		this.exRollNo = exRollNo;
	}

	public void setFiles(MultipartFile[] files) {
		this.files = files;
	}

	
	
	
	public Boolean getExIsIndustrialVisit() {
		return exIsIndustrialVisit;
	}

	public void setExIsIndustrialVisit(Boolean exIsIndustrialVisit) {
		this.exIsIndustrialVisit = exIsIndustrialVisit;
	}

	public Boolean getExIsVillageAdoption() {
		return exIsVillageAdoption;
	}

	public void setExIsVillageAdoption(Boolean exIsVillageAdoption) {
		this.exIsVillageAdoption = exIsVillageAdoption;
	}

	public Boolean getExIsIndustrialTrainingOrInternship() {
		return exIsIndustrialTrainingOrInternship;
	}

	public void setExIsIndustrialTrainingOrInternship(Boolean exIsIndustrialTrainingOrInternship) {
		this.exIsIndustrialTrainingOrInternship = exIsIndustrialTrainingOrInternship;
	}

	public Boolean getExIsResearchProject() {
		return exIsResearchProject;
	}

	public void setExIsResearchProject(Boolean exIsResearchProject) {
		this.exIsResearchProject = exIsResearchProject;
	}

	
	
	
	public String getExIdentifier() {
		return exIdentifier;
	}

	public void setExIdentifier(String exIdentifier) {
		this.exIdentifier = exIdentifier;
	}
	
	public Long getExStudentId() {
		return exStudentId;
	}

	public void setExStudentId(Long exStudentId) {
		this.exStudentId = exStudentId;
	}

	public MultipartFile getExFeereceipt() {
		return exFeereceipt;
	}

	public void setExFeereceipt(MultipartFile exFeereceipt) {
		this.exFeereceipt = exFeereceipt;
	}

	@Override
	public String toString() {
		return "CoursesRequest [exName=" + exName + ", exDescription=" + exDescription + ", programmes=" + programmes
				+ ", id=" + id + ", exSubjectCode=" + exSubjectCode + ", exIsActive=" + exIsActive + ", programmeYear="
				+ programmeYear + ", semester=" + semester + ", department=" + department + ", degree=" + degree
				+ ", exStudentId=" + exStudentId + ", stream=" + stream + ", colleges=" + colleges
				+ ", exIsSatisfactory=" + exIsSatisfactory + ", exIsIndustrialVisit=" + exIsIndustrialVisit
				+ ", exIsVillageAdoption=" + exIsVillageAdoption + ", exIsIndustrialTrainingOrInternship="
				+ exIsIndustrialTrainingOrInternship + ", exIsResearchProject=" + exIsResearchProject + ", exIsProject="
				+ exIsProject + ", exIsElective=" + exIsElective + ", exIsSeminar=" + exIsSeminar + ", exIscompulsory="
				+ exIscompulsory + ", exCoursesCode=" + exCoursesCode + ", creditHours=" + creditHours
				+ ", academicYear=" + academicYear + ", batch=" + batch + ", coursesType=" + coursesType + ", user="
				+ user + ", courses=" + courses + ", exSyllabus=" + exSyllabus + ", exFeereceipt=" + exFeereceipt
				+ ", exMarksheet=" + exMarksheet + ", exRollNo=" + exRollNo + ", files=" + Arrays.toString(files)
				+ ", exIdentifier=" + exIdentifier + "]";
	}
}
