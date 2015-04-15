package com.stu.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.stu.model.Student;


@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  
public class TestStudentService {

	@Autowired
	private StudentService studentService;
	
	
	@Test
	public void testName() throws Exception {
		Student stu = studentService.getStudent("1");
		System.out.println(stu);
	}
	
	@Test
	public void testNameOrID() throws Exception{
		
		Student stu = new Student();
		stu.setStudentName("小明");
		stu.setStudentSex("男");
		List<Student> list = studentService.getStudentByCriteria(stu);
		for (Student student : list) {
            System.out.println(student);
        }
	}
}
