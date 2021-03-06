package board_ex.service;

import java.util.ArrayList;
import java.util.List;

import board_ex.model.*;

public class ListArticleService {
	private static ListArticleService instance;
	public static ListArticleService getInstance()  throws BoardException{
		if( instance == null )
		{
			instance = new ListArticleService();
		}
		return instance;
	}
	
	public List <BoardVO> getArticleList() throws Exception
	{
		 List <BoardVO> mList = BoardDao.getInstance().selectList();			
		return mList;
	}
	
	public int getTotalCount() throws Exception {
		BoardDao dao = BoardDao.getInstance();
		return dao.pageCount();
	}
	
	public ArrayList<BoardVO> getPageList(int start,int length) throws Exception{
		BoardDao dao = BoardDao.getInstance();
		
		ArrayList<BoardVO> arraylist = dao.getPageList(start, length);
		return arraylist;
			
	}
		
}
