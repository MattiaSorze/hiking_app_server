package com.hikingapp.persistence.repository;

import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;

public class HikingAppBaseRepositoryImpl<T,ID> extends SimpleJpaRepository<T, ID> implements HikingAppBaseRepositoryCustom<T,ID>{
	
	private EntityManager entityManager;
	private JpaEntityInformation entityInformation;
	
	public HikingAppBaseRepositoryImpl(JpaEntityInformation entityInformation, EntityManager entityManager) {
	    super(entityInformation, entityManager);
	    this.entityManager = entityManager;
	    this.entityInformation = entityInformation;
	}

	@Override
	@Transactional
	public T saveAndRefresh(T entity) {
		entity = saveAndFlush(entity);
		refresh(entity);
		return entity;
	}
	
	@Override
	@Transactional
	public void refresh(T entity) {
		if (!entityManager.contains(entity)) {
			entityManager.merge(entity);
		}
		entityManager.refresh(entity);
	}
	
	@Override
	@Transactional
	public void merge(T entity) {
		entityManager.merge(entity);
	}
	
	@Override
	@Transactional
	public void detach(T entity) {		
		if (!entityManager.contains(entity)) {
			entityManager.merge(entity);
		}		
		this.entityManager.detach(entity);
	}

	@Override
	@Transactional
	public boolean isInEm(T entity) {		
		return entityManager.contains(entity);
	}

	@Override
	public T get(Long id) {
		return (T) entityManager.find(getDomainClass(), id);
	}
	
	@Override
	public void clearEntityManager() {
		entityManager.clear();
	}
}
