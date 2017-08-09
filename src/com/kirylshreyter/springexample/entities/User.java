package com.kirylshreyter.springexample.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class User extends AbstractEntity {

	private static final long serialVersionUID = -206276755622837295L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;

	@Column
	public String name;

	@Column
	public int score;

	@Column
	public Date date;

}
