package com.subhadip.hibernate.april_part_1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
  public static void main(String[] args) {

	  SessionFactory factory = new Configuration().configure().buildSessionFactory();
//	  factory.openSession();
//	  factory.getCurrentSession();
//	  Song mySong = new Song();
//	  mySong.setSong_id(1);
//	  mySong.setSong_name("a song");
//	  mySong.setSinger("subahdip");
//	  System.out.println(mySong);
	  
//	  Student student1 = new Student();
//	  student1.setAddress("my address 4");
//	  student1.setDateCreated(new Date());
	  
	  Session session = factory.openSession();
	  Transaction tx = null;
	  
//	  try {
//		  	tx = session.beginTransaction();
//		  	session.save(student1);
//		  	tx.commit();
//	  }
//	  catch (Exception e) {
//		    if (tx!=null) tx.rollback();
//		     throw e;
//	  }
//	  finally {
//		  session.close();
//	  }
	
//	  try {
//		  Student sd1 =  (Student)session.load(Student.class , 2);
//		  System.out.println(sd1.getAddress());
//		  
//		  
//		  Student sd2 =  (Student)session.get(Student.class , 3);
//		  System.out.println(sd2.getAddress());
//	  }
//	  catch (Exception e) {
//		  throw e;
//	  }
//	  finally {
//		  session.close();
//	  }
	  
//	  try {
//		  
//		  	SubPart subpart = new SubPart();
//		  	subpart.setPart2(10);
//		  	subpart.setPart1("subpart");
//		  	
//		  	
//		  	Emb1 emb = new Emb1();
//		  	emb.setEmbProp("something");
//		  	emb.setSubpart(subpart);
//		  
//		  	tx = session.beginTransaction();
//		  	session.save(emb);
//		  	tx.commit();
//	  }
//	  catch (Exception e) {
//		    if (tx!=null) tx.rollback();
//		     throw e;
//	  }
//	  finally {
//		  session.close();
//	  }
	  
	  

//	  try {
//		  	OnetoOne_2 part2 = new OnetoOne_2();
//		  	part2.setDetails("subhadip details");
//		  
//		  	OnetoOne_1 part1 = new OnetoOne_1();
//		  	part1.setName("subhadip");
//		  	part1.setRoll(10);
//		  	part1.setPart2(part2);
//		  	
//		  	
//		  	tx = session.beginTransaction();
//		  	session.save(part1);
//		  	tx.commit();
//	  }
//	  catch (Exception e) {
//		    if (tx!=null) tx.rollback();
//		     throw e;
//	  }
//	  finally {
//		  session.close();
//	  }
	  
	  try {
		  	One2Many_2 child1 = new One2Many_2();
		  	child1.setDetails("Details 1");
		  	
		  	
		  	One2Many_2 child2 = new One2Many_2();
		  	child2.setDetails("Details 2");
		  	
		  	
		  	List<One2Many_2> list = new ArrayList<One2Many_2>();
		  	list.add(child1);
		  	list.add(child2);
		  	
		  	
		  	One2Many_1 parent = new One2Many_1();
		  	parent.setName("partent");
		  	parent.setMylist(list);
		  	
		  	
		  	
		  	
		  	tx = session.beginTransaction();
		  	session.save(parent);
		  	tx.commit();
	  }
	  catch (Exception e) {
		    if (tx!=null) tx.rollback();
		     throw e;
	  }
	  finally {
		  session.close();
	  }
	  
	  
    
  }
}
