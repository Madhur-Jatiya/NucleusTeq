package Rest_API.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Rest_API.Dao.CourseDao;
import Rest_API.entity.Course;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDao courseDao;
	
	@Override
	public List<Course> getCourses() {
		return courseDao.findAll();
	}

	@Override
	public Course getCourse(int courseId) {
		System.out.println("hyy2");
		return courseDao.findById(courseId).get();
//		return (courseDao.getOne(courseId));
	}

	@Override
	public Course addCourse(Course course) {
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		courseDao.save(course);
		return course;
	}

	@Override
	public String deleteCourse(Course course) {
		courseDao.delete(course);
		return "Deleted Successfully";
	}

}
