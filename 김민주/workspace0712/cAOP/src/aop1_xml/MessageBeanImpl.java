package aop1_xml;

public class MessageBeanImpl implements MessageBean {

	@Override
	public void sayHello() {
		System.out.println("syHello() 호출");
	}

	@Override
	public void engSayHello() {
		System.out.println("engSayGello() 호출");
	}

	@Override
	public void test() {
		System.out.println("test() 호출");
	}

}
