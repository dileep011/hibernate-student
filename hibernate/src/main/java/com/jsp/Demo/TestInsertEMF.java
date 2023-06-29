package com.jsp.Demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestInsertEMF {

	public static void main(String[] args) {
		Person person=new Person();
		person.setAge(26);
		person.setId(102);
		person.setName("max");
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dileep");
		System.out.println(entityManagerFactory);
		EntityManager entityManager =entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
		
	}

}
