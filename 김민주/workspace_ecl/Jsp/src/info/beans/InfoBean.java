package info.beans;

public class InfoBean {
	
	private String name;
	private String id;
		
	public String getGender() {
		
		char sexNum = id.charAt(7); // 아이디의 7번째 숫자가 1 or 3이라면
		if(sexNum=='1' || sexNum=='3') {
			return "남자";
		}else
			return "여자";
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	
	
}
