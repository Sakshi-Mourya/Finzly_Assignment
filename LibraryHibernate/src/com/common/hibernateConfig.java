package com.common;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.book;


public class hibernateConfig {

	public hibernateConfig() {
		// TODO Auto-generated constructor stub
	}
	
	public static SessionFactory getSessionFactory() {

		Configuration cfg = new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		
		cfg.addAnnotatedClass(book.class);
		SessionFactory sf = cfg.buildSessionFactory();
		return sf;
	}

}
