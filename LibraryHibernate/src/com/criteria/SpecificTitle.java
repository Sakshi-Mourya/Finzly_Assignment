package com.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.common.hibernateConfig;
import com.entity.book;


public class SpecificTitle {

	public static void main(String[] args) {

		SessionFactory sf = hibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		
		System.out.println("books with a specific title or containing specific keywords in the title");

		Criteria criteria = session.createCriteria(book.class);
		criteria.add(Restrictions.like("title", "jav%"));
		List<book> list = criteria.list();
		for (book emp : list) {
			System.out.println(emp);
		}
	}


}
