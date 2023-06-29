package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Student;


public class StudentDao {


	public Student insertStudent(Student student) {
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("dileep");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(student);
		Student student1=entityManager.find(Student.class, student.getId());
		entityTransaction.commit();
		return student1;

	}
	public Student UpdateStudent(Student student) {
		EntityManagerFactory  entityManagerFactory= Persistence.createEntityManagerFactory("dileep");
		EntityManager entityManager =entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();

		Student student1=entityManager.find(Student.class, student);
		if(student1!=null) {
			entityTransaction.begin();
			entityManager.merge(student);
			entityTransaction.commit();
		}
		return student1;
	}


	public Student getStudentDataById(int id) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dileep");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Student student1 = entityManager.find(Student.class, id);
		return student1;
	}
	
	public Student deleteStudentData(int i) {
		EntityManagerFactory  entityManagerFactory= Persistence.createEntityManagerFactory("dileep");
		EntityManager entityManager =entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Student student= entityManager.find(Student.class, i);
		if(student !=null){
			entityTransaction.begin();
			entityManager.remove(student);
			entityTransaction.commit();
		}
		return student;
		

	}
	public List getData() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dileep");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query= entityManager.createQuery("select a from Student a");
		List<Student> list= query.getResultList();
		return list;
	}
	public Student saveStudent(Student student) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dileep");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		if(student!=null) {
			entityTransaction.begin();
			entityManager.persist(student);
			entityTransaction.commit();   
		}
		return student;


	}
}
