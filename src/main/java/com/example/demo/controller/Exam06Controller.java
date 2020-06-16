package com.example.demo.controller;

import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.Item;

/**
 * 演習6　コントローラークラス
 * @author hiroto.kitamura
 *
 */
@Controller
@RequestMapping("/ex06")
public class Exam06Controller {
	@Autowired
	private ServletContext application;
	
	@Autowired
	private HttpSession session;
	
	@RequestMapping("")
	public String index(Model model) {
		List<Item> itemList = new LinkedList<>();
		itemList.add(new Item("手帳ノート", 1000));
		itemList.add(new Item("文房具セット", 1500));
		itemList.add(new Item("ファイル", 2000));
		application.setAttribute("itemList", itemList);
		int totalPrice = 0;
		if(session.getAttribute("cart") != null) {
			@SuppressWarnings("unchecked")
			List<Item> cart = (List<Item>)session.getAttribute("cart");
			for(Item item : cart) {
				totalPrice += item.getPrice();
			}
		}
		model.addAttribute("totalPrice", totalPrice);
		return "item-and-cart";
	}
	
}
