package com.javassem.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.javassem.dao.BoardDAO;
import com.javassem.domain.BoardVO;
import com.javassem.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;

	@RequestMapping("/getBoardList.do")
	public void getBoardList(Model m) {
		m.addAttribute("boardList",boardService.getBoardList());
		
	}
	
	@RequestMapping("insertBoard.do")
	public void insertBoard(BoardVO vo) {
		
	}
	
	@RequestMapping("saveBoard.do")
	public String saveBoard(BoardVO vo) {
		boardService.insertBoard(vo);
		return "redirect:getBoardList.do";
	}
	
	@RequestMapping("/getBoard.do")
	public BoardVO getBoard(BoardVO vo) {
		System.out.println(vo.getSeq());
		return boardService.getBoard(vo);
		
	}
	
		@RequestMapping("updateBoard.do")
	public String updateBoard(BoardVO vo) {
		boardService.updateBoard(vo);
		return "redirect:getBoardList.do"; 
		
	}
		
		

			@RequestMapping("deleteBoard.do")
		public String deleteBoard(BoardVO vo) {
			boardService.deleteBoard(vo);
			return "redirect:getBoardList.do"; 
			
		}
}
