package com.jsp.controller;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;

import java.util.*;
public class GetStudentDataByIdController {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter id");
		int id=scan.nextInt();
		
		StudentService studentService=new StudentService();
		
		Student student1=studentService.getStudentDataService(id);
		if(student1!=null) {
			System.out.println(student1);
		}
		else {
			System.out.println("incorrect id");
		}

	}

}
