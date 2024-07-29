package com.univ.impl;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.univ.entity.Employee;
import com.univ.util.HBSessionUtil;

public class EmployeeImpl {

	public void createEmp() {
//		Scanner ip = new Scanner(System.in);
//		System.out.println("\tEnter Employee Name");
//		String empName = ip.next();
//		ip.nextLine();
//		System.out.println("\tEnter Employee Desifnation");
//		String empDesig = ip.next();
//		ip.nextLine();
//		System.out.println("\tEnter Employee Age");
//		String empAge = ip.next();
//		ip.nextLine();
//
//		System.out.println("\tEnter Employee Gmail");
//		String empEmail = ip.next();
//		ip.nextLine();

		//Employee emp = new Employee(empName, empDesig, empAge, empEmail);
		 //Creating Employee Object
		Employee emp1=new Employee("Ganesh","Developer",27,"ganesh123@gmail.com");
		Employee emp2=new Employee("Mangesh","Tester",31,"mangesh123@gmail.com");
		Employee emp3=new Employee("Jignesh","Developer",28,"jignesh123@gmail.com");
		Employee emp4=new Employee("Santosh","Developer",22,"santosh123@gmail.com");
		Employee emp5=new Employee("Gourav","Developer",22,"Gourav123@gmail.com");
		Employee emp6=new Employee("Mohit","Developer",22,"Mohit123@gmail.com");
		// Creating Session Factory
		SessionFactory sf = HBSessionUtil.getSessionFactory();

		// getting session object from session factory
		org.hibernate.Session session = sf.openSession();

		// getting transaction object from session object
		session.beginTransaction();

		session.save(emp1);
		session.save(emp2);
		session.save(emp3);
		session.save(emp4);
		session.save(emp5);
		session.save(emp6);
	//	session.save(emp);
	//	System.out.println(emp);
		System.out.println("\t\t\t**********Employee Inserted Succusufully**********");
		session.getTransaction().commit();
		session.flush();
		session.close();
		sf.close();
	}

	public void readEmp() {
		// Create session factory object
		SessionFactory sf = HBSessionUtil.getSessionFactory();

		// getting session object from session factory
		Session session = sf.openSession();

		// getting transaction object from session object
		session.beginTransaction();

		// Transaction txn = session.beginTransaction();

		List<Employee> employeList = session.createQuery("FROM Employee", Employee.class).list();

		for (Employee employee : employeList) {
			System.out.println(employee.toString());
		}

		System.out.println("Found " + employeList.size() + " Employees");
		session.getTransaction().commit();
		session.flush();
		session.close();
		sf.close();

	}

	public void updateEmp() {

		// Create session factory object
		SessionFactory sessionFactory = HBSessionUtil.getSessionFactory();

		// getting session object from session factory
		Session session = sessionFactory.openSession();

		// getting transaction object from session object
		session.beginTransaction();

		Employee emp2 = (Employee) session.get(Employee.class, 1);
		emp2.setEmpName("Shalini Kumaris");
		emp2.setEmpEmail("shalini@gmail.com");

		System.out.println();
		System.out.println("\t \t \t ************* Employee Update Successfully ********");
		System.out.println();
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}

	public void deleteByIdEmp() {

		// Create session factory object
		SessionFactory sessionFactory = HBSessionUtil.getSessionFactory();
		// getting session object from session factory
		Session session = sessionFactory.openSession();
		// getting transaction object from session object
		session.beginTransaction();
		Employee emp = (Employee) session.get(Employee.class, 18);
		session.delete(emp);
		System.out.println();
		System.out.println("\t \t \t ************* Employee Deleted Successfully ********");
		System.out.println();
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}

	// Pending Service:- to be written by Student
	public void deleteAllEmp() {
		// Create session factory object
				SessionFactory sessionFactory = HBSessionUtil.getSessionFactory();
				// getting session object from session factory
				Session session = sessionFactory.openSession();
				// getting transaction object from session object
				session.beginTransaction();
				//String s1="DELETE FROM Employee";
				Query query=session.createQuery("DELETE FROM Employee");
				int result=query.executeUpdate();
				System.out.println();
				System.out.println("\t \t \t *************All Employee Deleted Successfully ********");
				System.out.println();
				session.getTransaction().commit();
				session.close();
				sessionFactory.close();

	}

}
