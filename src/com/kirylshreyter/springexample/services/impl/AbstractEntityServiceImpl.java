package com.kirylshreyter.springexample.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import com.kirylshreyter.springexample.entities.AbstractEntity;
import com.kirylshreyter.springexample.services.AbstractEntityService;

public class AbstractEntityServiceImpl<T extends AbstractEntity> implements AbstractEntityService<T> {

	@Autowired
	private JpaRepository<T, Integer> repository;

	@Override
	public T find(int id) {
		return repository.findOne(id);
	}

	@Override
	public T save(T entity) {
		return repository.save(entity);
	}

	@Override
	public List<T> findAll() {
		return repository.findAll();
	}

	@Override
	public void delete(T entity) {
		repository.delete(entity);
	}

}
