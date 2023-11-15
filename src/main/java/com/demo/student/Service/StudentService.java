package com.demo.student.Service;

import com.demo.student.Entité.Student;

 import java.util.List;


public interface StudentService {
List<Student> findAllStudents();
Student save( Student s); // une methode save de type de retour Student s
 Student findByEmail(String email); //trouver student k taadilou commme parametre string email
 Student update(Student s);
 void delete(String email);



}
