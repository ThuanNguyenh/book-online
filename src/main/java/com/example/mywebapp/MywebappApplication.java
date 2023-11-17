package com.example.mywebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
//@EnableTransactionManagement
//@EntityScan(basePackages = "com.example.mywebapp.entity")
public class MywebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MywebappApplication.class, args);
	}

}
