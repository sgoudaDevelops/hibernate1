package com.softtek.app1.hibernate1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class readDemo {

	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session= factory.openSession();
		student std  = (student)session.get(student.class,101);
		student std1 = (student)session.load(student.class,101);
		System.out.println(std1);
		System.out.println(std.getSid()+std.getSname()+std.getCity()+std.getCerti());
		
		session.close();
       factory.close();
}
}
