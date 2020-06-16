package com.example.demo.domain;

/**
 * ユーザー情報のドメインクラス.
 * @author hiroto.kitamura
 *
 */
public class User {
	/**
	 * ユーザーの名前.
	 */
	private String name;
	/**
	 * ユーザーの年齢.
	 */
	private Integer age;
	/**
	 * ユーザーのコメント.
	 */
	private String comment;

	/**
	 * コンストラクタ引数なし.
	 */
	public User() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * コンストラクタ引数あり.
	 * @param name
	 * @param age
	 * @param comment
	 */
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
