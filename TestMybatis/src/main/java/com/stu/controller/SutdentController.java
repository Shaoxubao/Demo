package com.stu.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.stu.bean.Response;
import com.stu.model.Student;
import com.stu.service.StudentService;

@Controller
@RequestMapping("/student")
public class SutdentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/showUser")
    @ResponseBody
    public Response<Student> toIndex(HttpServletRequest request, HttpServletResponse response){
        Response<Student> resp = new Response<Student>();

        String id = request.getParameter("id");

        Student student = studentService.getStudent(id);

        resp.setData(student);
        resp.setRetCode(0);
        resp.setMsg("成功");
        return resp;
    }

    @RequestMapping("/get_StudentByCriteria")
    @ResponseBody
    public Response<List<Student> > get_StudentByCriteria(HttpServletRequest request,HttpServletResponse response){
        Response<List<Student> > resp = new Response<List<Student> >();

        String id = request.getParameter("id");
        String name = request.getParameter("name");
        Student student = new Student();
        if(id != null){
            student.setStudentID(id);
        }else if(name != null){
            student.setStudentName(name);
        }

        List<Student> studentList = studentService.getStudentByCriteria(student);

        resp.setData(studentList);
        resp.setRetCode(0);
        resp.setMsg("成功");
        return resp;
    }

    @RequestMapping("/insert_student")
    @ResponseBody
    public Response<Student> insert_student(HttpServletRequest request,HttpServletResponse response){
        Response<Student> resp = new Response<Student>();

        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String sex = request.getParameter("sex");
        String birth = request.getParameter("birth");

        Student student = new Student();

        student.setStudentID(id);
        student.setStudentName(name);
        student.setStudentSex(sex);
        student.setStudentBirthday(birth);

        studentService.insertStudent(student);

        resp.setData(student);
        resp.setRetCode(0);
        resp.setMsg("成功");
        return resp;
    }

    @RequestMapping("/delete_student")
    @ResponseBody
    public Response<Student> delete_student(HttpServletRequest request,HttpServletResponse response){
        Response<Student> resp = new Response<Student>();

        String id = request.getParameter("id");

        Student student = new Student();

        student.setStudentID(id);

        studentService.deleteStudent(student);

        resp.setData(student);
        resp.setRetCode(0);
        resp.setMsg("成功");
        return resp;
    }

    @RequestMapping("/updata_student")
    @ResponseBody
    public Response<Student> update_student(HttpServletRequest request,HttpServletResponse response){
        Response<Student> resp = new Response<Student>();

        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String sex = request.getParameter("sex");
        String birth = request.getParameter("birth");

        Student student = new Student();

        student.setStudentID(id);
        student.setStudentName(name);
        student.setStudentSex(sex);
        student.setStudentBirthday(birth);

        studentService.updataStudent(student);

        resp.setData(student);
        resp.setRetCode(0);
        resp.setMsg("成功");
        return resp;
    }
}
