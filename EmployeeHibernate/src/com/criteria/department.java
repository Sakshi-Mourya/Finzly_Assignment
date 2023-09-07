package com.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;

import com.common.hibernateConfig;
import com.entity.employee;

public class department {

	public static void main(String[] args) {

		SessionFactory sf = hibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		
		Criteria criteria = session.createCriteria(employee.class);
		
		Criterion c1 = Restrictions.like("department", "developer");
		Criterion c2 = Restrictions.like("department", "tester");
		
		LogicalExpression andExp = Restrictions.and(c1, c2);
		criteria.add( andExp );
		System.out.println(1);
		
		//List results = criteria.list();
		
		List<employee> list = criteria.list();
		for (employee emp : list) {
			System.out.println(emp);
		}
	}

}
