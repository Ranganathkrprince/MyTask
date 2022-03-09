package com.niftem2.app.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ex_colleges")
public class Colleges {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String exName;
	
	private String exAddress;

	private String exEmail;
	
	private String exTelephone;

	private String exFax;
	
	private String exPlace;
	
	private String exIdentifier;
	
	private String exLocalName;

	@Column(columnDefinition="TEXT")
	private String exDescription;

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
		return "Colleges [id=" + id + ", exName=" + exName + ", exAddress=" + exAddress + ", exEmail=" + exEmail
				+ ", exTelephone=" + exTelephone + ", exFax=" + exFax + ", exPlace=" + exPlace + ", exIdentifier="
				+ exIdentifier + ", exLocalName=" + exLocalName + ", exDescription=" + exDescription + ", exIsActive="
				+ exIsActive + ", exIsDelete=" + exIsDelete + ", exCreateDate=" + exCreateDate + ", exUpdateDate="
				+ exUpdateDate + "]";
	}

	

	
}
