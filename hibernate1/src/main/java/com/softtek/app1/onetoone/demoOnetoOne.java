package com.softtek.app1.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class demoOnetoOne {

	public static void main(String[] args) 
	{
	   Configuration cfg= new Configuration();
	   cfg.configure();
	   SessionFactory factory= cfg.buildSessionFactory();
	   
	   question q1= new question();
	   q1.setQid(1);
	   q1.setQuestion("what is java");
	   answer a1= new answer();
	   a1.setAid(11);
	   a1.setAnswer("java is pl");
	   a1.setQuestion(q1);
	   q1.setAnswer(a1);
	   
	   
	   Session s1= factory.openSession();
	   Transaction tx= s1.beginTransaction();
	   s1.save(q1);
	   s1.save(a1);
	   
	   
	   tx.commit();
   question que=(question)s1.get(question.class, 1);
   answer ane =(answer)s1.get(answer.class, 11);
   System.out.println(que.getQid()+" "+que.getQuestion()+" "+que.getAnswer().getAid()+" "+que.getAnswer().getAnswer()+" ");
   System.out.println(ane.getAid()+" "+ane.getAnswer()+" "+ane.getQuestion().getQid()+" "+ane.getQuestion().getQuestion());
	   
	   
	   s1.close();
	   factory.close();

	   
	}

}
