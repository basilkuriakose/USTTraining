package com.transaction.demo.Transaction.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.transaction.demo.Transaction.entity.Patient;

@Repository
public interface PatientRepo extends JpaRepository<Patient, Long>{

}
