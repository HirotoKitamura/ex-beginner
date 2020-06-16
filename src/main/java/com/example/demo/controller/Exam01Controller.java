package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 演習1のコントローラー.
 * @author hiroto.kitamura
 *
 */
@Controller
@RequestMapping("/ex01")
public class Exam01Controller {
	/**
	 * トップ画面のコントローラー.
	 * @return
	 */
	@RequestMapping("")
	public String index() {
		return "exam01";
	}
	
	/**
	 * 結果画面のコントローラー.
	 * @param name フォームから受け取った名前
	 * @param model
	 * @return
	 */
	@RequestMapping("result")
	public String result(String name, Model model) {
		model.addAttribute("name", name);
		return "exam01-result";
	}
}
