package com.demo.student;
import com.demo.student.Entité.Student;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

//(it's a bean)
@Repository //this class is dealing with data fetching creating

public class InMemoryStudentDAO {

    private final List<Student> STUDENTS = new ArrayList();

    public List<Student> findAllStudents() {
        return STUDENTS;
    }

    public Student save(Student s) {
                STUDENTS.add(s); //ajout dans la liste
        return s;
    }

    public Student findByEmail(String email) {
        return STUDENTS.stream()
                .filter(s-> email.equals(s.getEmail()))
                .findFirst() //find first occurence of the student
                .orElse(null);
    }

    public Student update(Student s) {
        var studentIndex = IntStream.range(0, STUDENTS.size())//ytalla3lk les index mtaa les students lkoll lkoll wehed bch nfiltri
                .filter(index -> STUDENTS.get(index).getEmail().equals(s.getEmail()))
                .findFirst()
                .orElse(-1);
        if (studentIndex > -1) {
            STUDENTS.set(studentIndex, s);
        }
        return s;

    }


    public void delete(String email) {
        var student = findByEmail(email);
        if (student!= null){
            STUDENTS.remove(student);
        }

    }

    }

