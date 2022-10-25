package RestApi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import RestApi.entity.Course;
import RestApi.service.CourseService;

@RestController
@RequestMapping("/swag")
public class MyController {

	@Autowired
	private CourseService courseservice;

	// Displaying All Courses
	@GetMapping("/courses")
	public List<Course> getcourse() {
		return this.courseservice.getcourse();
	}

	// Displaying single course using id
	@GetMapping("/courses/{courseId}")
	public Optional<Course> getcourseById(@PathVariable int courseId) {
		return this.courseservice.getcourseById(courseId);

	}

	// Insert Course detail
	@PostMapping("/courses")
	public Course addcourse(@RequestBody Course course) {
		return this.courseservice.addcourse(course);

	}

	@PutMapping("/courses/{id}")
	public Course updatecourse(@RequestBody Course course) {
		return this.courseservice.updatecourse(course);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable int id) {
		this.courseservice.deleteStudentById(id);
		return "Id Number " + id + " Is Delected Successfully !";
	}

}
