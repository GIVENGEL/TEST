package mvc.simple;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class SimpleControl extends HttpServlet {
	
	String jspDir = "/05_mvc_class/1_mvcSimple/";
	
	// 디폴트생성자.
    public SimpleControl() {
//        super(); 생략가능한 이유는 자동으로 만들어준다.
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request,response);
	}

	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 사용자의 요청(파라매터)를 받음
		String type = request.getParameter("type");
		// 2. 사용자 요청에 따라 알맞는 기능을 수행  ex) 
		String value="";
		if(type==null) value = "안녕하세요"; // 넘어온 파라매터 값이 없으면 "안녕하세요"
		else value = "아무개님 화이팅";
		// 3. 처리 결과를 request/session 에 저장
		request.setAttribute("param", value);
		// 4. 사용자가 볼 뷰페이즈를 포워딩 : <jsp:forward page=''> // 자바영역이기 때문에 자바형식으로 변환
		RequestDispatcher disp = request.getRequestDispatcher(jspDir+"simpleView.jsp");
		disp.forward(request, response);
	}

}
