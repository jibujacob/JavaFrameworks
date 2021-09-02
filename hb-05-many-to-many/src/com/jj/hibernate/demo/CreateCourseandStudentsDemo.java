package com.jj.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.jj.hibernate.demo.entity.Course;
import com.jj.hibernate.demo.entity.Instructor;
import com.jj.hibernate.demo.entity.InstructorDetail;
import com.jj.hibernate.demo.entity.Review;
import com.jj.hibernate.demo.entity.Student;


public class CreateCourseandStudentsDemo {

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
			Course myCourse = session.get(Course.class, 10);
			
			Student student1 = new Student("Ann","Ben","annben@gmail.com");
			Student student2 = new Student("Tammanah","Bhatia","Tammu@gmail.com");
			
			myCourse.addStudent(student2);
			myCourse.addStudent(student1);

			session.save(student1);
			session.save(student2);
			
			
			
			
			//System.out.println(myCourse.getReview());
			
			session.getTransaction().commit();

			
		}finally {
			session.close();
			factory.close();
		}
	}

}
