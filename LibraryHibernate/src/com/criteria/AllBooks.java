package com.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.common.hibernateConfig;
import com.entity.book;


public class AllBooks {

	public static void main(String[] args) {

		SessionFactory sf = hibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		
		System.out.println("All books currently available in the library");
		Criteria criteria = session.createCriteria(book.class);
		List<book> list = criteria.list();
		for (book emp : list) {
			System.out.println(emp);
		}
		
	}


}
