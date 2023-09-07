package com.common;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.employee;

public final class hibernateConfig {

	private hibernateConfig() {
	}

	public static SessionFactory getSessionFactory() {

		Configuration cfg = new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		
		cfg.addAnnotatedClass(employee.class);
		SessionFactory sf = cfg.buildSessionFactory();
		return sf;
	}

}
