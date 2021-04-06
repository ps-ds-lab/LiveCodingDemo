package com.example.demo.course;

import com.example.demo.course.model.Course;
import com.example.demo.course.model.dto.CourseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CourseService {

    private final CourseRepository courseRepository;

    public List<CourseDTO> all() {
        return courseRepository.findAll().stream()
                .map(course ->
                        CourseDTO.builder()
                                .id(course.getId())
                                .name(course.getName())
                                .teacher(course.getTeacher().getFirstName() + " " + course.getTeacher().getLastName())
                                .build()
                ).collect(Collectors.toList());
    }

    public Course findById(Long id) {
        return courseRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("No course with id: " + id));
    }

    public Course addCourse(Course course) {
        return courseRepository.save(course);
    }
}
