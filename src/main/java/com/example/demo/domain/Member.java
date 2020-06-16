package com.example.demo.domain;

/**
 * 演習5 ユーザー情報のドメインクラス.
 * 
 * @author hiroto.kitamura
 *
 */
public class Member {
	/**
	 * ユーザーid.
	 */
	private Integer id;
	/**
	 * ユーザーの名前.
	 */
	private String name;
	/**
	 * ユーザーの年齢.
	 */
	private Integer age;
	/**
	 * ユーザーの部署名.
	 */
	private Integer depId;

	/**
	 * コンストラクタ引数なし.
	 */
	public Member() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * コンストラクタ引数フル装備.
	 * 
	 * @param id
	 * @param name
	 * @param age
	 * @param depId
	 */
	public Member(Integer id, String name, Integer age, Integer depId) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.depId = depId;
	}

	/**
	 * コンストラクタ引数id以外あり.
	 * 
	 * @param name
	 * @param age
	 * @param depId
	 */
	public Member(String name, Integer age, Integer depId) {
		super();
		this.name = name;
		this.age = age;
		this.depId = depId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Integer getDepId() {
		return depId;
	}

	public void setDepId(Integer depId) {
		this.depId = depId;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", age=" + age + ", depId=" + depId + "]";
	}

}
