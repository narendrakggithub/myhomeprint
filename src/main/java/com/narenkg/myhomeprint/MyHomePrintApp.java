package com.narenkg.myhomeprint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = )
public class MyHomePrintApp {
	public static void main(String[] args) {
		SpringApplication.run(MyHomePrintApp.class, args);
	}

}
