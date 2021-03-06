package board_ex.control;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board_ex.command.*;


public class BoardControl extends HttpServlet {

	private HashMap commandMap;
	private String	jspDir = "/04_board_ex/";
	private String  error = "error.jsp";
 
    public BoardControl() {
        super();
        initCommand();
    }
    
    public void initCommand() {
    	commandMap = new HashMap();
    	
    	commandMap.put("list-page", new CommandNull("BoardList.jsp"));
    	commandMap.put("view-page", new CommandView("BoardView.jsp"));
    	
    	commandMap.put("modify-page", new CommandView("BoardModifyForm.jsp"));
    	commandMap.put("modify-action", new CommandModify("BoardModify.jsp"));
    	
    	commandMap.put("write-page", new CommandNull("BoardInputForm.jsp"));
    	commandMap.put("write-action", new CommandInsert("BoardSave.jsp"));

    	commandMap.put("delete-page", new CommandNull("BoardDeleteForm.jsp"));
    	commandMap.put("delete-action", new CommandDelete("BoardDelete.jsp"));
    	
    	commandMap.put("page-action", new CommandDelete("BoardList.jsp"));

    	
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
			cmdKey = "list-page";
		}

		
		Command cmd = null;

		try{
			
			if( commandMap.containsKey( cmdKey ) ){
				cmd = (Command)commandMap.get( cmdKey);
			}else{
				throw new CommandException("????????? ???????????? ???????????? ??????");
			}

			nextPage = cmd.execute( request, response  );

		}catch( CommandException e ){
			request.setAttribute("javax.servlet.jsp.jspException", e );
			nextPage = error;
			System.out.println("?????? : " + e.getMessage() );
		}

		RequestDispatcher reqDp = getServletContext().getRequestDispatcher( jspDir + nextPage );
		reqDp.forward( request, response );
	}

}
