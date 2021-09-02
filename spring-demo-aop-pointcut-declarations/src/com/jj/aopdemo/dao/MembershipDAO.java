package com.jj.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
	
	public void addAccount() {
		System.out.println(getClass() + ":Doing my DB Work Adding a Membership");
	}
	
	public boolean doSilly() {
		System.out.println(getClass() + ":Doing my DB Work silly work om membership ");
		return false;
	}
	
}
