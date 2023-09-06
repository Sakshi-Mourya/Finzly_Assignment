package com.HBdemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class select {
	
	public static void main(String[] args) {
		

		Configuration cfg = new Configuration();
		cfg.configure();
		
		cfg.addAnnotatedClass(student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tr = session.beginTransaction();
		student st = session.load(student.class, 1);
		System.out.println(st);
		tr.commit();
		session.close();

	}
	

}
