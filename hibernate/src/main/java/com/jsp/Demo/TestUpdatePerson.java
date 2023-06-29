package com.jsp.Demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUpdatePerson {
	public static void main(String[] args) {
		Person person =new Person();
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dileep");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =entityManager.getTransaction();
		
	}
}
