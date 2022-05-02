package com.subhadip.hibernate.april_part_1;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Many2Many_2 {

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

	public List<Many2Many_1> getMylist1() {
		return mylist1;
	}

	public void setMylist1(List<Many2Many_1> mylist1) {
		this.mylist1 = mylist1;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "details") 
	private String Details;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List <Many2Many_1> mylist1;
	
}
