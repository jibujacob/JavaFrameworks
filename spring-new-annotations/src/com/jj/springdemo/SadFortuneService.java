package com.jj.springdemo;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "You have a sad day ahead";
	}

}
