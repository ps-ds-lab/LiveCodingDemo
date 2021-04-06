package com.example.demo.course;

import com.example.demo.course.model.dto.CourseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/courses")
@RequiredArgsConstructor
public class CourseController {

    private final CourseService courseService;

    @GetMapping(value = "/all")
    public List<CourseDTO> allCourses() {
        return courseService.all();
    }

}
