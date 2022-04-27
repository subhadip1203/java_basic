package com.subhadip.hibernate.april_part_1;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class OnetoOne_1 {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "name") 
	private String Name;

	

	@Column(name = "roll") 
	private int Roll;

	@OneToOne(cascade = CascadeType.ALL)
	private OnetoOne_2 part2;

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

	public int getRoll() {
		return Roll;
	}

	public void setRoll(int roll) {
		Roll = roll;
	}

	public OnetoOne_2 getPart2() {
		return part2;
	}

	public void setPart2(OnetoOne_2 part2) {
		this.part2 = part2;
	}

	
}
