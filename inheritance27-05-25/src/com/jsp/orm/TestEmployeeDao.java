package com.jsp.orm;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestEmployeeDao {
public static void main(String[] args) {
	Configuration configuration = new Configuration();
	configuration.configure("hibernate_api.cfg.xml");//user define name for configuration file



	SessionFactory factory = configuration.buildSessionFactory();
	Session session = factory.openSession();
	Transaction transaction = session.beginTransaction();
	transaction.begin();
	
	Scanner scan=new Scanner(System.in);
Hourly_employee hourly=new Hourly_employee();//transient state
System.out.println("inserting data into  a hourly based employee");
System.out.println("enter Employee name");
hourly.setEname(scan.next());
System.out.println("enter Employee hourly rate");
hourly.setHourly_rate(scan.nextDouble());
System.out.println("Enter employee maximum hours days");
hourly.setNo_of_hours_perDay(scan.nextInt());
	session.save(hourly);//persistance state
	
	Salaried_employee semp=new Salaried_employee();//transient state
	System.out.println("inserting data into  a annual basedemployee");
	System.out.println("enter Employee name");
	semp.setEname(scan.next());
	System.out.println("enter Employee Annual salary");
	semp.setAnnual_Salary(scan.nextDouble());
	
		session.save(semp);//persistance state
	transaction.commit();
	session.close();
}
}
