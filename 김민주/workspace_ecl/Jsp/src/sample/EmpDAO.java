package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class EmpDAO {

	// 1) DB 연결관련 변수 선언
	String driverName = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "hr";
	String pass = "1234";
	
	private EmpDAO() throws Exception {
		// 1. 드라이버 로딩 // 처음 에러 난 이유는 예외처리를 안해서
		Class.forName(driverName);
	}
//	왜 씀?
	static EmpDAO dao = null; // getInstance에서 사용하는 변수로 static 사용해야함
//	EmpDAO 라는 자료형으로 싱글톤 생성자 생성
//	클래스명으로 메소드(생성자 만드는 메소드)를 가져와야하니 static 으로 선언
//	마찬가지로 사용되는 모든 변수도 static 으로 선언되어야한다.
	public static EmpDAO getInstance() throws Exception {
//		dao가 이미 생성되어 있다면 dao 리턴 아니면 생성
		if(dao==null) {
			dao = new EmpDAO();
		}
		return dao;
	}
	
//	회원정보 전체를 가져오는 메서드
	public ArrayList<EmpVO> selectEmp() throws Exception{
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
		// 2. 연결객체 얻어오기
		conn = DriverManager.getConnection(url, user, pass);
		// 3. sql 문장 만들기
		String SQL = "SELECT * FROM employee";
		// 4. 전송객체 얻어오기
		pstmt = conn.prepareStatement(SQL);
		// 5. 전송  // executeUpdate(), executeQuery() 
		ResultSet rs = pstmt.executeQuery();
		
//		들어갈 데이터타입이 무엇인지 알기때문에 제네릭타입으로 선언
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
//		다음이 있다면 진행하는 반복문?
		while(rs.next()) {
//			EmpVO 인스턴스객체 생성
			EmpVO vo = new EmpVO();
//			사번,이름,업무를 지정해준다.
			vo.setEno(rs.getInt("ENO")); // rs.getInt("ENO) 는 테이블에서 가져오는 문구
			vo.setEname(rs.getString("ENAME"));
			vo.setJob(rs.getString("job"));
			vo.setManager(rs.getInt("MANAGER"));
			vo.setSalary(rs.getInt("SALARY"));
//		현재 문제점은 데이터를 가져와도 밖으로 저장이 안된다
//		그렇기 때문에 메소드 밖에 arrayList를 선언하고 그곳에 추가해준다
			list.add(vo);
		}
		return list;
		}finally {
		// 6. 닫기
		pstmt.close();	// 자식 먼저 종료하고
		conn.close();	// 부모 종료한다. 이유는 부모를 먼저 종료하게 되면 자식이 살아있지만 찾을수 없는 상태가 된다.
		}
	}
	
//	회원정보 등록하는 메소드
	public void insertEmp(EmpVO vo) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
		// 2. 연결객체 얻어오기
		conn = DriverManager.getConnection(url, user, pass);
		// 3. sql 문장 만들기
		String SQL = "INSERT INTO employee(eno,ename,job,salary) VALUES(?, ?, ?, ?)";
		// 4. 전송객체 얻어오기
		pstmt = conn.prepareStatement(SQL);
		pstmt.setInt(1, vo.getEno());
		pstmt.setString(2, vo.getEname());
		pstmt.setString(3, vo.getJob());
		pstmt.setInt(4, vo.getSalary());
		
		// 5. 전송  // executeUpdate(), executeQuery() 
		pstmt.executeUpdate();

		}finally {
		// 6. 닫기
		pstmt.close();	// 자식 먼저 종료하고
		conn.close();	// 부모 종료한다. 이유는 부모를 먼저 종료하게 되면 자식이 살아있지만 찾을수 없는 상태가 된다.
		}
	}
	
//	원하는 회원의 전체정보만 보여주는 메소드
	public EmpVO viewEmp(String eno) throws Exception{
		//jdbc 절차대로 작성
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
		// 2.연결객체 얻기
		conn = DriverManager.getConnection(url, user, pass);
		// 3. squl 문장 만들기
		String SQL = "SELECT * FROM employee WHERE ENO = ?"; // ? eno의 값이 들어가는거
		// 4.전송객체 얻기
		pstmt = conn.prepareStatement(SQL);
		pstmt.setInt(1,Integer.parseInt(eno));
		ResultSet rs = pstmt.executeQuery();
//		EmpVo의 값 설정하기위해 인스턴스객체 생성
		EmpVO vo = new EmpVO();
//		값 설정을 위해 rs.next() 로 찾아주고 내용 저장
			while(rs.next()) {
			vo.setEno(rs.getInt("eno"));
			vo.setEname(rs.getString("ename"));
			vo.setJob(rs.getString("job"));
			vo.setManager(rs.getInt("manager"));
			vo.setHiredate(rs.getString("hiredate"));
			vo.setSalary(rs.getInt("salary"));
			vo.setCommission(rs.getInt("commission"));
			vo.setDno(rs.getInt("dno"));
		}
		// void 가 아니므로 return값 필요. return 값은 EmpVO의 값을 설정해서 쓰려고 했던 거기 때문에 vo로
		return vo;
		}finally {
			pstmt.close();
			conn.close();
		}
	}
//	회원정보 삭제 메소드
	public int deleteEmp(String eno) throws Exception{
		//jdbc 절차대로 작성
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
		// 2.연결객체 얻기
		conn = DriverManager.getConnection(url, user, pass);
		// 3. squl 문장 만들기
		String SQL = "DELETE employee WHERE eno = ?"; // ? eno의 값이 들어가는거
		// 4.전송객체 얻기
		pstmt = conn.prepareStatement(SQL);			// 쿼리문 저장해주고
		pstmt.setInt(1, Integer.parseInt(eno));		// 쿼리문의 ? 를 어떤거로 쓸지 명시
		
		return pstmt.executeUpdate();
		}finally {
			pstmt.close();
			conn.close();
		}
	}
	
	public void modifyEmp(EmpVO vo) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
		// 2. 연결객체 얻어오기
		conn = DriverManager.getConnection(url, user, pass);
		// 3. sql 문장 만들기
		String SQL = "UPDATE employee SET ename=?, job=?, manager=?, hiredate=?, salary =?, commission=?, dno=? where eno=?";
		// 4. 전송객체 얻어오기
		pstmt = conn.prepareStatement(SQL);
//		pstmt.setInt(1, vo.getEno()); // 프라이머리키여서 readonly 로 설정했기에 굳이 바꿀이유없음
		pstmt.setString(1, vo.getEname());
		pstmt.setString(2, vo.getJob());
		pstmt.setInt(3, vo.getManager());
		pstmt.setString(4, vo.getHiredate());
		pstmt.setInt(5, vo.getSalary());
		pstmt.setInt(6, vo.getCommission());
		pstmt.setInt(7, vo.getDno());
		pstmt.setInt(8, vo.getEno()); // 다만 조건절에 넣어줘야하기 때문에 마지막에 ?에 설정
		
		
		// 5. 전송  // executeUpdate(), executeQuery() 
		pstmt.executeUpdate();

		}finally {
		// 6. 닫기
		pstmt.close();	// 자식 먼저 종료하고
		conn.close();	// 부모 종료한다. 이유는 부모를 먼저 종료하게 되면 자식이 살아있지만 찾을수 없는 상태가 된다.
		}
	}
	
	
}
