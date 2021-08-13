package com.transaction.demo.Transaction.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.transaction.demo.Transaction.entity.Appointment;
@Repository
public interface AppointmentRepo extends JpaRepository<Appointment,Long>{

}
