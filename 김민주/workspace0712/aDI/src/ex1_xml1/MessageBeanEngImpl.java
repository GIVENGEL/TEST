package ex1_xml1;

public class MessageBeanEngImpl implements MessageBean {
	
	public MessageBeanEngImpl() {
		System.out.println("MessageBeanEngImpl 생성자");
	}

	public void sayHello(String name) {
		System.out.println("Hello~" + name);
		
	}

}
