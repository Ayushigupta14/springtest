package com.dxc.springdatabase;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext context = new  ClassPathXmlApplicationContext("Beans.xml"); 
		EmployeeDAO empDAO=(EmployeeDAO)context.getBean("edao");
		
		System.out.println("Enter choice : 1 Add Employee 2.Modify 3.Delete 4.Search 5.List All");		
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		sc.nextLine();
		switch(choice)
		{
		case 1:
			System.out.println("Enter name ");
			String name=sc.nextLine();
			System.out.println("Enter id ");
			String id=sc.nextLine();
			System.out.println("Enter marks ");
			float salary=sc.nextFloat();
			Employee e=new Employee(name,salary,id);
			empDAO.addEmployee(e);
			break;
		case 5:
			
		}
	}
}
