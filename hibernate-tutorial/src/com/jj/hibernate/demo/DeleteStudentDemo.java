package com.jj.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jj.hibernate.demo.entity.Student;

public class DeleteStudentDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Student.class)
									.buildSessionFactory();
		
		Session session = factory.getCurrentSession();

		try {
			
			session.beginTransaction();
			Student myStudent = session.get(Student.class,7);
			session.delete(myStudent);
			//session.getTransaction().commit();

			//session = factory.getCurrentSession();
			//session.beginTransaction();
			session.createQuery("delete from Student s where s.id=8").executeUpdate();
			session.getTransaction().commit();

			
			
			
		}finally {
			factory.close();
		}
	}

	

}
