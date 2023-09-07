package com.operation;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.common.hibernateConfig;
import com.entity.employee;

public class client3 {

	public static void main(String[] args) {

		SessionFactory sf = hibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(employee.class);
		List<employee> list = criteria.list();
		for (employee emp : list) {
			System.out.println(emp);
		}
	}

}
