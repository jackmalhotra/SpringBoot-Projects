package com.spring.student.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.spring.student.model.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {

	@Query(value="SELECT * FROM student_data ORDER BY id ASC",nativeQuery = true)
	
	List<Student> getAllStudents();
}
