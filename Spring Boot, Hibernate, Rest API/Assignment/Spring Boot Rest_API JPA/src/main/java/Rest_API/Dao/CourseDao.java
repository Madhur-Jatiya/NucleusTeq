package Rest_API.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import Rest_API.entity.Course;

public interface CourseDao extends JpaRepository<Course, Integer>{

}
