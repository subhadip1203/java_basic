package com.subhadip.hibernate.april_part_1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="song_table")
public class Song {

	@Id
	private int song_id;
	private String song_name;
	private String singer;
	
	
	public int getSong_id() {
		return song_id;
	}


	public void setSong_id(int song_id) {
		this.song_id = song_id;
	}


	public String getSong_name() {
		return song_name;
	}


	public void setSong_name(String song_name) {
		this.song_name = song_name;
	}


	public String getSinger() {
		return singer;
	}


	public void setSinger(String singer) {
		this.singer = singer;
	}
	
	
	@Override
	public String toString() {
		return this.song_id+" - "+this.song_name+" - "+this.singer;
	}
	
	
	

}
