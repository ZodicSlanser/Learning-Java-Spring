package com.zodic.learn_spring_boot.O1_simple_api;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        System.out.println("GERE");
       return courseService.getAll();
    }
}
