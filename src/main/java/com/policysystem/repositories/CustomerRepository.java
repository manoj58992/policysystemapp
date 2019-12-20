package com.policysystem.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.policysystem.entities.CustomerEntity;

@Repository
@Transactional
public class CustomerRepository {

	private EntityManager entityManager;

	public void save(CustomerEntity customerEntity) {
		entityManager.persist(customerEntity);
	}

	public CustomerEntity findById(Long id) {
		return entityManager.find(CustomerEntity.class, id);
	}

	public List<CustomerEntity> findByName(String name) {
		Query query = entityManager.createQuery("select c from CustomerEntity c where c.name= :name");
		query.setParameter("name", name);
		return query.getResultList();
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}
