package board_ex.command;


import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board_ex.model.*;
import board_ex.service.ViewArticleService;

public class CommandView implements Command{
	private String next;

	public CommandView( String _next ){
		next = _next;
	}

	public String execute( HttpServletRequest request, HttpServletResponse response   ) throws CommandException{
		
		try {
			BoardVO vo = ViewArticleService.getInstance().getArticleByIds(request.getParameter("seq"));
			request.setAttribute("view",vo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return next;
	}

}