package com.softtek.app1.hibernate1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class embedDemo {
	
	
public static void main(String[] args) {
	Configuration cfg = new Configuration();
	cfg.configure();
	SessionFactory factory= cfg.buildSessionFactory();
	Session session = factory.openSession();
	certificate certi= new certificate("python","2 months");
	student std= new student(101,"eshwar","hubli",certi);
	
	Transaction tx = session.beginTransaction();
	
	session.save(std);
	
	tx.commit();
	
	session.close();
	factory.close();
	
}
	
	
}
