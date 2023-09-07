package com.operation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.common.hibernateConfig;
import com.entity.employee;

public class insert {

	public static void main(String[] args) {

		SessionFactory sf = hibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		
		Transaction tr = session.beginTransaction();
		
		employee e = new employee();
		e.setEmpid(4);
		e.setFirstname("priya");
		e.setLastname("sahu");
		e.setDob("7/06/01");
		e.setEmail("priya212@gmail.com");
		e.setDepartment("developer");
		e.setSalary("68000");
		
		 session.save(e);
		 tr.commit();
		System.out.println("Data save successfully...");
	}

}
