package com.example.demo.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 演習3のコントローラー.
 * @author hiroto.kitamura
 *
 */
@Controller
@RequestMapping("/ex03")
public class Exam03Controller {
	@Autowired 
	private ServletContext application;
	
	@RequestMapping("")
	public String index() {
		return "exam03";
	}
}
