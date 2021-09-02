package com.jj.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.jj.hibernate.demo.entity.Course;
import com.jj.hibernate.demo.entity.Instructor;
import com.jj.hibernate.demo.entity.InstructorDetail;
import com.jj.hibernate.demo.entity.Review;


public class GetCourseReviewDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Instructor.class)
									.addAnnotatedClass(InstructorDetail.class)
									.addAnnotatedClass(Course.class)
									.addAnnotatedClass(Review.class)
									.buildSessionFactory();
		
		Session session = factory.getCurrentSession();

		try {
			
			session.beginTransaction();
			//Course myCourse = session.get(Course.class, 12);
			
			//System.out.println(myCourse.getReview());
			Query<Course> query = session.createQuery("SELECT i FROM Course i JOIN FETCH i.reviews WHERE i.id=:theCourseID", Course.class);
			
			query.setParameter("theCourseID", 12);
			/*
			for(Course course : myInstructor.getCourses()){
				System.out.println(course.getTitle());
			}
			*/	
			Course myCourse = query.getSingleResult();
			session.getTransaction().commit();
			session.close();
			
			System.out.println(myCourse.getReviews());
			
		}finally {
			session.close();
			factory.close();
		}
	}

}
