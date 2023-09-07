package com.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import com.common.hibernateConfig;
import com.entity.employee;

public class Salary {

	public static void main(String[] args) {

		SessionFactory sf = hibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		
		Criteria criteria = session.createCriteria(employee.class);
		criteria.add(Restrictions.gt("salary", "30000"));
		List<employee> list = criteria.list();
		for (employee emp : list) {
			System.out.println(emp);
		}
	}

}
