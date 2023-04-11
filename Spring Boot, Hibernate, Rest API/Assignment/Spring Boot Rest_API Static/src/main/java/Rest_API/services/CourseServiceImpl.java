package Rest_API.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import Rest_API.entity.Course;
import Rest_API.services.CourseService;

@Service
public class CourseServiceImpl implements CourseService {

	List<Course> list;

	public CourseServiceImpl() {
		list = new ArrayList<>();

		list.add(new Course(1, "java", "4 months"));
		list.add(new Course(2, "python", "3 months"));
		list.add(new Course(3, "react", "1 months"));
	}

	@Override
	public List<Course> getCourses() {
		return list;
	}

	@Override
	public Course getCourse(int courseId) {
		Course c = null;

		for (Course course : list) {
			if (course.getId() == courseId) {
				c = course;
				break;
			}
		}

		return c;
	}

	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}

	@Override
	public Course updateCourse(Course existingCourse, Course course) {
		existingCourse.setTitle(course.getTitle());
		existingCourse.setDuration(course.getDuration());
		return course;
	}

	@Override
	public String deleteCourse(Course course) {
		list.remove(course);
		return "Course Deleted";
	}

}
