package com.SimpleDB.com.SimpleDB;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Service;


@Service
public interface StudentService extends JpaRepository<Student, Long>{

	
}