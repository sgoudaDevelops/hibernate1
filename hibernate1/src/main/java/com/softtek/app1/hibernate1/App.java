package com.softtek.app1.hibernate1;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

// import org.hibernate.Sessionfactory;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "project started" );
       // SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Configuration cfg= new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.configure();
         SessionFactory factory = cfg.buildSessionFactory();
//        System.out.println(factory);
//        factory.close();
//        System.out.println(factory.isClosed());
	                   student st = new student();
	                   st.setSid(104);
		                   st.setSname("bam");
		                   st.setCity("belagavi");
		                   System.out.println(st);
        studentAddress ad= new studentAddress();
        ad.setStreet("basavangudi");
        ad.setState("karnatak");
        ad.setOpen(true);
        ad.setCountry("india");
        ad.setAddDate(new Date());
        
        
        Session session=factory.openSession();
        Transaction tx= session.beginTransaction();
         session.save(st);
        session.save(ad);
        
        tx.commit();
        session.close();
        
        
        
    }   
}
