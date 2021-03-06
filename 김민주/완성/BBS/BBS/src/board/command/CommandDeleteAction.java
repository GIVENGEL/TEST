package board.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.service.DeleteArticleService;

public class CommandDeleteAction implements Command{

	private String next;
	
	public CommandDeleteAction(String _next) {
		next = _next;
	}
	
	public String execute(HttpServletRequest request, HttpServletResponse response) throws CommandException {
		
		try {
			//페이지 넘버링하려고 변수 받아옴
			String seq = request.getParameter("seq");
			System.out.println(seq);
			request.setAttribute("seq", seq);
			String pass = request.getParameter("password");
			System.out.println(pass);
			request.setAttribute("pass", pass);
			int delRs = DeleteArticleService.getInstance().delete(seq, pass);
			System.out.println(delRs);
			request.setAttribute("delRS", delRs);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return next;
	}

}
