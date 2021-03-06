package mybatis.guest.service;

import java.util.HashMap;
import java.util.List;

import mybatis.guest.session.EMPRepository;

public class EmpService {
	
	private static EmpService service;
	
	private EmpService() {}
	public static EmpService getInstance(){
		if( service == null) service = new EmpService();
		return service;
	}
	
	// DAO 역할? 마이바티스에서는 Repository 라고 한다.
	EMPRepository erepo = new EMPRepository();

	public List<HashMap> empSelect(){
		return erepo.empSelect();
	}
	
	public HashMap empView(HashMap map){
		return erepo.empView(map);
	}
	
	public int empInsert(HashMap map){
		return erepo.empInsert(map);
	}
	
	
	
	
	
}
	