package Rest_API.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Rest_API.entity.Course;
import Rest_API.services.CourseService;

@RestController
public class MyController {

	@Autowired
	private CourseService courseServices;

	// get the courses

	@GetMapping("/courses")
	public List<Course> getCourses() {
		return courseServices.getCourses();
	}

	// get the course by id

	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable int courseId) {
		System.out.println("hyy1");
		return courseServices.getCourse(courseId);

	}

	// add courses

	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) {
		return courseServices.addCourse(course);
	}

	// update course by id

	@PutMapping("/courses/{courseId}")
	public Object updateCourse(@PathVariable int courseId, @RequestBody Course course) {
		Course existingCourse = courseServices.getCourse(courseId);
		if (existingCourse != null) {
			return courseServices.updateCourse(course);
		} else {
			return "Course id not found";
		}
	}

	// delete course by id

	@DeleteMapping("/courses/{courseId}")
	public String deleteCourse(@PathVariable int courseId) {
		Course existingCourse = courseServices.getCourse(courseId);
		if (existingCourse != null) {
			return courseServices.deleteCourse(existingCourse);
		} else {
			return "Course id not found";
		}
	}
}
