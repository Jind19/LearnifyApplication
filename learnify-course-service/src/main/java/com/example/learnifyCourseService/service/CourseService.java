package com.example.learnifyCourseService.service;


import com.example.learnifyCourseService.dto.CourseDto;
import com.example.learnifyCourseService.mapper.CourseMapper;
import com.example.learnifyCourseService.model.Course;
import com.example.learnifyCourseService.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseService {

    private final CourseRepository courseRepository;


    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public Course addCourse(CourseDto request) {
        Course course = CourseMapper.toEntity(request);
        return courseRepository.save(course);
    }
}
