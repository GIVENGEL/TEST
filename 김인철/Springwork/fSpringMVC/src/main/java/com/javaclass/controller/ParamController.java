package com.javaclass.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.javaclass.model.MemberVO;

@Controller
public class ParamController {
	
	@RequestMapping("param.do")
	public String test(String id,@RequestParam(defaultValue="0") int age) {
	
		System.out.println("이전 페이지(클라이언트) id : " + id);
		System.out.println("이전 페이지(클라이언트) age : " + age);
	
		return "04_param";
	}
	
	
	//************ 
	// 세션이 필요할 때 그냥 인자로 HttpSession session
	@RequestMapping("paramForm.do")
	public String form(MemberVO vo, HttpSession session) {
		String dbid = "kosmo";
		String dbname = "홍길자";
		
		if(dbid.equals(vo.getId()) && dbname.equals(vo.getName()))
		{
			session.setAttribute("login", dbid+"님 접속");

		}
		
		
		return "04_form";
		
	}
}
