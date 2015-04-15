package com.stu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stu.dao.StudentDao;
import com.stu.model.Student;
import com.stu.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao sutStudentDao;

	@Override
	public Student getStudent(String id) {
		Student student = sutStudentDao.getStudent(id);
		return student;
	}

	@Override
	public List<Student> getStudentByCriteria(Student studentCriteria) {
		List<Student> studentList = sutStudentDao.getStudentByCriteria(studentCriteria);
		return studentList;
	}

	@Override
	public void insertStudent(Student student) {
		sutStudentDao.insertStudent(student);
	}

	@Override
	public void deleteStudent(Student student) {
		sutStudentDao.deleteStudent(student);
	}

	@Override
	public void updataStudent(Student student) {
		sutStudentDao.updataStudent(student);
	}

}
