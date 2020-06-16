package com.example.demo.domain;

public class User {
	private String name;
	private Integer age;
	private String comment;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String name, Integer age, String comment) {
		super();
		this.name = name;
		this.age = age;
		this.comment = comment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", comment=" + comment + "]";
	}

}
