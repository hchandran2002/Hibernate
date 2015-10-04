package com.test.hibernate.annotation;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.persistence.entity.annotate.CountriesAnnotate;

public class TestHibernateAnnotation {

	private static SessionFactory factory;

	public static void main(String[] args) {

		try {
			factory = new AnnotationConfiguration().configure().
					// addPackage("com.xyz") //add package if used.
					addAnnotatedClass(CountriesAnnotate.class).buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex);
		}

		Session session = factory.openSession();

		try {

			List employees = session.createQuery("FROM CountriesAnnotate").list();
			for (Iterator iterator = employees.iterator(); iterator.hasNext();) {
				CountriesAnnotate country = (CountriesAnnotate) iterator.next();
				System.out.print("CountryId: " + country.getCountryId());
				System.out.print("  CountryName: " + country.getCountryName());
				System.out.println("  RegionId: " + country.getRegionId());
			}

		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

}
