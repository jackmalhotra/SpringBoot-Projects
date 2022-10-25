package RestApi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import RestApi.entity.Course;

public interface CourseRepo extends JpaRepository<Course,Integer>{

	

}
