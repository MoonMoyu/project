package com.ssm.lisy.studentyml.dao;

import com.ssm.lisy.studentyml.pojo.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface StudentMapper {
    List<Student> SelectStudentList();
    void deleteStudent(int id);
    void addStudent(Student student);
    Student getStudentById(int id);
    void updateStudent(Student student);
}