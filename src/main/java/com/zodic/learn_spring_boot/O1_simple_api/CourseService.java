package com.zodic.learn_spring_boot.simple_api;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
   public List<Course> getAll(){
       return List.of(
               new Course[]{
                       new Course(1, "Computer Science", "Saif Addin"),
                       new Course(2,"Computer Architecture","Anas"),
                       new Course(3,"Programming","Eman"),
                       new Course(3,"Programming","Eman!"),

               });
   }
}
