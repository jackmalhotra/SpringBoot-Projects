package com.spring.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.student.model.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {

}
