package com.policysystem.repositories;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.policysystem.entities.CoveredDriverEntity;

public class CoveredDriverRepository {

	private SessionFactory sessionFactory;

	public void save(CoveredDriverEntity cdriver) {

		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.save(cdriver);
		session.getTransaction().commit();
		session.close();
	}

	public CoveredDriverEntity getByPolicyId(Long policyid) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		CoveredDriverEntity cd = (CoveredDriverEntity) session.get(CoveredDriverEntity.class, policyid);

		session.getTransaction().commit();
		session.close();
		return cd;
	}

	public CoveredDriverEntity getByLicenseNum(Long licenseNum) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		CoveredDriverEntity cd = (CoveredDriverEntity) session.get(CoveredDriverEntity.class, licenseNum);

		session.getTransaction().commit();
		session.close();
		return cd;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
