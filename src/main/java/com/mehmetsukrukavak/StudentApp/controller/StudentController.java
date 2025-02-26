package com.mehmetsukrukavak.StudentApp.controller;


import com.mehmetsukrukavak.StudentApp.StudentService;
import com.mehmetsukrukavak.StudentApp.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/getStudents")
    public List<Student> getStudents(){
        return studentService.getAllStudents();
        
    }
}
