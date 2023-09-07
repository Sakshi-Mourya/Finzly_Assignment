package com.operation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.common.hibernateConfig;
import com.entity.employee;

public class update {

	public static void main(String[] args) {

		SessionFactory sf = hibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		
		Transaction tr = session.beginTransaction(); 
		
		employee e = new employee();
		e.setEmpid(3);
		e.setFirstname("riya");
		e.setLastname("rao");
		e.setDob("12/02/02");
		e.setEmail("riya12@gmail.com");
		e.setDepartment("Hr");
		e.setSalary("34000");
		
		session.update(e);
		System.out.println("Data updated successfuly");
		tr.commit();
		session.close();
	}
}
