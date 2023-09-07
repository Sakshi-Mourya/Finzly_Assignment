package com.operation;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Restrictions;
import com.common.hibernateConfig;
import com.entity.employee;

public class client7 {
	
	public static void main(String[] args) {

		SessionFactory sf = hibernateConfig.getSessionFactory();
		Session session = sf.openSession();

		Query query = session.createQuery("from Employee");
		List<employee> e = query.list();
		
		for (employee emp : e) {
			System.out.println(emp);
		}
	}
}
