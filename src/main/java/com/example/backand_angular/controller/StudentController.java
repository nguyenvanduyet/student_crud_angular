package com.example.backand_angular.controller;

import com.example.backand_angular.model.Student;
import com.example.backand_angular.service.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("")
    public ResponseEntity<List<Student>> showAll(){
        List<Student> students = studentService.findAll();
        return new ResponseEntity<>(students, HttpStatus.OK) ;
    }
    @PutMapping("edit/{id}")
    public ResponseEntity<Student> editStudent( @RequestBody Student student ,@PathVariable Long id){
        student.setId(id);
        return  new ResponseEntity<>(studentService.save(student),HttpStatus.OK);

    }
    @PostMapping("create")
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
        return new ResponseEntity<>(studentService.create(student),HttpStatus.OK);
    }
    @DeleteMapping("delete/{id}")
    public  ResponseEntity<Student> deleteStudent(@PathVariable Long id){
        studentService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
