package guest.service;

import java.util.List;

import guest.model.Message;
import guest.model.MessageDao;
import guest.model.MessageException;

public class ListMessageService {

	//-------------------------------------------------------------------
	private int totalRecCount;		// 전체 레코드 수	
	private int pageTotalCount;		// 전체 페이지 수
	private int countPerPage = 3;	// 한페이지당 레코드 수
	
	private static ListMessageService instance;
	
	public static ListMessageService	getInstance() throws MessageException
	{
		if( instance == null )
		{
			instance = new ListMessageService();
		}
		return instance;
	}
	
	private ListMessageService()
	{
		
	}
	
	public List <Message> getMessageList(String pNum) throws MessageException
	{
		int pageNum = 1;
		if(pNum != null) {
		pageNum = Integer.parseInt(pNum);
		}
		/*
			pageNum 1	2	3	4	5	6 	7	 8		9
			startRow0	3	6	9	12	15	18	21		24	pageNum*3-3
			countPerPage3	3	3	3
		*/
		// rownum 사용시
//		int firstRow = (pageNum*countPerPage)-(countPerPage-1);
//		int endRow = pageNum*countPerPage;
		
		int startRow = (pageNum*countPerPage)-countPerPage;
		
		
		// 전체 레코드를 검색해 온다면
//		List <Message> mList = MessageDao.getInstance().selectList(firstRow,endRow);			
		
		// 한 페이지당 3개의 레코드만 받아온다면
//		List <Message> mList = MessageDao.getInstance().selectList(firstRow,endRow);			
		List <Message> mList = MessageDao.getInstance().selectList(startRow,countPerPage);			
		return mList;
	}
	
	public int getTotalCount() throws MessageException{
		// 데이터베이스에서 실제 레코드 수 받아오기
		totalRecCount = MessageDao.getInstance().getTotalCount();
		// 전체 페이지 수(pageTotalCount)		
  		if(totalRecCount/countPerPage == 0){
			pageTotalCount = (totalRecCount/countPerPage);
		}else{
			pageTotalCount = (totalRecCount/countPerPage)+1;
		}
		return pageTotalCount;
		
	}
	
}
