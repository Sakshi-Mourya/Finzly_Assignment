package com.criteria;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.common.hibernateConfig;
import com.entity.book;

public class Addbook {

	public static void main(String[] args) {

		SessionFactory sf = hibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		
		Transaction tr = session.beginTransaction();
		
		book b = new book();
		b.setId(4);
		b.setTitle("XYZ");
		b.setAuthor("NAME");
		b.setPubyear("26/01/89");
		b.setISBN("87-476");
		
		session.save(b);
		tr.commit();
		System.out.println("Data save successfully...");
	}

}
