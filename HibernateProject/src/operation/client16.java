package com.operation;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import com.common.hibernateConfig;
import com.entity.employee;

public class client16 {

	public static void main(String[] args) {

		SessionFactory sf = hibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(employee.class);
		criteria.setProjection(Projections.sum("salary"));

		
		List<employee> e = criteria.list();

		System.out.println(e);
	}

}
