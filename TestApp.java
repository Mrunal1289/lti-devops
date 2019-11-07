package com.lti;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestApp {
	  public static void main( String[] args )
	    {
	        EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA-PU");
	        
	        EntityManager em=emf.createEntityManager();
	        Student s1=new Student();
	        s1.setSid(120);
	        s1.setName("abc");
	        
	        em.getTransaction().begin();
	        em.persist(s1);
	        em.getTransaction().commit();
	        em.close();
	        
	    }

}
