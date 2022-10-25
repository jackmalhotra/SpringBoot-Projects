package RestApi.service;

import java.util.List;
import java.util.Optional;

import RestApi.entity.Course;

public interface CourseService {
	
	public List<Course> getcourse();

	public Optional<Course> getcourseById(int courseId);

	public Course addcourse(Course course);

	public Course updatecourse(Course course);
	
	public void deleteStudentById(int id);

}
