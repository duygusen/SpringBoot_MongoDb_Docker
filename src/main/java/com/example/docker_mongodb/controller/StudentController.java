package com.example.docker_mongodb.controller;

import com.example.docker_mongodb.entity.Student;
import com.example.docker_mongodb.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/add")
    public Student add(@RequestBody Student student){
        return studentRepository.save(student);
    }

    @PutMapping("/update")
    public Student update (@RequestBody Student student){
        return studentRepository.save(student);
    }


    @GetMapping("/getAll")
    public List<Student> getAllStudent(){return studentRepository.findAll();}

    @GetMapping("/getById/{id}")
    public Student getStudentById(@PathVariable int id){return studentRepository.findById(id).get();}
}
