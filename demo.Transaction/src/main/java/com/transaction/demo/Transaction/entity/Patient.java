package com.transaction.demo.Transaction.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Patient {
	public long getPatientNumber() {
		return PatientNumber;
	}
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public String getMobile() {
		return mobile;
	}
	public int getAge() {
		return age;
	}
	public void setPatientNumber(long patientNumber) {
		PatientNumber = patientNumber;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Patient(String name, String gender, String mobile, int age) {
		super();
		//PatientNumber = patientNumber;
		this.name = name;
		this.gender = gender;
		this.mobile = mobile;
		this.age = age;
	}
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private long PatientNumber;
private String name;
private String gender;
private String mobile;
private int age;

}
