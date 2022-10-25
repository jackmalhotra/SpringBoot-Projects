package com.testing.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.testing.repo.EmployeeRepository;


@Component
public class TestRunner implements CommandLineRunner{

	@Autowired
	private EmployeeRepository repo;
/*	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repo.save(new Employee("Arjun","QWERR",200.0));
		repo.save(new Employee("Brjun","dg",200.0));
		repo.save(new Employee("Crjun","hr",200.0));
		repo.save(new Employee("Drjun","qr",200.0));
		repo.save(new Employee("Erjun","nge",200.0));
		repo.save(new Employee("Frjun","bgf",200.0));
		repo.save(new Employee("Grjun","23456",200.0));
	}
*/

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repo.getEmployeeData().forEach(System.out::println);
		
	}
	/*
		
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repo.getEmployeeDataa().forEach(System.out::println);
		
	}
	*/
}
