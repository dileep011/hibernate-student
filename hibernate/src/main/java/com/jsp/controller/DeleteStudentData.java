package com.jsp.controller;

import com.jsp.service.StudentService;
import java.util.*;
public class DeleteStudentData {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter id to delete data");
		int id=scan.nextInt();
		
		StudentService studentService=new StudentService();
		if(studentService.deleteStudentData(id)!=null) {
			System.out.println("data deleted");
		}
		else {
			System.out.println("plz check the id");
		}
	}

}
