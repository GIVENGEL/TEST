package board.command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.model.BoardVO;
import board.service.ListArticleService;

public class CommandList implements Command{

	private String next;
	
	public CommandList(String _next) {
		next = _next;
	}
	
	public String execute(HttpServletRequest request, HttpServletResponse response) throws CommandException {
		
		try {
			//페이지 넘버링하려고 변수 받아옴
			String id = request.getParameter("page");
			if(id==null) {
				id = "1";
			}
			request.setAttribute("page", id);
			ListArticleService service = ListArticleService.getInstance();
			int pNum = Integer.parseInt(id);
			List<BoardVO> mlist = service.getArticleList(pNum);
			request.setAttribute("mlist", mlist);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return next;
	}

}
