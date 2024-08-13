package com.zodic.learn_spring_boot.O3_handling_data.jpa_hibernate.jdbc.course;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class CourseJdbcCmdRunner implements CommandLineRunner {
    private CourseJdbcRepo courseJdbcRepo;

    public CourseJdbcCmdRunner(CourseJdbcRepo courseJdbcRepo) {
        this.courseJdbcRepo = courseJdbcRepo;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("=============JDBC==================");
        this.courseJdbcRepo.insert(new Course(1,"Saif addin","Computer Science","saif@jdbc.txt"));
        this.courseJdbcRepo.insert(new Course(2,"Anas","Computer Architecture","Anas@jdbc.txt"));
        this.courseJdbcRepo.insert(new Course(3,"Eman","Programming","Eman@jdbc.txt"));
        this.courseJdbcRepo.insert(new Course(4,"Araby","Data Structures","Araby@jdbc.txt"));
        this.courseJdbcRepo.delete(4);
        System.out.println(this.courseJdbcRepo.selectById(2));
        var allRows = this.courseJdbcRepo.selectAll();
        allRows.forEach(row->{
            row.forEach((k,v)->{
                System.out.println(k+" : "+v);
            });
            System.out.println("************");
        });
        System.out.println("=============JDBC==================");

    }
}
