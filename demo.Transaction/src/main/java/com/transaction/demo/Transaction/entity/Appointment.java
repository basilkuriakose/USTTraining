package com.transaction.demo.Transaction.entity;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
public class Appointment {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private long AppointmentNumber;
private Date date;
private long DoctorNumber;
private long PatientNumber;
public Appointment() {
	super();
	// TODO Auto-generated constructor stub
}
public Appointment( Date date, long doctorNumber, long patientNumber) {
	super();
	//AppointmentNumber = appointmentNumber;
	this.date = date;
	DoctorNumber = doctorNumber;
	PatientNumber = patientNumber;
}
public long getAppointmentNumber() {
	return AppointmentNumber;
}
public Date getDate() {
	return date;
}
public long getDoctorNumber() {
	return DoctorNumber;
}
public long getPatientNumber() {
	return PatientNumber;
}
public void setAppointmentNumber(long appointmentNumber) {
	AppointmentNumber = appointmentNumber;
}
public void setDate(Date date) {
	this.date = date;
}
public void setDoctorNumber(long doctorNumber) {
	DoctorNumber = doctorNumber;
}
public void setPatientNumber(long patientNumber) {
	PatientNumber = patientNumber;
}

	
}
