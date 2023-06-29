package com.jsp.controller;

import java.util.List;
import com.jsp.service.StudentService;

public class GetaDataFromStudent {

	public static void main(String[] args) {
		StudentService studentService=new StudentService();
		List list=studentService.getDataService();
		for(Object l:list) {
			System.out.println(l);
		}

	}

}
