package com.HBdemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Insert {

	public static void main(String[] args) {
			
			Configuration cfg = new Configuration();
			cfg.configure();
			
			cfg.addAnnotatedClass(student.class);
			SessionFactory sf = cfg.buildSessionFactory();
			Session session = sf.openSession();
			
			Transaction tr = session.beginTransaction();
			student st = new student();
			
			st.setId(3);
			st.setName("priya");
			st.setAge(13);
			session.save(st);
			
			System.out.println("Data saved successfuly");
			tr.commit();
			session.close();
		}


}
