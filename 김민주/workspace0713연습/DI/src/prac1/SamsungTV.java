package prac1;

public class SamsungTV implements TV{

	
	// 소니스피커의 메소드를 이용해서 사용하기때문에 소니스피커타입의 변수를 멤버변수로 선언한다.
	private SonySpeaker sony;
	
	public SamsungTV() {
		System.out.println("===>삼성티비 객체생성");
	}
	
	public SamsungTV(SonySpeaker sony) {
		System.out.println("===>삼성티비(2) 객체생성");
		this.sony=sony;
	}
	
	
	
	public void powerOn() {
		System.out.println("===>삼성티비 전원 켬");
		
	}

	public void powerOff() {
		System.out.println("===>삼성티비 전원 끔");
		
	}

	public void volumeUp() {
		//소니스피커를 이용해 작동
		sony.volumeUp();
	}

	@Override
	public void volumeDown() {
		//소니스피커를 이용해 작동
		sony.volumeDown();
	}

}
