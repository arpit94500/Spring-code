package com.example.demo;

import org.springframework.stereotype.Component;

@Component("teach")
public class Teachers {
	private String name;
	private String subject;
	public Teachers() {
		super();
		System.out.println("I am Teacher");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Teachers [name=" + name + ", subject=" + subject + "]";
	}
}
