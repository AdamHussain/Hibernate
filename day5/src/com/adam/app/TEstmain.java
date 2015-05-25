package com.adam.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TEstmain {
public static void main(String[] args) {
	Configuration configuration=new Configuration();
	configuration.configure();
	SessionFactory  factory=configuration.buildSessionFactory();

	Session session=factory.openSession();
	Transaction transaction=session.beginTransaction();
	transaction.begin();

	Person person=new Person();
	person.setPname("aaa");
	person.setPaddress("zzzz");


	session.save(person);
	
	transaction.commit();
	session.close();


	
	
	
}
}
