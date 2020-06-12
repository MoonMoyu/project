package com.ssm.lisy.studentyml.service.impl;

import com.ssm.lisy.studentyml.dao.StudentMapper;
import com.ssm.lisy.studentyml.pojo.Student;
import com.ssm.lisy.studentyml.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper studentMapper;
    @Override
    public List<Student> SelectStudentList() {
        return studentMapper.SelectStudentList();
    }
    @Override
    public void deleteStudent(int id) {
        studentMapper.deleteStudent(id);
    }
    @Override
    public void addStudent(Student student) {
        studentMapper.addStudent(student);
    }
    @Override
    public Student getStudentById(int id) {
        return studentMapper.getStudentById(id);
    }
    @Override
    public void updateStudent(Student student) {
        studentMapper.updateStudent(student);
    }
}
