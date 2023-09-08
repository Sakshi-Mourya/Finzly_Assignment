package com.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.common.hibernateConfig;
import com.entity.book;

public class SpecificISBN {

	public static void main(String[] args) {

		SessionFactory sf = hibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		
		System.out.println("Books with a specific ISBN number");

		Criteria criteria = session.createCriteria(book.class);
		criteria.add(Restrictions.like("ISBN", "87-476"));
		List<book> list = criteria.list();
		for (book emp : list) {
			System.out.println(emp);
		}
	}


}
