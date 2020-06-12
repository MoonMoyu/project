package com.ssm.lisy.studentyml.controller;

import com.ssm.lisy.studentyml.pojo.Student;
import com.ssm.lisy.studentyml.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;
    @RequestMapping("/SelectStudentList")
    public String SelectStudentList(Model model){
        List<Student> studentList = studentService.SelectStudentList();
        model.addAttribute("studentList",studentList);
        return "select_list.html";
    }
    @RequestMapping("/addStudent")
    public String addStudent(Student student){
        studentService.addStudent(student);
        return "redirect:SelectStudentList";
    }
    @RequestMapping("/deleteStudent")
    public String deleteStudent(int id){
        studentService.deleteStudent(id);
        return "redirect:SelectStudentList";
    }
    @RequestMapping("/getStudentById")
    public String getStudentById(int id,Model model){
        Student student = studentService.getStudentById(id);
        model.addAttribute("student",student);
        return "update.html";
    }
    @RequestMapping("/updateStudent")
    public  String updateStudent(Student student){
        studentService.updateStudent(student);
        return "redirect:SelectStudentList";
    }
}
