package com.example.demo.teacher.model.dto;

import com.example.demo.course.model.Course;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class TeacherDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private List<Course> courses;
}
