package com.jj.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.jj.hibernate.demo.entity.Course;
import com.jj.hibernate.demo.entity.Instructor;
import com.jj.hibernate.demo.entity.InstructorDetail;


public class FetchJoinDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Instructor.class)
									.addAnnotatedClass(InstructorDetail.class)
									.addAnnotatedClass(Course.class)
									.buildSessionFactory();
		
		Session session = factory.getCurrentSession();

		try {
			
			session.beginTransaction();
			
			Query<Instructor> query = session.createQuery("SELECT i FROM Instructor i " +
														"JOIN FETCH i.courses "+
														"WHERE i.id = :theInstructorId ", Instructor.class);
			
			query.setParameter("theInstructorId", 1);
			
			Instructor myInstructor = query.getSingleResult();
			session.getTransaction().commit();
			session.close();
			
			System.out.println(myInstructor.getCourses());
			/*
			for(Course course : myInstructor.getCourses()){
				System.out.println(course.getTitle());
			}
			*/	
			
			
			
		}finally {
			session.close();
			factory.close();
		}
	}

}
