package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Scope;

@SpringBootApplication

public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(DependencyInjectionApplication.class, args);
		Student s= ctx.getBean(Student.class);
		s.print1();
		Student s1= ctx.getBean(Student.class);
		s1.print1();
	};

}
