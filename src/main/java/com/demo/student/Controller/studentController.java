package com.demo.student.Controller;

import com.demo.student.Entité.Student;
import com.demo.student.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping("/add")
    public Student save( @RequestBody Student student){
        //(Student student is an object; spring will serialize and map this object from json to Student object, it requires @requestBody
        return service.save(student);
    }
    @GetMapping("/{email}") // to tell spring this is an HTTP operation
    public Student findByEmail(@PathVariable String email){
        return service.findByEmail(email);
    }

    @PutMapping("/update")
    public Student update(@RequestBody Student  student){
        return service.update(student);
     }

@DeleteMapping("/{email}")
     public void delete(@PathVariable("email") String email){
        service.delete(email);
     }

    @GetMapping("/students")
    public List<Student> findAllStudents(){
        return service.findAllStudents();


    }
}
