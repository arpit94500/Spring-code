package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Student {
	public Student() {
		super();
		System.out.println("I am Object");
	}
	private int id;
	private int name;
	@Autowired
	@Qualifier("teach")
	Teachers t;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	public void print1() {
		System.out.println(t.toString());
		System.out.println("I am Printing");
	}
}
