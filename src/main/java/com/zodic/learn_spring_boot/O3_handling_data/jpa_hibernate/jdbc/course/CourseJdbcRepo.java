package com.zodic.learn_spring_boot.O3_handling_data.jpa_hibernate.jdbc.course;


import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class CourseJdbcRepo {
    private JdbcTemplate jdbcTemplate;

    public CourseJdbcRepo(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private static final String CREATE_QUERY =
            """
                    CREATE TABLE jdbc_course(
                        id bigint not null,
                        name varchar(255) not null,
                        professor varchar(255) not null,
                        email varchar(255) not null,
                        primary key (id)
                    );
                                        
            """;

    private static final String INSERT_QUERY =
            """
                    insert into
                            jdbc_course (id, name, professor, email)
                            values
                            (?, ?, ?, ?);
                            
            """;

    private static final String DELETE_QUERY =
            """
            DELETE FROM jdbc_course WHERE id=?;
            """;

    private static final String SELECT_ALL_QUERY =
            """
            SELECT * FROM jdbc_course;
            """;
    private static final String SELECT_BY_ID_QUERY =
            """
            SELECT * FROM jdbc_course WHERE ID=?;
            """;
    public void create(){
        jdbcTemplate.execute(CREATE_QUERY);
    }
    public void insert(Course course){
        jdbcTemplate.update(INSERT_QUERY,
                course.getId(),course.getName(),course.getProfessor(),course.getEmail());
    }
    public void delete(int id){
        jdbcTemplate.update(DELETE_QUERY,id);
    }
    public List<Course> selectAll(){
        return jdbcTemplate.query(SELECT_ALL_QUERY,new BeanPropertyRowMapper<>(Course.class));
    }
    public Course selectById(long id){
       return jdbcTemplate.queryForObject(SELECT_BY_ID_QUERY,new BeanPropertyRowMapper<>(Course.class),id);
    }
}
