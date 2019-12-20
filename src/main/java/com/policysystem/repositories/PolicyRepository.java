package com.policysystem.repositories;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.policysystem.entities.PolicyEntity;

public class PolicyRepository {
	private SessionFactory sessionFactory;

	public void save(PolicyEntity policy) {

		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.save(policy);
		session.getTransaction().commit();
		session.close();
	}

	public PolicyEntity getById(Long id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		PolicyEntity p = (PolicyEntity) session.get(PolicyEntity.class, id);

		session.getTransaction().commit();
		session.close();
		return p;
	}

	public PolicyEntity getByNumber(Long pnumber) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		Query query = session.createQuery("select p from PolicyEntity p where p.number =:number");
		query.setParameter("name", pnumber);

		List<PolicyEntity> policies = query.list();

		session.getTransaction().commit();
		session.close();

		return policies.get(0);
	}

	public List<PolicyEntity> getByCustomer(String customer) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("select p from PolicyEntity p where p.customer =:customer");
		query.setParameter("customer", customer);

		List<PolicyEntity> policies = query.list();

		session.getTransaction().commit();
		session.close();

		return policies;
	}

	public void update(PolicyEntity policy) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.merge(policy);
		session.getTransaction().commit();
		session.close();
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
