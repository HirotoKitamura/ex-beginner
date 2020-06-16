package com.example.demo.form;

import javax.validation.constraints.NotBlank;

/**
 * ユーザーフォームクラス
 * @author hiroto.kitamura
 *
 */
public class UserForm {
	/**
	 * ユーザーの名前.
	 */
	@NotBlank(message = "名前を入力してください")
	private String name;
	/**
	 * ユーザーの年齢.
	 */
	@NotBlank(message = "年齢を入力してください")
	private String age;
	/**
	 * ユーザーのコメント.
	 */
	@NotBlank(message = "コメントを入力してください")
	private String comment;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
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
		return "UserForm [name=" + name + ", age=" + age + ", comment=" + comment + "]";
	}
	
	
}
