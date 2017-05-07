package com.hshimlad.rest;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.hshimlad.Employee;

@Path("/json/emp")
public class JsonEmployeeService {

	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee getEmployee(){
		Employee emp = new Employee();
		emp.setFirstName("Xyz");
		emp.setLastName("Abc");
		emp.setAge(28);
		return emp;
	}
	
	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Employee> getEmployeeList(){
		Employee emp = new Employee();
		Employee emp2 = new Employee();
		ArrayList list = new ArrayList<Employee>();
		emp.setFirstName("xyz");
		emp.setLastName("abc");
		emp.setAge(33);
		emp2.setAge(22);
		emp2.setFirstName("rama");
		emp2.setLastName("krishna");
		list.add(emp);
		list.add(emp2);
		return list;
	}
}
