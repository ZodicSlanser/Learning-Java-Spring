package com.zodic.learn_spring_boot.O3_handling_data.jpa_hibernate.spring_data_jpa.course;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseSpringDataRunner implements CommandLineRunner {

    private CourseSpringDataRepo courseSpringDataRepo;

    public CourseSpringDataRunner(CourseSpringDataRepo courseSpringDataRepo  ) {
        this.courseSpringDataRepo = courseSpringDataRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("=============Spring Data==================");
        this.courseSpringDataRepo.save(new Course(1L, "Saif addin", "Computer Science", "saif@springdata.txt"));
        this.courseSpringDataRepo.save(new Course(2L, "Anas", "Computer Architecture", "Anas@springdata.txt"));
        this.courseSpringDataRepo.save(new Course(3L, "Eman", "Programming", "Eman@springdata.txt"));
        this.courseSpringDataRepo.save(new Course(4L, "Araby", "Data Structures", "Araby@springdata.txt"));

        this.courseSpringDataRepo.deleteById(4L);
        System.out.println(this.courseSpringDataRepo.findById(2L));
        var allRows = this.courseSpringDataRepo.findAll();
        allRows.forEach(System.out::println);
        courseSpringDataRepo.findCoursesByProfessor("Eman").forEach(System.out::println);

        System.out.println("=============Spring Data==================");

    }
}
