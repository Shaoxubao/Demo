package com.stu.model;

import java.io.Serializable;

public class Student implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String studentBirthday;
	private String studentID;
	private String studentName;
	private String studentSex;

	public String getStudentBirthday() {
		return studentBirthday;
	}

	public void setStudentBirthday(String studentBirthday) {
		this.studentBirthday = studentBirthday;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentSex() {
		return studentSex;
	}

	public void setStudentSex(String studentSex) {
		this.studentSex = studentSex;
	}

}
