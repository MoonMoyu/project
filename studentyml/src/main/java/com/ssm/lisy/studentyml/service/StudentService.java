package com.ssm.lisy.studentyml.service;

import com.ssm.lisy.studentyml.pojo.Student;

import java.util.List;

public interface StudentService {
    List<Student> SelectStudentList();
    void deleteStudent(int id);
    void addStudent(Student student);
    Student getStudentById(int id);
    void updateStudent(Student student);
}
