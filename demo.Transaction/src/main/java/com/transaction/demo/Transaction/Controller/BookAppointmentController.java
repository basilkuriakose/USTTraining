package com.transaction.demo.Transaction.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.transaction.demo.Transaction.Controller.DTO.AppointmentFormDto;
import com.transaction.demo.Transaction.Service.BookAppointmentService;

@RestController
public class BookAppointmentController {

	@Autowired
	private BookAppointmentService bookappointmentservice;
	
	@PostMapping("/book")
	public String BookAppointment(@RequestBody AppointmentFormDto appointmentFormDto)
	{
		return bookappointmentservice.BookAppointment(appointmentFormDto);
	}
}
