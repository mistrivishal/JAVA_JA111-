package com.masaiEvaluation;

public class Student {
	private int rollNumber;
	private String studentName;
	private int marks;
	
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Student(int rollNumber, String studentName, int marks) {
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.marks = marks;
	}
	public Student() {

	}
	public void getData() {
		System.out.println("Student Detail 01");
		System.out.println("Student Roll Number: " + this.rollNumber);
		System.out.println("Student Name: " + this.studentName);
		System.out.println("Student Mark: " + this.marks);
	}
}