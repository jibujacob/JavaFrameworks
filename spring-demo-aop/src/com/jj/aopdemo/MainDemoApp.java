package com.jj.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jj.aopdemo.dao.AccountDAO;
import com.jj.aopdemo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		AccountDAO accountDAO = context.getBean("accountDAO",AccountDAO.class);
		accountDAO.addAccount(new Account());
		accountDAO.doSilly();
		
		MembershipDAO membershipDAO = context.getBean("membershipDAO",MembershipDAO.class);
		membershipDAO.addAccount();
		membershipDAO.doSilly();
		
		context.close();
		
	}

};
