package com.demo.student.Controller;

import com.demo.student.Entité.Student;
import com.demo.student.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("controller")

public class studentController {
     //private StudentService service= new StudentService(); // creation d'une instance de studentservice on la remplace par:
    private StudentService service; //field injection


    public studentController(StudentService service) { //constructor injection without @autowired
        this.service = service;
    }

    @GetMapping("/students")
    public List<Student> findAllStudents(){
        return service.findAllStudents();


    }
}
