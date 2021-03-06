package mvcBbs.Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CommandNull implements Command{
	// 페이지 이동 주소를 담을 변수 생성?
	private String next;
	
	// 매개변수로 받은 내용을 next에 갱신
	public CommandNull(String _next) {
		next = _next;
	}
	
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws CommandException {
		return next;
	}

}
