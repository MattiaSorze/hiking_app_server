package com.hikingapp.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface HikingAppBaseRepositoryCustom<T, ID> extends JpaRepository<T, ID> {
	public T saveAndRefresh(T entity);
	public void refresh(T entity);
	public void merge(T entity);
	public void detach(T entity);
	public boolean isInEm(T entity);
	public T get(Long id);
	public void clearEntityManager();
}
