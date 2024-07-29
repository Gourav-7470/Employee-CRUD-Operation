package com.univ.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="emp")
public class Employee {

	//Data Member >Encapsulate
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(length=11,nullable=false)
	private int empId;
	
	@Column(name="name",nullable=false,length=55)
	private String empName;
	
	@Column(name="designation",nullable=false,length=55)
	private String empDesig;
	
	@Column(name="age",nullable=false,length=11)
	private int empAge;
	
	@Column(name="email",nullable=false,length=75)
	private String empEmail;
	
	@Transient
	@Column(name="working_hours")
	private int empWorkingHourse() {
		return 0;
	}
	
	//Default Constructor
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
//Parameterized Constructor
	
	public Employee( String empName, String empDesig, int empAge, String empEmail) {
		super();
	//	this.empId = empId;
		this.empName = empName;
		this.empDesig = empDesig;
		this.empAge = empAge;
		this.empEmail = empEmail;
	}


//	public int getEmpId() {
//		return empId;
//	}
//
//
//	public void setEmpId(int empId) {
//		this.empId = empId;
//	}

	

	//Getter/Setter for employee Name
	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}

//Getter/Setter for employee Designation
	public String getEmpDesig() {
		return empDesig;
	}


	public void setEmpDesig(String empDesig) {
		this.empDesig = empDesig;
	}

	//Getter/Setter for employee Age
	public int getEmpAge() {
		return empAge;
	}


	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	//Getter/Setter for employee Email
	public String getEmpEmail() {
		return empEmail;
	}


	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	
	
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDesig=" + empDesig + ", empAge=" + empAge
				+ ", empEmail=" + empEmail + "]";
	}
		
}
