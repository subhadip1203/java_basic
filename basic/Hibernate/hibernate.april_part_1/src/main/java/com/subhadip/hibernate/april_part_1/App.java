package com.subhadip.hibernate.april_part_1;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
  public static void main(String[] args) {

	  SessionFactory factory = new Configuration().configure().buildSessionFactory();
	  factory.openSession();
	  factory.getCurrentSession();
	  
	  
	  Song mySong = new Song();
	  mySong.setSong_id(1);
	  mySong.setSong_name("a song");
	  mySong.setSinger("subahdip");
	  System.out.println(mySong);
	  
    
  }
}
