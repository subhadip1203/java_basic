package com.subhadip.hibernate.april_part_1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Emb1 {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int student_id;
	
	
	@Column()
	private String embProp;

	private SubPart subpart;

	public int getStudent_id() {
		return student_id;
	}


	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}


	public String getEmbProp() {
		return embProp;
	}


	public void setEmbProp(String embProp) {
		this.embProp = embProp;
	}


	public SubPart getSubpart() {
		return subpart;
	}


	public void setSubpart(SubPart subpart) {
		this.subpart = subpart;
	}
	
	
}
