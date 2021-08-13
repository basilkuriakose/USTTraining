package com.transaction.demo.Transaction.Service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.transaction.demo.Transaction.Controller.DTO.AppointmentFormDto;
import com.transaction.demo.Transaction.entity.Appointment;
import com.transaction.demo.Transaction.entity.Patient;
import com.transaction.demo.Transaction.repo.AppointmentRepo;
import com.transaction.demo.Transaction.repo.PatientRepo;
@Service
@Transactional
public class BookAppointmentService {
	
	@Autowired
	private PatientRepo patientrepo;
	
	@Autowired
	private AppointmentRepo appointmentrepo;
	
	
	public String BookAppointment(AppointmentFormDto appointmentFormDto)
	{
		Patient patient=new ObjectMapper().convertValue(appointmentFormDto, Patient.class);
		Long PatientNumber=patientrepo.save(patient).getPatientNumber();
		System.out.println("Patient Details Saved Successfully");
		
		
		Appointment appointment=new Appointment(new Date(System.currentTimeMillis()),101L,PatientNumber);
		
		Long AppoinmentNumber=appointmentrepo.save(appointment).getAppointmentNumber();
		
		return "Appointment Confirmed"+AppoinmentNumber;
	}
}
