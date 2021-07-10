package board.command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.model.BoardVO;
import board.service.ListArticleService;
import board.service.ViewArticleService;

public class CommandNull implements Command{

	private String next;
	
	public CommandNull(String _next) {
		next = _next;
	}
	
	public String execute(HttpServletRequest request, HttpServletResponse response) throws CommandException {
		return next;
	}

}
