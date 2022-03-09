package com.niftem2.app.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class CollegesRequest {
	
	private Long id;
	
	@NotNull@NotBlank@NotEmpty(message = "Please provide a name")
	private String exName;
	
	@NotNull(message = "localname  is required")
	private String exLocalName;
	

	private String exDescription;
	
	@NotNull(message = "Address  is required")
	private String exAddress;

	@NotNull(message = "Email  is required")
	private String exEmail;
	
	@NotNull(message = "telephone  is required")
	private String exTelephone;

	@NotNull(message = "Fax  is required")
	private String exFax;
	
	@NotNull(message = "Place  is required")
	private String exPlace;
	
	@NotEmpty@NotNull@NotBlank(message = "Please provide a Identifier")
	private String exIdentifier;
	
	@NotNull(message = "Please provide a exIsActive 0/1")
	@Column(columnDefinition="BOOLEAN DEFAULT false")
	private Boolean exIsActive;
	
	@Column(columnDefinition="BOOLEAN DEFAULT false")
	private Boolean exIsDelete;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ex_create_date", columnDefinition = "DATETIME")
	private Date exCreateDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ex_update_date", columnDefinition = "DATETIME")
	private Date exUpdateDate;
	public Long user;
	public Long getUser() {
		return user;
	}

	public void setUser(Long user) {
		this.user = user;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getExName() {
		return exName;
	}

	public void setExName(String exName) {
		this.exName = exName;
	}

	public String getExAddress() {
		return exAddress;
	}

	public void setExAddress(String exAddress) {
		this.exAddress = exAddress;
	}

	public String getExEmail() {
		return exEmail;
	}

	public void setExEmail(String exEmail) {
		this.exEmail = exEmail;
	}

	public String getExTelephone() {
		return exTelephone;
	}

	public void setExTelephone(String exTelephone) {
		this.exTelephone = exTelephone;
	}

	public String getExFax() {
		return exFax;
	}

	public void setExFax(String exFax) {
		this.exFax = exFax;
	}

	public String getExPlace() {
		return exPlace;
	}

	public void setExPlace(String exPlace) {
		this.exPlace = exPlace;
	}

	public String getExIdentifier() {
		return exIdentifier;
	}

	public void setExIdentifier(String exIdentifier) {
		this.exIdentifier = exIdentifier;
	}

	public Boolean getExIsActive() {
		return exIsActive;
	}

	public void setExIsActive(Boolean exIsActive) {
		this.exIsActive = exIsActive;
	}

	public Boolean getExIsDelete() {
		return exIsDelete;
	}

	public void setExIsDelete(Boolean exIsDelete) {
		this.exIsDelete = exIsDelete;
	}

	public Date getExCreateDate() {
		return exCreateDate;
	}

	public void setExCreateDate(Date exCreateDate) {
		this.exCreateDate = exCreateDate;
	}

	public Date getExUpdateDate() {
		return exUpdateDate;
	}

	public void setExUpdateDate(Date exUpdateDate) {
		this.exUpdateDate = exUpdateDate;
	}

	public String getExLocalName() {
		return exLocalName;
	}

	public void setExLocalName(String exLocalName) {
		this.exLocalName = exLocalName;
	}

	public String getExDescription() {
		return exDescription;
	}

	public void setExDescription(String exDescription) {
		this.exDescription = exDescription;
	}

	@Override
	public String toString() {
		return "CollegesRequest [id=" + id + ", exName=" + exName + ", exLocalName=" + exLocalName + ", exDescription="
				+ exDescription + ", exAddress=" + exAddress + ", exEmail=" + exEmail + ", exTelephone=" + exTelephone
				+ ", exFax=" + exFax + ", exPlace=" + exPlace + ", exIdentifier=" + exIdentifier + ", exIsActive="
				+ exIsActive + ", exIsDelete=" + exIsDelete + ", exCreateDate=" + exCreateDate + ", exUpdateDate="
				+ exUpdateDate + ", user=" + user + "]";
	}

	
	

}
