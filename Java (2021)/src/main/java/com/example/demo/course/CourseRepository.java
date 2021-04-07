package com.example.demo.course;

import com.example.demo.course.model.Course;
import com.example.demo.teacher.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

    List<Course> findAllByTeacher(Teacher teacher);

}
