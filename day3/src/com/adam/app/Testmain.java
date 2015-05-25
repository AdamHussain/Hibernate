package com.adam.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Testmain {
public static void main(String[] args) {
	
	
	Configuration configuration=new Configuration();
//configuration.addResource("user.hbm.xml");//mapping file
configuration.configure();//by default hibernate.cfg.xml ,configuration file

SessionFactory  factory=configuration.buildSessionFactory();

Session session=factory.openSession();
Transaction transaction=session.beginTransaction();
transaction.begin();

/*User user=new User();
user.setName("adam");


session.save(user);*/
User u=(User) session.load(User.class, 2);
System.out.println(u.getId());
System.out.println("===============================");
User u1=(User) session.get(User.class, 2);
System.out.println(u.getId());
transaction.commit();
session.close();



}
}
