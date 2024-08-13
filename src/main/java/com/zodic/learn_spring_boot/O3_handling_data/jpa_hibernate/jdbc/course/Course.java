package com.zodic.learn_spring_boot.O3_handling_data.jpa_hibernate.jpa.course;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity(name = "JPA_Course")
public class Course {

    @Id
   private long id;

    @Column
   private  String name;

    @Column
   private String professor;
    @Column
   private  String email;

   public Course(){};

    public Course(long id, String professor, String name, String email) {
        this.id = id;
        this.name = name;
        this.professor = professor;
        this.email = email;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getProfessor() {
        return professor;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", professor='" + professor + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}