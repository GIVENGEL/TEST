package sample;

public class EmpVO {
// 	1) db 테이블(Employee)의 컬럼연동할 변수 선언 (동일한 변수명과 타입).
//  주민번호, 학번, 전화번호 등은 숫자이지만 숫자형으로 만들지 않는다.
//	이유는 연산이 되기 때문이다. 
	private int eno;
	private String ename;
	private String job;
	private int manager;
	private String hiredate;
	private int salary;
	private int commission;
	private int dno;
	
	// 2) getter//setter 생성
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getManager() {
		return manager;
	}
	public void setManager(int manager) {
		this.manager = manager;
	}
	public String getHiredate() {
		return hiredate;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getCommission() {
		return commission;
	}
	public void setCommission(int commission) {
		this.commission = commission;
	}
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	
	
}
