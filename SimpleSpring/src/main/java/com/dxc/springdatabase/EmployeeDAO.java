package com.dxc.springdatabase;

import java.util.List;

import javax.rmi.CORBA.StubDelegate;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAO {

JdbcTemplate jdT;
	public JdbcTemplate getJdbcTemplate() {
		return jdT;
	}
	
	public void setJdT(JdbcTemplate jdbcTemplate) {
		this.jdT = jdT;
	}
	
	public void addEmployee(Employee e)
	{
		String insert="insert into Employee values('"+e.getEmpId()+"','"+e.getName()+"',"+e.getSalary()+")";
    	this.jdT.update(insert);	
	}
	
}