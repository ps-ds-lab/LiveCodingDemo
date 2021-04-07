package com.example.demo.course;

import com.example.demo.course.model.dto.CourseDTO;
import com.example.demo.teacher.TeacherRepository;
import com.example.demo.teacher.model.Teacher;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
@RequiredArgsConstructor
public class CourseService {

    private final CourseRepository courseRepository;
    private final TeacherRepository teacherRepository;

    public List<CourseDTO> findAll() {
        return courseRepository.findAll().stream()
                .map(CourseDTO::fromEntity)
                .collect(toList());
    }

    public List<CourseDTO> findAllWithTeacher(Long teacherId) {
        Teacher teacher = teacherRepository.findById(teacherId).get();
        return courseRepository.findAllByTeacher(teacher).stream()
                .map(CourseDTO::fromEntity)
                .collect(toList());
    }
}
