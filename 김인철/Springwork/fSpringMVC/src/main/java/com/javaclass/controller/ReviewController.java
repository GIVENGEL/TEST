package com.javaclass.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReviewController {

	/*
	 * 1) 리턴형이 String 
	 */
	
	/*@RequestMapping("review.do")
	public String model(Model m) {
		m.addAttribute("message","오늘도 화이팅");
		m.addAttribute("greeting","안녕하세요");
		return "09_exercise";
	}*/
	
	
	
	@RequestMapping("review.do")
	public Map view() {
		Map<String,String> m = new HashMap<String, String>();
		m.put("message", "화이팅");
		m.put("greeting", "안녕하세요");
		return m;
	}
	
	// 뷰페이지를 지정하지 않으면 review.jsp
}
