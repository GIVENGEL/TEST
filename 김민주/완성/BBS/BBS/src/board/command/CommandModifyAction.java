package board.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.model.BoardVO;
import board.service.ModifyArticleService;

public class CommandModifyAction implements Command{

	private String next;
	
	public CommandModifyAction(String _next) {
		next = _next;
	}
	
	public String execute(HttpServletRequest request, HttpServletResponse response) throws CommandException {
		
		try {
			//페이지 넘버링하려고 변수 받아옴
			String seq = request.getParameter("seq");
			request.setAttribute("seq", seq);
			String title = request.getParameter("title");
			request.setAttribute("title", title);
			String content = request.getParameter("content");
			request.setAttribute("content", content);
			String pass = request.getParameter("pass");
			request.setAttribute("pass", pass);
			
			BoardVO rec = new BoardVO();
			rec.setTitle(title);
			rec.setContent(content);
			rec.setPass(pass);
			rec.setSeq(Integer.parseInt(seq));
			int result = ModifyArticleService.getInstance().update(rec);
			request.setAttribute("result", result);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return next;
	}

}
