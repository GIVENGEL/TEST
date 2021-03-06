package givengel.control;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import givengel.command.*;


public class GivengelControl extends HttpServlet {

	private HashMap commandMap;
	private String	jspDir = "/";
	private String  error = "error.jsp";
 
    public GivengelControl() {
        super();
        initCommand();
    }
    
    public void initCommand() {
    	commandMap = new HashMap();
    	
    	
    	commandMap.put("main-page", new CommandNull("index.jsp"));
    	commandMap.put("login-page", new CommandNull("loginForm.jsp"));
    	commandMap.put("join-page", new CommandNull("joinForm.jsp"));
    	commandMap.put("find-page", new CommandNull("findForm.jsp"));
    	commandMap.put("contact-page", new CommandNull("contact.jsp"));
    	
    	commandMap.put("campaign-page", new CommandNull("campaign.jsp"));
    	commandMap.put("sponsor-page", new CommandNull("sponsorList.jsp"));

    	
    }
    


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");

		String nextPage = "";
		String cmdKey	= request.getParameter("cmd");
		if( cmdKey == null ){
			cmdKey = "main-page";
		}

		
		Command cmd = null;

		try{
			
			if( commandMap.containsKey( cmdKey ) ){
				cmd = (Command)commandMap.get( cmdKey);
			}else{
				throw new CommandException("지정할 명령어가 존재하지 않음");
			}

			nextPage = cmd.execute(request, response);

		}catch( CommandException e ){
			request.setAttribute("javax.servlet.jsp.jspException", e );
			nextPage = error;
			System.out.println("오류 : " + e.getMessage() );
		}

		RequestDispatcher reqDp = getServletContext().getRequestDispatcher( jspDir + nextPage );
		reqDp.forward( request, response );
	}

}
