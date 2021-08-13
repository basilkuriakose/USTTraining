package com.SpringDB.SpringDB;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;
import java.util.stream.Collectors;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.employee.demo.domain.Employee;
import com.employee.demo.service.EmployeeService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
@AutoConfigureMockMvc
class SpringDbApplicationTests {

	@Test
	void contextLoads() {
	}
	@Autowired
	private MockMvc mockMvc;
	@Autowired
	private ObjectMapper objectMapper;
	@MockBean
	private EmployeeService employeeService;
	
	
	@Test
	public void testGetAll() throws JsonProcessingException, Exception
	{
		when(employeeService.save(Mockito.any(Employee.class))).thenReturn(dummyList().get(0));
		mockMvc.perform(post("/employee/")
				.content("{\"id\":19,\"name\":\"john\",\"age\":23,\"department\":\"MCA\"}")
				.contentType(MediaType.APPLICATION_JSON_VALUE))
				.andDo(print())
				.andExpect(content().json("{\"id\":19,\"name\":\"john\",\"age\":23,\"department\":\"MCA\"}"));
		
	}

	

	private List<Employee> dummyList()
	{
		return Arrays.asList(new Employee[] {new Employee(1L,"john",23,"MCA")})
		.stream()
		.map(e->(Employee)e)
		.collect(Collectors.toList());
	}
	
	

}
