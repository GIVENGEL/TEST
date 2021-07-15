package com.javaclass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javaclass.model.MemberVO;
import com.javaclass.model.MemberVOList;

@Controller
public class MultiInsertController {

	@RequestMapping("multiInsert.do")
	public void setList(MemberVOList memberVOList) {
		for(MemberVO vo : memberVOList.getList()) {
			System.out.println(vo.getName());
		}
	}
}
