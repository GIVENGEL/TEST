package guest.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;





public class MessageDao {

	// Single Pattern 
	private static MessageDao instance;
	
	// DB 연결시  관한 변수 
	private static final String 	dbDriver	=	"com.mysql.cj.jdbc.Driver";
	private static final String		dbUrl		=	"jdbc:mysql://kic.cj7mov3fe2u4.ap-northeast-2.rds.amazonaws.com/";
	private static final String		dbUser		=	"admin";
	private static final String		dbPass		=	"rladlscjf0!";
	private static String dbName = "PRAC03";

	
	
	
	//--------------------------------------------
	//#####	 객체 생성하는 메소드 
	public static MessageDao	getInstance() throws MessageException
	{
		if( instance == null )
		{
			instance = new MessageDao();
		}
		return instance;
	}
	
	private MessageDao() throws MessageException
	{
	
		try{
			
			/********************************************
				1. 오라클 드라이버를 로딩
					( DBCP 연결하면 삭제할 부분 )
			*/
			Class.forName(dbDriver);

		}catch( Exception ex ){
			throw new MessageException("방명록 ) DB 연결시 오류  : " + ex.toString() );	
		}
		
	}
	
	
	/*
	 * 메세지를 입력하는 함수
	 */
	public void insert(Message msg) throws MessageException{
		 PreparedStatement pstmt = null;
		 Connection conn = null;
		try{

			// 1. 연결객체(Connection) 얻어오기
			conn = DriverManager.getConnection(dbUrl+dbName, dbUser, dbPass); 
			// 2. sql 문장 만들기
			String SQL = "INSERT INTO GuestTB(GUEST_NAME,PASSWORD,MESSAGE) values(?,?,?)";
			// 3. 전송객체 얻어오기
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, msg.getGuestName());
			pstmt.setString(2, msg.getPassword());
			pstmt.setString(3, msg.getMessage());
			// 4. 전송하기
			pstmt.executeUpdate();
			
		
				
		}catch( Exception ex ){
			throw new MessageException("방명록 ) DB에 입력시 오류  : " + ex.toString() );	
		} finally{
			if( pstmt   != null ) { try{ pstmt.close();  } catch(SQLException ex){} }
			if( conn  != null ) { try{ conn.close(); } catch(SQLException ex){} }
		}
	
	}
	
	/*
	 * 메세지 목록 전체를 얻어올 때
	 */
	public List<Message> selectList() throws MessageException
	{
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Message> mList = new ArrayList<Message>();
		boolean isEmpty = true;
		
		try{
			conn = DriverManager.getConnection(dbUrl+dbName, dbUser, dbPass);
			String SQL = "SELECT * FROM GuestTB";
			pstmt = conn.prepareStatement(SQL);
			rs = pstmt.executeQuery();
			while(rs.next()){
				Message msg = new Message();
				msg.setMessageId(rs.getInt("MESSAGE_ID"));
				msg.setGuestName(rs.getString("GUEST_NAME"));
				msg.setPassword(rs.getString("PASSWORD"));
				msg.setMessage(rs.getString("MESSAGE"));
				mList.add(msg);
				isEmpty = false;
			}
			
			
			if( isEmpty ) return Collections.emptyList();
			
			return mList;
		}catch( Exception ex ){
			throw new MessageException("방명록 ) DB에 목록 검색시 오류  : " + ex.toString() );	
		} finally{
			if( rs   != null ) { try{ rs.close();  } catch(SQLException ex){} }
			if( pstmt   != null ) { try{ pstmt.close();  } catch(SQLException ex){} }
			if( conn  != null ) { try{ conn.close(); } catch(SQLException ex){} }
		}		
	}
	

	/* -------------------------------------------------------
	 * 현재 페이지에 보여울 메세지 목록  얻어올 때
	 */
	public List<Message> selectList(int firstRow, int endRow) throws MessageException
	{
		Connection	 		conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Message> mList = new ArrayList<Message>();
		boolean isEmpty = true;
		
		try{
			conn = DriverManager.getConnection(dbUrl+dbName, dbUser, dbPass);
//			rownum 사용시
//			String SQL = "select * from (select @rownum := @rownum + 1 as rn, MESSAGE_ID,GUEST_NAME, PASSWORD, MESSAGE from GuestTB, (select @rownum := 0)  as rowcolumn order by MESSAGE_ID ASC) as rownum_table where rn >= 4 and rn <=6";
			String SQL = "select * from GuestTB limit ?, ?";
			pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1, firstRow);
			pstmt.setInt(2, endRow);
			rs = pstmt.executeQuery();
		
			while(rs.next()){
				Message msg = new Message();
				msg.setMessageId(rs.getInt("MESSAGE_ID"));
				msg.setGuestName(rs.getString("GUEST_NAME"));
				msg.setPassword(rs.getString("PASSWORD"));
				msg.setMessage(rs.getString("MESSAGE"));
				mList.add(msg);
				isEmpty = false;
			}
			if( isEmpty ) return Collections.emptyList();
			
			return mList;
		}catch( Exception ex ){
			throw new MessageException("방명록 ) DB에 목록 검색시 오류  : " + ex.toString() );	
		} finally{
			if( rs   != null ) { try{ rs.close();  } catch(SQLException ex){} }
			if( pstmt   != null ) { try{ pstmt.close();  } catch(SQLException ex){} }
			if( conn  != null ) { try{ conn.close(); } catch(SQLException ex){} }
		}		
	}
	
	
	
	/* -------------------------------------------------------
	 * 메세지 전체 레코드 수를 검색
	 */
	
	public int getTotalCount() throws MessageException{
		Connection	 		conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int count = 0;

		try{
			conn = DriverManager.getConnection(dbUrl+dbName, dbUser, dbPass);
			String SQL = "SELECT count(*) as CNT FROM GuestTB";
			pstmt = conn.prepareStatement(SQL);
			rs = pstmt.executeQuery();
			if(rs.next()) {				
			count = rs.getInt("CNT");
			}
			
			return  count;
			
		}catch( Exception ex ){
			throw new MessageException("방명록 ) DB에 목록 검색시 오류  : " + ex.toString() );	
		} finally{
			if( rs   != null ) { try{ rs.close();  } catch(SQLException ex){} }
			if( pstmt   != null ) { try{ pstmt.close();  } catch(SQLException ex){} }
			if( conn  != null ) { try{ conn.close(); } catch(SQLException ex){} }
		}			
	}
	
	/*
	 * 메세지 번호와 비밀번호에 의해 메세지 삭제
	 */
	public int delete( int messageId, String password ) throws MessageException
	{
		int result = 0;
		Connection	 		conn = null;
		PreparedStatement pstmt = null;
		Statement stmt = null;
		try{
			conn = DriverManager.getConnection(dbUrl+dbName, dbUser, dbPass);
			String SQL = "DELETE FROM GuestTB WHERE message_id =? AND password=?";
			pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1, messageId);
			pstmt.setString(2,password);
			int rs = pstmt.executeUpdate();
			if(rs == 1) {
				result = 1;
			}
			SQL = "ALTER TABLE GuestTB AUTO_INCREMENT=1";
			stmt = conn.createStatement();
			stmt.execute(SQL);
			System.out.println("alter1번 완료");
			
			SQL = "SET @COUNT = 0";
			stmt = conn.createStatement();
			stmt.execute(SQL);
			System.out.println("alter2번 완료");
			
			SQL = "UPDATE GuestTB SET MESSAGE_ID = @COUNT:=@COUNT+1";
			stmt = conn.createStatement();
			stmt.execute(SQL);
			System.out.println("alter3번 완료");
			return result;
		}catch( Exception ex ){
			throw new MessageException("방명록 ) DB에 삭제시 오류  : " + ex.toString() );	
		} finally{
			if( pstmt   != null ) { try{ pstmt.close();  } catch(SQLException ex){} }
			if( conn  != null ) { try{ conn.close(); } catch(SQLException ex){} }
		}		
	}
}
