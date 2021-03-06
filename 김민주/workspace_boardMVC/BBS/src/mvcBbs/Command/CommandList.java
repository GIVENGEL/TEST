package mvcBbs.Command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvcBbs.model.BoardException;
import mvcBbs.model.BoardVO;
import mvcBbs.service.ListArticleService;

public class CommandList implements Command{
	// 페이지 이동 주소를 담을 변수 생성?
	private String next;
	private int page;
	
	// 매개변수로 받은 내용을 next에 갱신
	public CommandList(String _next) {
		next = _next;
	}
	
	public CommandList(int _page) {
		page = _page;
	}
	
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws CommandException {
		try {	
		 	int pNum = Integer.parseInt(request.getParameter("page"));
		 	// 리스트서비스객체생성
		 	ListArticleService service = ListArticleService.getInstance();
			
		 	List <BoardVO> mList = service.getArticleList(pNum);
		 	
		 	
		 	request.setAttribute("param", mList);

		 	
		}catch(BoardException e) {
			
		}
		
		
		return next;
	}

}
