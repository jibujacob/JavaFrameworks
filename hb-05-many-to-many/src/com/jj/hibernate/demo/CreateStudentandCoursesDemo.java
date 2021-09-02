package com.jj.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.jj.hibernate.demo.entity.Course;
import com.jj.hibernate.demo.entity.Instructor;
import com.jj.hibernate.demo.entity.InstructorDetail;
import com.jj.hibernate.demo.entity.Review;
import com.jj.hibernate.demo.entity.Student;


public class CreateStudentandCoursesDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Instructor.class)
									.addAnnotatedClass(InstructorDetail.class)
									.addAnnotatedClass(Course.class)
									.addAnnotatedClass(Review.class)
									.addAnnotatedClass(Student.class)
									.buildSessionFactory();
		
		Session session = factory.getCurrentSession();

		try {
			
			session.beginTransaction();
			Student myStudent = session.get(Student.class, 1);

			Course myCourse1 = session.get(Course.class, 11);
			Course myCourse2 = session.get(Course.class, 12);
			Course myCourse3 = session.get(Course.class, 13);
			
			myCourse1.addStudent(myStudent);
			myCourse2.addStudent(myStudent);
			myCourse3.addStudent(myStudent);
			
			session.save(myCourse1);
			session.save(myCourse2);
			session.save(myCourse3);
			
			
			
			//System.out.println(myCourse.getReview());
			
			session.getTransaction().commit();

			
		}finally {
			session.close();
			factory.close();
		}
	}

}
