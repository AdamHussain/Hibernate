package com.adam.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TEstmain {
 public static void main(String[] args) {
	
	Configuration configuration=new Configuration();
	 configuration.addResource("emp.hbm.xml");
	 configuration.configure("hiebrnate.cfg.xml");
	   SessionFactory factory=configuration.buildSessionFactory();
	   Session session=factory.openSession();
	   Transaction transaction=session.beginTransaction();
	   transaction.begin();
	   
	   
	   Employee e1=new Employee();
	   e1.setName("Adam");
	   session.save(e1);
	   transaction.commit();
	   session.close();


	   
	 
}
}
