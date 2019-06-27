package com.masivian.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MasivianApplication {

	public static void main(String[] args) {
		SpringApplication.run(MasivianApplication.class, args);
	}
//	public static void main(String[] args) {
//		ApplicationContext applicationContext = 
//				SpringApplication.run(MasivianApplication.class, args);
//		
//		for (String name : applicationContext.getBeanDefinitionNames()) {
//			System.out.println(name);
//		}
//	}

}
