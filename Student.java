package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Pradeepa");
	}
	public void studentDept() {
		System.out.println("B.sc");
	}
	public void studentId() {
		System.out.println("12037");
	}
	public static void main(String[] args) {
		Student std = new Student();
		std.collegeName();
		std.collegeCode();
		std.collegeRank();
		std.deptName();
		std.studentName();
		std.studentDept();
		std.studentId();
	}
}
