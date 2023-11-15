package com.demo.student.Entité;

import java.time.LocalDate;

public class Student {
    private String first_name;
    private String last_name;
    private int age;
    private LocalDate date_birth;

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDate_birth() {
        return date_birth;
    }

    public void setDate_birth(LocalDate date_birth) {
        this.date_birth = date_birth;
    }

    public Student(String first_name, String last_name, int age, LocalDate date_birth) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.date_birth = date_birth;
    }
}
