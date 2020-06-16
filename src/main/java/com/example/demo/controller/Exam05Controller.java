package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repository.MemberRepository;

/**
 * 課題5　コントローラークラス.
 * @author hiroto.kitamura
 *
 */
@Controller
@RequestMapping("/ex05")
public class Exam05Controller {
	@Autowired
	MemberRepository repository;
	
	/**
	 * トップ画面のコントローラー.
	 * @return　トップ画面のHTMLファイル名
	 */
	@RequestMapping("")
	public String index() {
		return "exam05";
	}
	
	/**
	 * 結果画面のコントローラー.
	 * @param partOfName　フォームで入力された名前
	 * @param model　リクエストスコープ
	 * @return　結果画面のHTMLファイル名
	 */
	@RequestMapping("result")
	public String result(String partOfName, Model model) {
		model.addAttribute("names", repository.findByName(partOfName));
		return "exam05-result";
	}
}
