package board_ex.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board_ex.model.BoardVO;
import board_ex.service.ModifyArticleService;
import board_ex.service.ViewArticleService;
import board_ex.service.WriteArticleService;

public class CommandInsert implements Command {
	private String next;

	public CommandInsert( String _next ){
		next = _next;
	}

	public String execute( HttpServletRequest request, HttpServletResponse response   ) throws CommandException{
		
		try {
			String writer = request.getParameter("writer");
			String title = request.getParameter("title");
			String pass = request.getParameter("pass");
			String content = request.getParameter("content");
			
			WriteArticleService service = WriteArticleService.getInstance();
			BoardVO rec = new BoardVO();
			rec.setWriter(writer);
			rec.setTitle(title);
			rec.setPass(pass);
			rec.setContent(content);
			
			service.write(rec);
			request.setAttribute("rec",rec);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return next;
	}
}
