package com.stu.service;

import java.util.List;

import com.stu.model.Student;

public interface StudentService {
	public void insertStudent(Student student);
	public void deleteStudent(Student student);
	public void updataStudent(Student student);
	public Student getStudent(String id);
	public List<Student> getStudentByCriteria(Student studentCriteria);
}
