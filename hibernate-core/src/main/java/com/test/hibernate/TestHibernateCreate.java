package com.test.hibernate;

import org.hibernate.Session;

import com.persistence.entity.Countries;
import com.persistence.util.HibernateUtil;

public class TestHibernateCreate {

	public static void main(String[] args) {

		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();

		Countries country = new Countries();
		country.setCountryId("TA");
		country.setCountryName("TestCountryTA");
		country.setRegionId(Integer.valueOf(1));
		session.save(country);

		session.getTransaction().commit();

		System.out.println("Great! Country was saved");

	}

}
