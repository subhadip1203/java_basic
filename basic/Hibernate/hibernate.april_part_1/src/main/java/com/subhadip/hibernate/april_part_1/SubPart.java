package com.subhadip.hibernate.april_part_1;

import javax.persistence.Embeddable;

@Embeddable
public class SubPart {
	
	private String part1;
	private int part2;
	
	
	public String getPart1() {
		return part1;
	}
	public void setPart1(String part1) {
		this.part1 = part1;
	}
	public int getPart2() {
		return part2;
	}
	public void setPart2(int part2) {
		this.part2 = part2;
	}
}
