package com.kirylshreyter.springexample.services;

import java.util.List;

import com.kirylshreyter.springexample.entities.AbstractEntity;

public interface AbstractEntityService<T extends AbstractEntity> {

	T find(int id);

	T save(T entity);

	List<T> findAll();

	void delete(T entity);

}
