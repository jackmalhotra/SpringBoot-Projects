package com.spring.student.service;

import java.util.List;


import com.spring.student.model.Student;

public interface StudentService {
	
	

	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);

	List<Student> getAllStudents();
	

}
