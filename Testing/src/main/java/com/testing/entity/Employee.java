package com.testing.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emptab")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="eid")
	private Integer empid;
	@Column(name="ename")
	private String empName;
	@Column(name="dept")
	private String empDept;
	@Column(name="esal")
	private Double empSal;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String empName, String empDept, Double empSal) {
		super();
		this.empName = empName;
		this.empDept = empDept;
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", empDept=" + empDept + ", empSal=" + empSal
				+ "]";
	}

	
	
	
	
	

}
