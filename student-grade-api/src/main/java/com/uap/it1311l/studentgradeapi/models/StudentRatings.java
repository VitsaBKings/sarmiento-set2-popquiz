package com.uap.popquiz.studentgradesapi.model;

public class StudentRatings {
	String subjectcode = ""; 
	String name = "";
	int grade = 0;
	String studentid = "";
	
	public String getSubjectCode() {
		return subjectcode;
	}
	public void setSubjectCode(String subjectcode) {
		this.subjectcode = subjectcode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getStudentID() {
		return studentid;
	}
	public void setStudentID(String studentid) {
		this.studentid = studentid;
	}
}
