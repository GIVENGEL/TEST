package board_ex.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board_ex.model.BoardVO;
import board_ex.service.*;

public class CommandModify implements Command{
	private String next;

	public CommandModify( String _next ){
		next = _next;
	}

	public String execute( HttpServletRequest request, HttpServletResponse response   ) throws CommandException{
		
		try {
			
			String seq = request.getParameter("seq");
			String title = request.getParameter("title");
			String pass = request.getParameter("pass");
			String content = request.getParameter("content");
			
			ViewArticleService view = ViewArticleService.getInstance();
			BoardVO rec = view.getArticleById(seq);
			rec.setTitle(title);
			rec.setPass(pass);
			rec.setContent(content);
			
			int result = ModifyArticleService.getInstance().update(rec);
			request.setAttribute("result",result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return next;
	}
}
