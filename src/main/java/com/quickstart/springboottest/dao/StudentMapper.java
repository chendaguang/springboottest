package com.quickstart.springboottest.dao;

import com.quickstart.springboottest.domain.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {
    public List<Student> getStudents();
}
