package com.example.demo.course.model.dto;

import com.example.demo.course.model.Course;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class CourseDTO {
    private Long id;
    private String name;
    private String teacherName;

    public static CourseDTO fromEntity(Course course) {
        return CourseDTO.builder()
                .id(course.getId())
                .name(course.getName())
                .teacherName(course.getTeacher().getFullName())
                .build();
    }
}
