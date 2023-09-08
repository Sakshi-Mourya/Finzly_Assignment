package com.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.common.hibernateConfig;
import com.entity.book;

public class RangeYear {

	public static void main(String[] args) {

		SessionFactory sf = hibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		
		Criteria criteria = session.createCriteria(book.class);
		criteria.add(Restrictions.between("pubyear", "2000","3000"));
		List<book> list = criteria.list();
		for (book emp : list) {
			System.out.println(emp);
		}
	
		System.out.println(" Books published within a certain range of years...");
	}

}
