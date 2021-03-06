package board.control;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.command.Command;
import board.command.CommandDelete;
import board.command.CommandDeleteAction;
import board.command.CommandException;
import board.command.CommandInputAction;
import board.command.CommandList;
import board.command.CommandModify;
import board.command.CommandModifyAction;
import board.command.CommandNull;
import board.command.CommandView;


	public class BoardControl extends HttpServlet{
		private HashMap commandMap;
		private String jspDir = "/BBS/";
		private String error = "error.jsp";
		
		public BoardControl() {
			super();
			initCommand();
		}
		
		private void initCommand(){
			commandMap = new HashMap();
			
			commandMap.put("list-page", new CommandList("BoardList.jsp"));
			commandMap.put("view-page", new CommandView("BoardView.jsp"));
			commandMap.put("delete-page", new CommandDelete("BoardDeleteForm.jsp"));
			commandMap.put("deleteAction-page", new CommandDeleteAction("BoardDelete.jsp"));
			commandMap.put("modify-page", new CommandModify("BoardModifyForm.jsp"));
			commandMap.put("modifyAction-page", new CommandModifyAction("BoardModify.jsp"));
			commandMap.put("input-page", new CommandNull("BoardInputForm.jsp"));
			commandMap.put("inputAction-page", new CommandInputAction("BoardSave.jsp"));
			
		}
		
		
		public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			processRequest(request, response);
		}

		public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			processRequest(request, response);
		}
		

		private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			request.setCharacterEncoding("utf-8");

			String nextPage = "";
			String cmdKey	= request.getParameter("cmd");
			if( cmdKey == null ){
				cmdKey = "list-page";
			}

			
			Command cmd = null;

			try{
				
				if( commandMap.containsKey( cmdKey ) ){
					
					cmd = (Command)commandMap.get(cmdKey);
				}else{
					throw new CommandException("????????? ???????????? ???????????? ??????");
				}
//				System.out.println(cmd);
				nextPage = cmd.execute( request, response  );
//				System.out.println("nextPage : "+nextPage);

			}catch( CommandException e ){
				request.setAttribute("javax.servlet.jsp.jspException", e );
				nextPage = error;
				System.out.println("?????? : " + e.getMessage() );
			}
//			System.out.println( jspDir + nextPage );
			RequestDispatcher reqDp = getServletContext().getRequestDispatcher( jspDir + nextPage );
			reqDp.forward( request, response );
			
		}

	}
