package Hibernate.Hibernate;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernateTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateTestApplication.class, args);

		System.out.println("Hello World!");

		Alien chu = null;

//Inserting data into database        
//        chu.setId(1);
//        chu.setName("Jack");
//        chu.setLocation("Hyderabad");

		Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf = con.buildSessionFactory(reg);
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		/*
		//Saving Data into database
				session.save(chu);
				tx.commit();		
		//Retrieving specific data from database       
				chu = (Alien) session.get(Alien.class, 1);
				System.out.println(chu);
		*/

		
/*		
//Inserting Random data into database		
		for(int i=1;i<=50;i++)
		{
			Alien a=new Alien();
			a.setId(i);
			a.setName("Name "+i);
			a.setLocation("Location "+i);
			session.save(a);
			//tx.commit();
		}
		session.getTransaction().commit();
*/
		
/* ####### HQL QUERY (HIBERNATE QUERY LANGUAGE)  ##########
//Retrieving Details from Database		
		Query q = session.createQuery("from Alien");
		List<Alien> alien = q.list();
		for(Alien a : alien)
		{
			System.out.println(a);
		}
*/
/*	     ####### HQL QUERY (HIBERNATE QUERY LANGUAGE)  ##########
		//Retrive Specified Column from database
		Query q = session.createQuery("select id,name,location from Alien where id>41");
		List<Object[]> obj = (List<Object[]>)q.list();
		for(Object[] obj1 : obj)
			System.out.println(obj1[0]+ ":"+ obj1[1]+ ":" +obj1[2]);
*/
		
/*
//		#########  IN HQL WE ARE USING SQL WE CALLED AS NATIVE QUERY ######
		SQLQuery sq= session.createSQLQuery("Select * from Alien where id>65");
		sq.addEntity(Alien.class);
		List<Alien> alien = sq.list();
		for(Alien a : alien)
		{
			System.out.println(a);
		}
*/	
		
		
		
	}

}
