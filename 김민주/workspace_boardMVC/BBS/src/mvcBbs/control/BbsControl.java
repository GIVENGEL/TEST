package mvcBbs.control;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvcBbs.Command.Command;
import mvcBbs.Command.CommandException;
import mvcBbs.Command.CommandList;
import mvcBbs.Command.CommandNull;

public class BbsControl extends HttpServlet {
	private HashMap commandMap;
	private String jspDir = "/mvcBbs/";
	private String error = "error.jsp";
       
    
    public BbsControl() {
    	initCommand();
    }
    private void initCommand() {
    	// bbscontrol 의 생성자를 만들면 자동으로 해쉬맵으로 이어지도록
    	commandMap = new HashMap(); 
    	// 커맨드맵에 main-page키 의 값으로 String = main.jsp 로 형변환한 값을 넣어줌? 
    	commandMap.put("main-page", new CommandNull("main.jsp"));
    	commandMap.put("list-page", new CommandNull("BoardList.jsp"));
    }
    

	//어떤 방식으로 받았건 processRequest 로 해결
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	//어떤 방식으로 받았건 processRequest 로 해결
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 전달받은 값 한글처리 위함
		request.setCharacterEncoding("utf-8");
		// 페이지 이동할 경로? 해쉬맵으로 전달해줄 값 얻어오는 법
		String nextPage = "";
		String cmdKey = request.getParameter("cmd");
		int page = Integer.parseInt("page");
		if(page==0) {
			page=1;
		}
		
//		System.out.println(cmdKey); 여기까진 받아옴
		if(cmdKey==null) {
			cmdKey = "main-page";
		}
		// command 타입의 변수 생성 . cmd에  
		Command cmd = null;
		try {
			if(commandMap.containsKey(cmdKey)) {
				cmd = (Command) commandMap.get(cmdKey);
			}else {
				throw new CommandException("지정할 명령어가 존재하지 않음");
			}
//			System.out.println(cmd);
			nextPage = cmd.execute(request, response);
		}catch(CommandException e) {
			request.setAttribute("javax.servlet.jsp.jspException", e );
			nextPage = error;
			System.out.println("오류 : " + e.getMessage() );
		}
		System.out.println(nextPage);
		RequestDispatcher reqDp = getServletContext().getRequestDispatcher( jspDir + nextPage );
		reqDp.forward( request, response );
		
	}

	
	
}
