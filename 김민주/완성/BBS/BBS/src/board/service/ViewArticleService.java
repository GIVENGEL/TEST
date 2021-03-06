package board.service;

import board.model.BoardDao;
import board.model.BoardException;
import board.model.BoardVO;


public class ViewArticleService {
	private static ViewArticleService instance;
	public static ViewArticleService getInstance()  throws BoardException{
		if( instance == null )
		{
			instance = new ViewArticleService();
		}
		return instance;
	}
	// 조회수 증가되는 함수 및 vo에 내용을 볼 게시판 대입
	public BoardVO getArticleById(String id) throws BoardException
	{
		// seq(게시판번호) 초기화 작업
		int article_id = 0;
		if( id != null ) article_id = Integer.parseInt(id);
		BoardDao dao = BoardDao.getInstance();
		BoardVO rec = dao.selectById(article_id);		
		dao.increaseReadCount(article_id);
		return rec;
	}
	
//	public BoardVO getArticleByIds(String id) throws BoardException
//	{
//		int article_id = 0;
//		if( id != null ) article_id = Integer.parseInt(id);
//		BoardDao dao = BoardDao.getInstance();
//		BoardVO rec = dao.selectById(article_id);		
//		return rec;
//	}
//		
}

