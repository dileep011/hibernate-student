package com.jsp.Demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class TestFindPerson {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dileep");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Person person = entityManager.find(Person.class, 102);
		if(person!=null) {
			System.out.println("person age "+person.getAge());
			System.out.println("person id "+person.getId());
			System.out.println("person name "+person.getName());
		}
		else {
			System.out.println("plz check id ");
		}
	}

}
