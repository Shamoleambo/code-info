package com.tidz.code_info.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tidz.code_info.model.Programmer;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class AppDAOImpl implements AppDAO {

	private EntityManager entityManager;

	@Autowired
	public AppDAOImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public Programmer findProgrammerById(Long id) {
		return this.entityManager.find(Programmer.class, id);
	}

	@Override
	@Transactional
	public void save(Programmer programmer) {
		this.entityManager.persist(programmer);
	}

}
