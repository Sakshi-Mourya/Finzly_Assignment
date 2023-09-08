package com.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.common.hibernateConfig;
import com.entity.book;

public class SpecificAuthor {

	public static void main(String[] args) {

		SessionFactory sf = hibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		
		System.out.println("Books written by a specific author");

		Criteria criteria = session.createCriteria(book.class);
		criteria.add(Restrictions.gt("author", "NAME"));
		List<book> list = criteria.list();
		for (book emp : list) {
			System.out.println(emp);
		}
		
	}


}
