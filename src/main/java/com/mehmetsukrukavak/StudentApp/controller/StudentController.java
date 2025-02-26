package com.mehmetsukrukavak.StudentApp.controller;


import com.mehmetsukrukavak.StudentApp.model.Student;
import com.mehmetsukrukavak.StudentApp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/Student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/getStudents")
    public List<Student> getStudents() {
        return studentService.getAllStudents();

    }

    @GetMapping("/getStudentById/{id}")
    public Student getStudents(@PathVariable int id) {
        return studentService.getStudentById(id);

    }

    @PostMapping("/addStudent")
    public ResponseEntity<String> addStudent(@RequestBody Student student) {

        studentService.addStudent(student);

        return new ResponseEntity<String>("Başarılı Ekleme", HttpStatus.OK);
    }

    @PutMapping("/updateStudent")
    public ResponseEntity<String> updateStudent(@RequestBody Student student) {

        studentService.updateStudent(student);

        return new ResponseEntity<String>("Başarılı Güncelleme", HttpStatus.OK);
    }

    @DeleteMapping("/deleteStudent")
    public ResponseEntity<String> deleteStudent(@RequestBody Student student) {

        studentService.deleteStudent(student);

        return new ResponseEntity<String>("Başarılı Silme", HttpStatus.OK);
    }
}
