package mybatis.guest.session;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class EMPRepository 
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
	
	
	public List<HashMap> empSelect(){
		SqlSession sqlSess = getSqlSessionFactory().openSession();
		try {
			String statement = "EmployeeMapper.empSelect";
			return sqlSess.selectList(statement);
		}finally {
			sqlSess.close();
		}
	}
	
	public HashMap empView(HashMap map){
		SqlSession sqlSess = getSqlSessionFactory().openSession();
		try {
			String statement = "EmployeeMapper.empView";
			return sqlSess.selectOne(statement,map);
		}finally {
			sqlSess.close();
		}
	}
	
	public int empInsert(HashMap map) {
		// 연결?
		SqlSession sqlSess = getSqlSessionFactory().openSession();
		try {
			String statement = "EmployeeMapper.empInsert";
			int result = sqlSess.insert(statement,map);
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
