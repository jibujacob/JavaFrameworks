package com.jj.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jj.hibernate.demo.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Student.class)
									.buildSessionFactory();
		
		Session session = factory.getCurrentSession();

		try {
			
			session.beginTransaction();
			List<Student> myStudents = session.createQuery("from Student").getResultList();
			
			
			extractStudents(myStudents);
			
			myStudents = session.createQuery("from Student s where s.lastName='Jacob'").getResultList();
			
			extractStudents(myStudents);
			
			myStudents = session.createQuery("from Student s where s.lastName='Mathews' OR firstName='Jibu'").getResultList();
			
			extractStudents(myStudents);
			
			session.getTransaction().commit();
			
		}finally {
			factory.close();
		}
	}

	private static void extractStudents(List<Student> myStudents) {
		for(Student myStudent:myStudents) {
			System.out.println(myStudent);
		}
	}

}
