package mybatis.guest.session;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import mybatis.guest.model.Comment;

public class CommentRepository 
{
	//	private final String namespace = "CommentMapper";

	private SqlSessionFactory getSqlSessionFactory() {
		
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream("mybatis-config.xml");
		} catch (IOException e) {
			throw new IllegalArgumentException(e);
		}
		SqlSessionFactory sessFactory =  new SqlSessionFactoryBuilder().build(inputStream);
		return sessFactory;
	}
	
	public Integer insertComment(Comment c) {
		// JDBC : Connection / mybatis : SqlSession 연결담당이다.
		SqlSession sqlSess = getSqlSessionFactory().openSession();
		try {
//			CommentMapper의 insertComment 를 사용한다?
			String statement = "CommentMapper.insertComment";
			int result = sqlSess.insert(statement,c);
			if(result> 0) {
//				JDBC:AUTO-COMMIT / MYBATIS : COMMIT 지정 필수! 
				sqlSess.commit();
			}else{
				sqlSess.rollback();
			}
			return result;
		}finally {
			sqlSess.close(); // 
		}
	}
	
	public List<Comment> selectComment(HashMap map){
		SqlSession sqlSess = getSqlSessionFactory().openSession();
		try {
			String statement = "CommentMapper.selectComment";
			return sqlSess.selectList(statement,map);
		}finally {
			sqlSess.close();
		}
	}
	
	public Comment selectCommentByPK(long commentNo){
		SqlSession sqlSess = getSqlSessionFactory().openSession();
		try {
			HashMap map = new HashMap();
			map.put("commentNo", commentNo);
			String statement = "CommentMapper.selectComment";
			// 검색할 대상이 하나이니깐 selectOne
			// 넘겨받은 파라매터가 있으니 쿼리문 뒤에 추가
			return sqlSess.selectOne(statement,map);
		}finally {
			sqlSess.close();
		}
	}
	
	public Integer modifyComment(String content,int commentNo){
		SqlSession sqlSess = getSqlSessionFactory().openSession();
		try {
			HashMap map = new HashMap();
			map.put("commentContent", content);
			map.put("commentNo", commentNo);
			String statement = "CommentMapper.modifyComment";
			// 검색할 대상이 하나이니깐 selectOne
			// 넘겨받은 파라매터가 있으니 쿼리문 뒤에 추가
			int result = sqlSess.update(statement,map);
			if(result>0) {
				sqlSess.commit();
			}else {
				sqlSess.rollback();
			}
			return result;
		}finally {
			sqlSess.close();
		}
	}
	
	
}
