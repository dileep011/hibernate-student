package com.jsp.service;

import java.util.List;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class StudentService {
	StudentDao studentDao=new StudentDao();
	
	public Student InsertDataIntoStudentService(Student student) {
		return studentDao.insertStudent(student);
	}
	public Student UpdateStudentService(Student student) {
		return studentDao.UpdateStudent(student);
	}
	public Student getStudentDataService(int i) {
		return studentDao.getStudentDataById(i);
		
	}
	public Student deleteStudentData(int i) {
		return studentDao.deleteStudentData(i);
	}
	public List getDataService() {
		return studentDao.getData();
	}
	public Student saveStudentController(Student student) {
		return studentDao.saveStudent(student);
	}
	
		
}
