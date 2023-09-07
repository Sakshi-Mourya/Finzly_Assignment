package com.operation;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.common.hibernateConfig;
import com.entity.employee;

public class read {

	public static void main(String[] args) {

		SessionFactory sf = hibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		
		// - List all employees in the organization
		Criteria criteria = session.createCriteria(employee.class);
		List<employee> list = criteria.list();
		for (employee emp : list) {
			System.out.println(emp);
		}
		
		//Retrieve employee details by their ID.
		employee e1 = session.load(employee.class, 1);
		System.out.println(e1);
	}

}
