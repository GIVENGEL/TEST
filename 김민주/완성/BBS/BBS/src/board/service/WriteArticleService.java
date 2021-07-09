package board.service;

import board.model.BoardDao;
import board.model.BoardException;
import board.model.BoardVO;

public class WriteArticleService {
	
	private static WriteArticleService instance;
	public static WriteArticleService getInstance()  throws BoardException{
		if( instance == null )
		{
			instance = new WriteArticleService();
		}
		return instance;
	}
	
	public BoardVO write( BoardVO rec ) throws BoardException{
		
		BoardDao dao = BoardDao.getInstance();
		dao.insert(rec);

		return rec;
		
	}
}
