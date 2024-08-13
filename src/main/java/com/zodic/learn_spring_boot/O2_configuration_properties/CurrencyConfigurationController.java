package com.zodic.learn_spring_boot.O2_configuration_properties;


import com.zodic.learn_spring_boot.O1_simple_api.Course;
import com.zodic.learn_spring_boot.O1_simple_api.CourseService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class CurrencyController {
    CourseService courseService;

    public CurrencyController(CourseService courseService) {
        this.courseService = courseService;
    }

    @RequestMapping("/courses")
    public List<Course> getAll(){
       return courseService.getAll();
    }
}
