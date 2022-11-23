package com.softtek.app1.oneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class demoOneToMany {

	public static void main(String[] args) 
	{
		Configuration cfg= new Configuration();
		cfg.configure();
		SessionFactory factory =cfg.buildSessionFactory();
		question q1= new question();
		q1.setQ_id(1);
		q1.setQuestion("what is sql");
		
		answer a1= new answer();
		a1.setA_id(11);
		a1.setAnswer("software that can talk with rdb");
		a1.setQuestion(q1);
		
		answer a2= new answer();
		a2.setA_id(12);
		a2.setAnswer("structural query languange ");
		a2.setQuestion(q1);
		
		answer a3= new answer();
		a3.setA_id(13);
		a3.setAnswer("expensive shit ");
		a3.setQuestion(q1);
		  
		List l1 = new ArrayList<answer>();
		l1.add(a1);
		l1.add(a2);
		l1.add(a3);
		
		q1.setAnswer(l1);
		
		Session session = factory.openSession();
		Transaction tx =session.beginTransaction();
				
//	      session.save(q1);
//	      session.save(a1);
//	      session.save(a2);
//	      session.save(a3);
		
		
		
		tx.commit();
		 question que =(question)session.get(question.class,1);
	     System.out.println(que.getQ_id()+que.getQuestion());
	     for(answer a:que.getAnswer())
	     {
	    	 System.out.println(a.getAnswer());
	     }
		
	     
	     
	     
		factory.close();
		

	}

}
