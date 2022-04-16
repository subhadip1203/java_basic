package com.subhadip.hibernate.april_part_1;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class App {
  public static void main(String[] args) {
	  
//	  Create 
	  Configuration configuration = new Configuration();
	  configuration.configure("hibernate.cfg.xml");
	  
//	  Create session factory
	  
//	  Create session 
	  Session session = null;
	  
	  Song mySong = new Song();
	  mySong.setSong_id(1);
	  mySong.setSong_name("a song");
	  mySong.setSinger("subahdip");
    
  }
}
