package com.subhadip.hibernate.april_part_1;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class One2Many_2 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "details") 
	private String Details;
	
	
	@ManyToOne()
	private One2Many_1 parent;
	
	
//	Getters and setters


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDetails() {
		return Details;
	}


	public void setDetails(String details) {
		Details = details;
	}


	public One2Many_1 getParent() {
		return parent;
	}


	public void setParent(One2Many_1 parent) {
		this.parent = parent;
	}
}
