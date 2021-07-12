package mybatis.guest.service;

import java.util.HashMap;
import java.util.List;

import mybatis.guest.model.Comment;
import mybatis.guest.session.CommentRepository;

public class CommentService {
	
	private static CommentService service;
	
	private CommentService() {}
	public static CommentService getInstance(){
		if( service == null) service = new CommentService();
		return service;
	}
	
	// DAO 역할? 마이바티스에서는 Repository 라고 한다.
	CommentRepository repo = new CommentRepository();
	
	public Integer insertComment(Comment c) {
		return repo.insertComment(c);
	}
	
	
	public List<Comment> selectComment(HashMap map){
		return repo.selectComment(map);
	}
	
	public Comment selectCommentByPK(long commentNo) {
		return repo.selectCommentByPK(commentNo);
	}


	public Integer modifyComment(String content,String no ) {
		int commentNo = Integer.parseInt(no);
		return repo.modifyComment(content,commentNo);
	}
	
	
	
	
}
	