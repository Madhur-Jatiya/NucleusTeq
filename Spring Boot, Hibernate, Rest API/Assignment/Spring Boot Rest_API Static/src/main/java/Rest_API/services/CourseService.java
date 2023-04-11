package Rest_API.services;

import java.util.List;

import org.springframework.stereotype.Service;

import Rest_API.entity.Course;

public interface CourseService {
	public List<Course> getCourses();

	public Course getCourse(int courseId);

	public Course addCourse(Course course);

	public Course updateCourse(Course existingCourse, Course course);

	public String deleteCourse(Course course);
}
