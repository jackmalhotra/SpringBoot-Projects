package com.testing.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.testing.entity.Customer;

public interface EmployeeRepository extends JpaRepository<Customer,Integer>{
	
	
		@Query(value="SELECT * FROM (SELECT * FROM customerdata as c ORDER BY c.id DESC LIMIT 10 )Var1 ORDER BY id ASC",nativeQuery = true)	
		List<Customer> getEmployeeData();
/*
	@Query("SELECT * from emptab")
	List<Employee> getEmployeeDataa();
*/
}
