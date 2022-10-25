package com.jpa;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.SQLQuery;
import org.hibernate.query.Query;

import com.jpa.entity.Alien;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();

/* ##### Inserting Data to Database ###########
		Alien a = new Alien();
      
		a.setId(54);
		a.setName("Kajol");
		a.setLocation("Mumbai");
	
		em.getTransaction().begin();
		em.persist(a);
		em.getTransaction().commit();
		System.out.println(a);
		
// ##### Retrieving Data from Database ###########	
		a=em.find(Alien.class, 54);
		System.out.println(a);
*/
/* ##### Inserting Random Data to Database ###########

		em.getTransaction().begin();
		for(int i=55;i<=100;i++)
		{
			Alien an=new Alien();
			an.setId(i);
			an.setName("Name "+i);
			an.setLocation("Location "+i);
			em.persist(an);
		}
		em.getTransaction().commit();
*/	
/*
 //#########  IN HQL WE ARE USING SQL WE CALLED AS NATIVE QUERY ######
 // ######### Retrieving All Data from Database ##########
		Query q = (Query) em.createQuery("from Alien");
		List<Alien> alien = q.list();
		for(Alien a : alien)
		{
			System.out.println(a);
		}
*/
		
    }
}
