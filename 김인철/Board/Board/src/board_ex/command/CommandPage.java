package board_ex.command;


import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board_ex.model.*;
import board_ex.service.ViewArticleService;

public class CommandPage implements Command{
	private String next;

	public CommandPage( String _next ){
		next = _next;
	}

	public String execute( HttpServletRequest request, HttpServletResponse response   ) throws CommandException{
		
		try {
			int seq = (request.getParameter("seq")==null) ? 0 : Integer.parseInt(request.getParameter("seq"));
			request.setAttribute("seq2",seq);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return next;
	}

}