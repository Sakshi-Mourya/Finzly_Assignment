package com.criteria;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.common.hibernateConfig;
import com.entity.book;

public class DeleteBook {

	public static void main(String[] args) {

		SessionFactory sf = hibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		
		Transaction tr = session.beginTransaction();
		
		book b = new book();
		b.setId(3);
		b.setTitle("query");
		b.setAuthor("yash");
		b.setPubyear("1989");
		b.setISBN("6776");
		
		session.delete(b);
		tr.commit();
		System.out.println("Data deleted successfully...");
	}


}
