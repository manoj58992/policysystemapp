package com.policysystem.repositories;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.policysystem.entities.AddressEntity;

public class AddressRepository {

	private SessionFactory sessionFactory;

	public void save(AddressEntity address) {

		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.save(address);
		session.getTransaction().commit();
		session.close();
	}

	public AddressEntity getByCity(String city) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		AddressEntity ae = (AddressEntity) session.get(AddressEntity.class, city);

		session.getTransaction().commit();
		session.close();

		return ae;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
