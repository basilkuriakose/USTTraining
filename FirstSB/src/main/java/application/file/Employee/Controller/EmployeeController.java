package application.file.Employee.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EmployeeModel.Employee;

@RestController
public class EmployeeController {

	@RequestMapping("/")
	public List<Employee>getEmployees() 
    {
	      List<Employee> employeesList = new ArrayList<Employee>();
	      employeesList.add(new Employee(101,"Basil",100000));
	      employeesList.add(new Employee(102,"Gritty",25000));
	      employeesList.add(new Employee(103,"Badhu",50000));
	      return employeesList;
	    }

}
