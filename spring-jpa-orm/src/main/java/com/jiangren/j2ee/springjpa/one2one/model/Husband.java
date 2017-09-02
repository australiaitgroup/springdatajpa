package com.jiangren.j2ee.springjpa.one2one.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="husband")
public class Husband {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String name;

	@OneToOne(mappedBy = "husband")
	private Wife wife;

	public Husband(){}

	public Husband(String name){
		this.name = name;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return this.id;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}

	public void setWife(Wife wife){
		this.wife = wife;
	}

	public Wife getWife(){
		return this.wife;
	}

	public String toString(){
		String info = String.format("Husband: name = %s has a wife with name = %s", this.name, this.wife.getName());
		return info;
	}
}
