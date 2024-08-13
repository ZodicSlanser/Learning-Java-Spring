package com.zodic.learn_spring_boot.O1_simple_api;


public class Course {
    private int id;
    private String name, professorName;

    public Course(int id, String name, String professorName) {
        super();
        this.id = id;
        this.name = name;
        this.professorName = professorName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }
}
