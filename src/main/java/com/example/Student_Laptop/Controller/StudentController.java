package com.example.Student_Laptop.Controller;

import com.example.Student_Laptop.Repositories.StudentRepository;
import com.example.Student_Laptop.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;
    @RequestMapping("/getStudent")
    public Optional<Student> getStudent(){
        Optional<Student> student = studentRepository.findById(1l);
        return student;

    }
}
