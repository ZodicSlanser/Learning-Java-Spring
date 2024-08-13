package com.zodic.learn_spring_boot.O3_handling_data.jpa_hibernate.jpa.course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class CourseJpaRepo {

    @PersistenceContext
    private EntityManager manager;

    public void insert(Course course){
        manager.merge(course);
    }


    public void delete(int id) {
        this.manager.remove(selectById(id));
    }

    public Course selectById(int id) {
        return this.manager.find(Course.class,id);
    }


    public List<Course> selectAll() {
        //get all courses
        return this.manager.createQuery("SELECT c FROM JPA_Course c", Course.class).getResultList();
    }
}
