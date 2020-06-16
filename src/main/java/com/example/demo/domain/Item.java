package com.example.demo.domain;

/**
 * 演習6　商品のドメインクラス.
 * 
 * @author hiroto.kitamura
 *
 */
public class Item {
	/**
	 * 商品名.
	 */
	private String name;
	/**
	 * 商品価格.
	 */
	private Integer price;

	/**
	 * コンストラクタ引数なし.
	 */
	public Item() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * コンストラクタ引数あり.
	 * 
	 * @param name
	 * @param price
	 */
	public Item(String name, Integer price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + "]";
	}

}
