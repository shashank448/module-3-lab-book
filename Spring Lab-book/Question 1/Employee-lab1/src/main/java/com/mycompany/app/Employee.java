package com.mycompany.app;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;

import org.springframework.stereotype.Component;


@Component
public class Employee {
	@Value("${employeeId}")
	private int employeeId;
	@Value("${employeeName}")
	private String employeeName;
	@Value("${salary}")
	private double salary;
	@Value("${businessUnit}")
	private String businessUnit;
	@Value("${age}")
	private int age;
	
	
	public int getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public String getBusinessUnit() {
		return businessUnit;
	}


	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}



	 @PostConstruct
	    public void init(){
	        System.out.println("inside init");
	    }


	    @PreDestroy
	    public void onDestroy(){
	       System.out.println("inside ondestroy");
	    }
	
	    @Override
	    public String toString() {
	    	return "Employee name = "+this.getEmployeeName()+" Employee BU "+this.getBusinessUnit()+" Employee age = "+this.getAge();
	    	
	    }
	

}
