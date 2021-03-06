package member.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDao {

	
	// DB 연결시  관한 변수 

	private static final String 	dbDriver	=	"com.mysql.cj.jdbc.Driver";
	private static final String		dbUrl		=	"jdbc:mysql://kic.cj7mov3fe2u4.ap-northeast-2.rds.amazonaws.com/";
	private static final String		dbUser		=	"admin";
	private static final String		dbPass		=	"rladlscjf0!";
	private static String dbName = "PRAC02";
	private PreparedStatement pstmt;
	private Connection conn;
	
	// 싱글톤 패턴 적용	
	private static MemberDao memberDao;
	
	public static MemberDao getInstance() throws MemberException {
		if( memberDao == null )
		{
			memberDao =  new MemberDao();
		}
		return memberDao;
	}
	

	private MemberDao() throws MemberException{
			
		try{
			
			/********************************************
				1. 드라이버를 로딩
			*/
			Class.forName(dbDriver);
		}catch( Exception ex ){
			throw new MemberException("DB 연결시 오류  : " + ex.toString() );	
		}
	}
	
	/*******************************************
	 * * 회원관리테이블 MEMBERTEST 에  회원정보를 입력하는 함수
	 * @param rec
	 * @throws MemberException
	 */
	public void insertMember( Member member ) throws MemberException{
		try {
			
			 // 0. 연결 객체 얻어오기
			conn = DriverManager.getConnection(dbUrl+dbName, dbUser, dbPass);
			 // 1. sql 문장 만들기 ( insert문 )
			String SQL = "INSERT INTO memberTest values(?,?,?,?,?)";
			 // 2. sql 전송 객체 만들기
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPassword());
			pstmt.setString(3, member.getName());
			pstmt.setString(4, member.getTel());
			pstmt.setString(5, member.getAddr());
			 // 3. sql 전송
			pstmt.executeUpdate();
		
		} catch ( Exception ex ){
			throw new MemberException("멤버 입력시 오류  : " + ex.toString() );			
		} finally {
			try {
				 // 4. 객체 닫기
				pstmt.close();
				conn.close();
			}catch(Exception ex){
				
			}
		}
	}
	
	/**********************************************************
	 * * 회원관리테이블 MEMBERTEST에서 기존의 id값과 중복되는지 확인하는 함수
	 */
	public boolean isDuplicatedId( String id ) throws MemberException{
		boolean flag = false;
		
		try{	
			conn = DriverManager.getConnection(dbUrl+dbName, dbUser, dbPass);
			String SQL = "SELECT * FROM memberTest WHERE id = upper(?)";
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, id);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				flag = true;
			}else {
				flag = false;
			}
		
			
		}catch( Exception ex ){
			throw new MemberException("중복아이디 검사시 오류  : " + ex.toString() );			
		}finally {
			try {
				pstmt.close();
				conn.close();				
			}catch(Exception ex) {
				
			}
		}
			
		return flag;
	}
}
