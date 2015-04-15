package com.stu.dao;

import java.util.List;

import com.stu.model.Student;

public interface StudentDao {
	public void insertStudent(Student student);
	public void deleteStudent(Student student);
	public void updataStudent(Student student);
	public Student getStudent(String studentID);
	public List<Student> getStudentByCriteria(Student student);
}
