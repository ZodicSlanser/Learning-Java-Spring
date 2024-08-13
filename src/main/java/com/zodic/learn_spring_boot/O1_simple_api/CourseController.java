package com.zodic.learn_spring_boot.simple_api;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

// path => GET /courses
// return Course: id, name, professor
@RestController
public class CourseController {
    CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @RequestMapping("/courses")
    public List<Course> getAll(){
       return courseService.getAll();
    }
}
