package com.policysystem.repositories;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.policysystem.entities.CoveredVehicleEntity;

public class CoveredVehicleRepository {

	private SessionFactory sessionFactory;

	public void save(CoveredVehicleEntity cvehicle) {

		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.save(cvehicle);
		session.getTransaction().commit();
		session.close();
	}

	public CoveredVehicleEntity getByPolicyId(Long policyid) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		CoveredVehicleEntity cd = (CoveredVehicleEntity) session.get(CoveredVehicleEntity.class, policyid);

		session.getTransaction().commit();
		session.close();
		return cd;
	}

	public CoveredVehicleEntity getByVin(Long vin) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		CoveredVehicleEntity cd = (CoveredVehicleEntity) session.get(CoveredVehicleEntity.class, vin);

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
