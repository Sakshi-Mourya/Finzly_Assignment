package com.HBdemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class update {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		
		cfg.addAnnotatedClass(student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction(); 
		
		student st = new student();
		st.setId(2);
		st.setName("kiran");
		st.setAge(34);
		
		session.update(st);
		System.out.println("Data updated successfuly");
		tr.commit();
		session.close();

	}

}
