package board.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.model.BoardVO;
import board.service.ViewArticleService;

public class CommandModify implements Command{

	private String next;
	
	public CommandModify(String _next) {
		next = _next;
	}
	
	public String execute(HttpServletRequest request, HttpServletResponse response) throws CommandException {
		
		try {
			//페이지 넘버링하려고 변수 받아옴
			String seq = request.getParameter("seq");
			request.setAttribute("seq", seq);
			BoardVO vo = ViewArticleService.getInstance().getArticleById(seq);
			request.setAttribute("vo", vo);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return next;
	}

}
