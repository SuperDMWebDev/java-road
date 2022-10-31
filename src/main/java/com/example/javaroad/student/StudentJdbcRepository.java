package com.example.javaroad.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class StudentJdbcRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    //mapper all student to this class
    static class StudentRowMapper implements RowMapper<Student> {
        @Override
        public Student mapRow(ResultSet rs,int rowNum) throws SQLException {
            Student student = new Student();
            student.setId(rs.getLong(("id")));
            student.setName(rs.getString("name"));
            student.setPassportNumber(rs.getString("passport_number"));
            return student;
        }
    }

    //get all student
    public List<Student> findAll()
    {
        return jdbcTemplate.query("select * from student", new StudentRowMapper());
    }

    public Student findById(Long id)
    {
        System.out.println("find user by id" + id);
        return jdbcTemplate.queryForObject("select * from student where id=?",new BeanPropertyRowMapper<>(Student.class),id);
    }
    public void deleteById(Long id)
    {
        jdbcTemplate.update("delete from student where id=?",id);
    }
    public int insert(Student student)
    {
        return jdbcTemplate.update("insert into student (id,name,passport_number) "+ "values(?,?,?)",student.getId(),student.getName(),student.getPassportNumber());
    }
    public int update(Student student)
    {
        return jdbcTemplate.update("update student" + " set name=?" + ", passport_number = ?"+ " where id = ?",
                student.getName(),student.getPassportNumber(),student.getId());
    }
}
