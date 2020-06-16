package com.example.demo.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 演習3のコントローラー.
 * 
 * @author hiroto.kitamura
 *
 */
@Controller
@RequestMapping("/ex03")
public class Exam03Controller {
	@Autowired
	private ServletContext application;

	/**
	 * トップ画面のコントローラー.
	 * 
	 * @return
	 */
	@RequestMapping("")
	public String index() {
		return "exam03";
	}

	/**
	 * 結果画面のコントローラー.
	 * 
	 * @param num1 入力された価格
	 * @param num2 入力された価格
	 * @param num3 入力された価格
	 * @return
	 */
	@RequestMapping("result")
	public String result(int num1, int num2, int num3) {
		application.setAttribute("price", num1 + num2 + num3);
		application.setAttribute("pricewithtax", (int) (num1 + num2 + num3) * 1.1);
		return "exam03-result";
	}
}
