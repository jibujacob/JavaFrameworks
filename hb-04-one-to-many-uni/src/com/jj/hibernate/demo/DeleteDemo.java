package com.jj.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jj.hibernate.demo.entity.Instructor;
import com.jj.hibernate.demo.entity.InstructorDetail;


public class DeleteDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Instructor.class)
									.addAnnotatedClass(InstructorDetail.class)
									.buildSessionFactory();
		
		Session session = factory.getCurrentSession();

		try {
			session.beginTransaction();
			
			InstructorDetail myInstructorDetail = session.get(InstructorDetail.class, 1);
			
			if (myInstructorDetail != null) {
				
				session.delete(myInstructorDetail);
	
			}
			session.getTransaction().commit();
			
			
		}finally {
			factory.close();
		}
	}

}
