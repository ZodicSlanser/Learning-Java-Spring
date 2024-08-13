package com.zodic.learn_spring_boot.O3_handling_data.jpa_hibernate.jpa.course;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJpaCmdRunner implements CommandLineRunner {

    private CourseJpaRepo courseJpaRepo;

    public CourseJpaCmdRunner(CourseJpaRepo courseJpaRepo) {
        this.courseJpaRepo = courseJpaRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("=============JPA==================");
        this.courseJpaRepo.insert(new Course(1,"Saif addin","Computer Science","saif@jpa.txt"));
        this.courseJpaRepo.insert(new Course(2,"Anas","Computer Architecture","Anas@jpa.txt"));
        this.courseJpaRepo.insert(new Course(3,"Eman","Programming","Eman@jpa.txt"));
        this.courseJpaRepo.insert(new Course(4,"Araby","Data Structures","Araby@jpa.txt"));
        System.out.println("=============JPA==================");

    }
}
