package ex2_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("dao")
public class MemberDAO {
	
	// 알아서 값 받아와줘?
	@Autowired
	private MemberBean member;
	
	// 1) setter
//	public void setMember(MemberBean member) {
//		this.member = member;
//	}
	
//	// 2) constructor
//	public MemberDAO() {
//		
//	}
//	public MemberDAO(MemberBean member) {
//		this.member = member;
//	}
	
	public void insert() {
		member.output();
	}
}
