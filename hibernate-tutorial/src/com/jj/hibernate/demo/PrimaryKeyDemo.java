package com.jj.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jj.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();
		
		try {
			
			Student student1 =new Student("Jeenu","Jacob","jaj@gmail.com");
			Student student2 =new Student("Jibu","Jacob","jpj@gmail.com");
			Student student3 =new Student("Sijin","Mathews","sm@gmail.com");
			
			session.beginTransaction();
			session.save(student1);
			session.save(student2);
			session.save(student3);
			session.getTransaction().commit();
			
		}finally {
			factory.close();
		}

	}

}
