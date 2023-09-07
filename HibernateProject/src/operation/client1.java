package com.operation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.common.hibernateConfig;
import com.entity.employee;

public class client1 {

	public static void main(String[] args) {

		SessionFactory sf = hibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		employee e1 = session.load(employee.class, 1);
		System.out.println(e1);
	}

}
