package board_ex.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board_ex.model.BoardVO;
import board_ex.service.*;

public class CommandDelete implements Command{
	private String next;

	public CommandDelete( String _next ){
		next = _next;
	}

	public String execute( HttpServletRequest request, HttpServletResponse response   ) throws CommandException{
		
		try {
			
			String seq = request.getParameter("seq");
			String password = request.getParameter("password");
			
			DeleteArticleService dao = DeleteArticleService.getInstance();
			int result =  dao.delete(seq, password);
			
			
			request.setAttribute("result",result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return next;
	}
}
