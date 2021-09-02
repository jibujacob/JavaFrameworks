package com.jj.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jj.hibernate.demo.entity.Course;
import com.jj.hibernate.demo.entity.Instructor;
import com.jj.hibernate.demo.entity.InstructorDetail;


public class CreateInstructorDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Instructor.class)
									.addAnnotatedClass(InstructorDetail.class)
									.addAnnotatedClass(Course.class)
									.buildSessionFactory();
		
		Session session = factory.getCurrentSession();

		try {
			
			Instructor instructor = new Instructor("Jibu","Jacob","jpj@gmail.com");
			InstructorDetail instructorDetail = new InstructorDetail("JPJLive","Intro To Coding");
			
			instructorDetail.setInstructor(instructor);
			
			session.beginTransaction();
			session.save(instructorDetail);

			session.getTransaction().commit();
			
		}finally {
			session.close();
			factory.close();
		}
	}

}
