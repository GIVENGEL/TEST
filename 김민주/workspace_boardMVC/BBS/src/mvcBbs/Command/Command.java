package mvcBbs.Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Command {
	// 받은 값을 여기서 처리??
	public String execute( HttpServletRequest request, HttpServletResponse response  ) throws CommandException;
}
