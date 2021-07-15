package com.javaclass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javaclass.model.MemberVO;

@Controller		
public class ModelAttrController {

		@ModelAttribute("message")
		public String attr1() {
			return "결과를 전송";
		}
		
		@ModelAttribute("memberVO")
		public MemberVO attr2() {
			MemberVO vo = new MemberVO();
			vo.setId("박길자");
			vo.setName("옹뇽뇽");
			vo.setAge(23);
			return vo;
		}
	
		@RequestMapping("modelAttr.do")
		public String test() {
			return "modelAttrResult";
		}
		
		@RequestMapping("insert.do")
		public String insert() {
			// 추후에 여기는 디비에 입력함
			// Controller -> Controller
			//******************** 리다이렉트
			return "redirect:select.do";
		}
		
		@RequestMapping("select.do")
		public void select() {
			// 추후에 디비에서 데이터를 가져옴
			
		}
}
