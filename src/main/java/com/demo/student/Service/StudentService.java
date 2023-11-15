package com.demo.student.Service;

import com.demo.student.Entité.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
public List<Student> findAllStudents(){
   return List.of(
            new Student("zeineb","salhi",23, LocalDate.of(2000,01,16)),
            new Student(("nana"),"salhi",20,LocalDate.of(2003,05,31)));


}

}
