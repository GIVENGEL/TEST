package board.command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.model.BoardVO;
import board.service.ListArticleService;
import board.service.ViewArticleService;

public class CommandView implements Command{

	private String next;
	
	public CommandView(String _next) {
		next = _next;
	}
	
	public String execute(HttpServletRequest request, HttpServletResponse response) throws CommandException {
		
		try {
			//페이지 넘버링하려고 변수 받아옴
			String seq = request.getParameter("seq");
			request.setAttribute("seq", seq);
			ViewArticleService service = ViewArticleService.getInstance();
			BoardVO vo = service.getArticleById(seq);
			request.setAttribute("vo", vo);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return next;
	}

}
