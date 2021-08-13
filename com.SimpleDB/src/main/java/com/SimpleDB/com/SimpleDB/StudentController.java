package com.SimpleDB.com.SimpleDB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;





@Controller
@RequestMapping(path = "/student/api")
public class StudentController {

    @Autowired
    private StudentService student;

    @PostMapping(path = "/")
    public @ResponseBody String addNewStudent(@RequestParam String Name, @RequestParam String DepartmentName) {

       Student stud = new Student();
        stud.setName(Name);
        stud.setDepartment(DepartmentName);
       
        student.save(stud);
        return "Student Created";
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable < Student > getAllStudents() {
        return student.findAll();
    }
    @PutMapping("/add")
	public ResponseEntity<Student> add(@RequestBody Student stud) {
		return ResponseEntity.ok(student.save(stud));
	}
    @PostMapping("/update")
   	public ResponseEntity<Student> update(@RequestBody Student stud) {
   		return ResponseEntity.ok(student.save(stud));
   	}
    
    @DeleteMapping("/{id}")
	public ResponseEntity<Student> delete(@PathVariable Long id) {
		student.findById(id).ifPresent(student::delete);
		return ResponseEntity.ok().build();

}
  

}