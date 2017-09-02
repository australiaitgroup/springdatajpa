package com.jiangren.j2ee.springjpa.one2one.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="wife")
public class Wife {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String name;


	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "husband_id")
	private Husband husband;

	public Wife(){}

	public Wife(String name){
		this.name = name;
	}

	public Wife(String name, Husband husband){
		this.name = name;
		this.husband = husband;
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

	public void setHusband(Husband husband){
		this.husband = husband;
	}

	public Husband getHusband(){
		return this.husband;
	}

	public String toString(){
		String info = String.format("Wife: name = %s has a husband with name = %s", this.name, this.husband.getName());
		return info;
	}
}
