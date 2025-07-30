package com.example.learnifyCourseService.mapper;

import com.example.learnifyCourseService.dto.CourseDto;
import com.example.learnifyCourseService.model.Course;

public class CourseMapper {

    public static Course toEntity(CourseDto request) {
        Course course = new Course();
        course.setTitle(request.getTitle());
        course.setDescription(request.getDescription());
        return course;
    }

    //toDto
}
