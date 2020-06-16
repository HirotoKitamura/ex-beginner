package com.example.demo.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.User;
import com.example.demo.form.UserForm;

/**
 * 演習4 コントローラー.
 * 
 * @author hiroto.kitamura
 *
 */
@Controller
@RequestMapping("/ex04")
public class Exam04Controller {

	/**
	 * 入力値チェック用.
	 * 
	 * @return ユーザーフォーム
	 */
	@ModelAttribute
	public UserForm setUpForm() {
		return new UserForm();
	}

	/**
	 * トップ画面のコントローラー.
	 * 
	 * @return トップ画面のHTMLファイル名
	 */
	@RequestMapping("")
	public String index() {
		return "exam04";
	}

	/**
	 * 結果画面のコントローラー.
	 * @param userForm フォームで受け取ったユーザーデータ
	 * @param result　入力値チェック用
	 * @param model	リクエストスコープ
	 * @return　結果画面のHTMLファイル名
	 */
	@RequestMapping("result")
	public String result(@Validated UserForm userForm, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return index();
		} else {
			User user = new User();
			BeanUtils.copyProperties(userForm, user);
			user.setAge(Integer.parseInt(userForm.getAge()));
			model.addAttribute("user", user);
			return "exam04-result";
		}

	}
}
