package com.zodic.learn_spring_boot.O3_handling_data.jpa_hibernate.spring_data_jpa.course;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface CourseSpringDataRepo extends JpaRepository<Course,Long> {
    List<Course> findByProfessor(String professor);
    List<Course> findCoursesByEmailAndId(String email,long id);
    List<Course> findCoursesByProfessor(String professor);
}
