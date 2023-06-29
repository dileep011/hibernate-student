package com.jsp.controller;
import java.util.*;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;
public class UpdateStudentController {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		Student student=new Student();
		System.out.println("Student id to update the name");
		student.setId(scan.nextInt());
		System.out.println("enter the Name to modify");
		student.setName(scan.next());
		System.out.println("enter age of the student");
		student.setAge(scan.nextInt());
		System.out.println("enter the email of the student");
		student.setEmail(scan.next());
		System.out.println("enter the password of the student");
		student.setPassword(scan.next());
		
		
		StudentService studentService=new StudentService();
		
		if(studentService.UpdateStudentService(student)!=null) {
			System.out.println("data is updated");
		}
		else {
			System.out.println("plz check the data ");
		}

	}

}
