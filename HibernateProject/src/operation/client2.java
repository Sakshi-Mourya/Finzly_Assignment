package com.operation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.common.hibernateConfig;
import com.entity.employee;

public class client2 {

	public static void main(String[] args) {

		SessionFactory sf = hibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		employee e = new employee();
		e.setId(3);
		e.setName("riya");
		e.setSalary("30000");
		e.setProfile("test");
		 session.save(e);
		 tr.commit();
		System.out.println("Data gaya table me");
	}

}
