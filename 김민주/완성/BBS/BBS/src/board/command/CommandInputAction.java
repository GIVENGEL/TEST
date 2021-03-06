package board.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.model.BoardVO;
import board.service.WriteArticleService;

public class CommandInputAction implements Command{

	private String next;
	
	public CommandInputAction(String _next) {
		next = _next;
	}
	// 페이지 작성을 위한 변수 받아오는 control단
	public String execute(HttpServletRequest request, HttpServletResponse response) throws CommandException {
		
		try {
			String writer = request.getParameter("writer");
			request.setAttribute("writer", writer);
			String title = request.getParameter("title");
			request.setAttribute("title", title);
			String content = request.getParameter("content");
			request.setAttribute("content", content);
			String pass = request.getParameter("pass");
			request.setAttribute("pass", pass);
			
			BoardVO rec = new BoardVO();
			rec.setWriter(writer);
			rec.setTitle(title);
			rec.setContent(content);
			rec.setPass(pass);
//			rec.setCnt(0);
			WriteArticleService.getInstance().write(rec);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return next;
	}

}
