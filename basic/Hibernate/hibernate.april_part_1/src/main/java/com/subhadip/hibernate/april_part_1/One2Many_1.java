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
public class One2Many_1 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "name") 
	private String Name;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List <One2Many_2> mylist;
	
	
	
//	getters and setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public List<One2Many_2> getMylist() {
		return mylist;
	}

	public void setMylist(List<One2Many_2> mylist) {
		this.mylist = mylist;
	}

	


}
