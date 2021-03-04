package com.quickstart.springboottest.controller;

import com.quickstart.springboottest.dao.StudentMapper;
import com.quickstart.springboottest.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
* 1.根据ID查询对象
* 2.根据id删除对象
* 3.根据属性修改对象
* 4.根据属性新增对象
* */

@RestController
public class MyController {

    @Autowired
    private StudentMapper studentMapper;

    @RequestMapping("start")
    public List<Student> start(){
        return studentMapper.getStudents();
    }

}
