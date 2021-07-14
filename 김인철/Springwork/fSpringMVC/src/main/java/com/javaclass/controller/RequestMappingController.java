package com.javaclass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.javaclass.model.MemberVO;

@Controller
@RequestMapping("re")
public class RequestMappingController {

	@RequestMapping(value= {"/a.do","/b.do"})
	public String test() {
		System.out.println("a.do 요청 확인");
		// 1) ModelAndView 
		// **********************************
		// 2) 리턴형이 String 인 경우
		// - 뷰페이지 지정임
		return "start";
		
	}
	
	@RequestMapping("/c.do")
	public void sample(String pass,String id) {
		/*************************
		 *  3) 리턴형이 void 인 경우
		 *  	요청명과 동일한 뷰페이지를 지정
		 *  	요청명 : re/c.do
		 */
		System.out.println("이전 페이지(클라이언트) id : " + id);
		System.out.println("이전 페이지(클라이언트) pass : " + pass);
	}
	
	@RequestMapping(value= "/request.do", method=RequestMethod.POST)
	// 이전 화면(폼 안)에서 사용자 입력값을 얻어와서  MemberVO 객체에 멤버로 저장
	public void request(MemberVO vo) {
		System.out.println("멤버의 아이디 : " + vo.getId());

	}
	
	@RequestMapping("/model.do")
	public void model(Model m) {
		/*
		 * 4) 뷰단으로 Model 객체에 데이터를 저장해서 넘김
		 * ************* Model 변수 선언이 인자로 지정
		 */
		m.addAttribute("message", "오늘도 우리조 화이팅");
		m.addAttribute("data","스프링 만세");
	
	}

}
