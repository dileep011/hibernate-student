package com.jsp.Demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import com.jsp.dto.*;
import antlr.collections.List;
import java.util.*;

public class Getall {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dileep");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Query query= entityManager.createQuery("select a from Student b");
		java.util.List<Student> list= query.getResultList();
		if(list!=null) {
			System.out.print(list);
		}
		
	
		

	}

}
