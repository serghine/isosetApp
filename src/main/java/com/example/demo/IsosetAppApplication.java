package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IsosetAppApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(IsosetAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		System.out.println(sum(5,2));
	}
	
	public int sum(int a, int b) {
		return a+ b;
	}

}
