package com.jsp.controller;

import java.util.Scanner;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;

public class SaveController {

		static Scanner scan=new Scanner(System.in);
		public static void main(String[] args) {
			Student student=new Student();
			System.out.println("Enter Student id");
			student.setId(scan.nextInt());
			System.out.println("enter the Student Age");
			student.setAge(scan.nextInt());
			System.out.println("enter the Name of the student");
			student.setName(scan.next());
			System.out.println("enter Email of the student");
			student.setEmail(scan.next());
			System.out.println("enter password of the student");
			student.setPassword(scan.next());
			
			StudentService studentService=new StudentService();
			
			if(studentService.saveStudentController(student)!=null) {
				System.out.println("data saved");
			}
			else {
				System.out.println("data not saved");
			}

	}

}
