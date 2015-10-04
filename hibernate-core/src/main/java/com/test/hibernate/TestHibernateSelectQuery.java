package com.test.hibernate;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import com.persistence.entity.Countries;
import com.persistence.util.HibernateUtil;

public class TestHibernateSelectQuery {

	public static void main(String[] args) {

		System.out.println("Processing...");

		TestHibernateSelectQuery obj = new TestHibernateSelectQuery();
		obj.getCountry("AR");

		System.out.println("Success! Performed Select on the table.");

	}

	public void getCountry(String countryId) {

		Session session = HibernateUtil.getSessionFactory().openSession();

		try {

			Query query = session.createQuery("from Countries where countryId = :id");
			

			query.setParameter("id", countryId);

			List<?> list = query.list();

			Countries countryOutput = (Countries) list.get(0);

			System.out.println(countryOutput);

		} catch (HibernateException e) {
			e.printStackTrace();

		} finally {
			session.close();
		}

	}

}

