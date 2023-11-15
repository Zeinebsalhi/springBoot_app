package com.demo.student;

import com.demo.student.Entité.Student;
import com.demo.student.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
// to tell spring it is a bean
public class InMemoryStudentService implements StudentService {
    //cette classe a implementé l'interface StudentService et a redefinit la methode findAllStudents

    private final InMemoryStudentDAO dao;

    public InMemoryStudentService(InMemoryStudentDAO dao) {
        this.dao = dao;
    }

    @Override
    public List<Student> findAllStudents() {
        return dao.findAllStudents();
    }

    @Override
    public Student save(Student s) {
        return dao.save(s);
    }

    @Override
    public Student findByEmail(String email) {
        return dao.findByEmail(email);
    }

    @Override
    public Student update(Student s) {
        return dao.update(s);
    }

    @Override
    public void delete(String email) {
        dao.delete(email);

    }
}
