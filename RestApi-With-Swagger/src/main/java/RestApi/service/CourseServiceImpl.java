package RestApi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import RestApi.dao.CourseRepo;
import RestApi.entity.Course;

@Service
public class CourseServiceImpl implements CourseService{
	
//	List<Course> list;
	@Autowired
	private CourseRepo repo;
	
	public CourseServiceImpl() 
	{
//		list = new ArrayList<>();
//		list.add(new Course(1,"Arjun","Male"));
//		list.add(new Course(2,"Jack","Male"));
//		list.add(new Course(3,"Mahesh","Male"));
//		list.add(new Course(4,"Kajol","Female"));
//		list.add(new Course(5,"Sudha","Female"));
	}

	@Override
	public List<Course> getcourse() {
		return repo.findAll();
	}

	
	@Override
	public Optional<Course> getcourseById(int courseId) {
		return repo.findById(courseId);
	}

	@Override
	public Course addcourse(Course course) {
		repo.save(course);
		return course;
	}

	@Override
	public Course updatecourse(Course course) {	
		repo.save(course);
		return repo.save(course);
	}

	@Override
	public void deleteStudentById(int id) {
		repo.deleteById(id);
		
	}
	

}
