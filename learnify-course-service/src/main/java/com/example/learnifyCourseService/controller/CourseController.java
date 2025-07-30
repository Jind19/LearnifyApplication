package com.example.learnifyCourseService.controller;

import com.example.learnifyCourseService.dto.CourseDto;
import com.example.learnifyCourseService.model.Course;
import com.example.learnifyCourseService.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
@RequiredArgsConstructor
public class CourseController {

    private final CourseService courseService;

    @GetMapping
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    @PostMapping
    public Course createCourse(@RequestBody CourseDto request) {
        return courseService.addCourse(request);
    }
}
