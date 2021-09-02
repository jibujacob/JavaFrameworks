package com.jj.springdemo;

import java.io.*;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FileBasedFortuneService implements FortuneService {
	
	@Value("${fortune.list}")
	private String arr[];
	
	@Value("${file.path}")
	private File file;
	
	Random r =new Random();
	
	@Override
	public String getFortune() {
		
		return arr[r.nextInt(arr.length)];
	}
	
	@PostConstruct
	public void setupFortuneList() throws IOException {
		System.out.println("Printing Fortune List from properties file");
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		String str;
		while((str=br.readLine())!=null) {
			System.out.println(str);
		}
		
		br.close();
	}

}
