package com.jj.springlearning;

import java.util.Random;

public class PracticeFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		String[] arr = {"Today is you lucky day!!","Stay out of trouble","Let's see how it goes"};
		Random r = new Random();
		return arr[r.nextInt(3)];
	}

}
