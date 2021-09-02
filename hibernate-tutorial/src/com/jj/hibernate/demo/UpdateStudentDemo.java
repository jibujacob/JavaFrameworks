package com.jj.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jj.hibernate.demo.entity.Student;

public class UpdateStudentDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Student.class)
									.buildSessionFactory();
		
		Session session = factory.getCurrentSession();

		try {
			
			session.beginTransaction();
			Student myStudent = session.get(Student.class,4);
			myStudent.setFirstName("Virat");
			myStudent.setLastName("Kolhi");
			
			List<Student> myUpdatedStudent = session.createQuery("from Student s where s.firstName='Virat'").getResultList();
			
			for(Student student: myUpdatedStudent) {
				System.out.println(student);
			}
			
			
			session.getTransaction().commit();
			
		}finally {
			factory.close();
		}
	}

	

}
