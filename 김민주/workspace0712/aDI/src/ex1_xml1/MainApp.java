package ex1_xml1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		//------------------------------------------------
		// 0 . POJO 순수 자바  // 자바클래스를 뜻한다.
//			MessageBean bean1 = new MessageBeanKoImpl();
//			bean1.sayHello("홍길동");
//			
//			MessageBean bean2 = new MessageBeanEngImpl();
//			bean2.sayHello("john");

		
		//------------------------------------------------
		// 1. DI 
		// 먼저 스프링 컨테이너 불러오기(xml 파일[스프링컨테이너 설정] 연동)
		// 만약 ApplicationContext.xml에 연동할 시 scope 타입에 따라 객체생성의 방식이 달라진다.
		ApplicationContext context = new ClassPathXmlApplicationContext("ex1_xml1/applicationContext.xml");
		// 오브젝트형을 클래스형으로 선언하는 2가지 방법
		// 1. (클래스타입)
		// scope singleton 이기 때문에 ApplicationContext(연동파일?) 선언시 한번 객체 생성해준다.
		System.out.println("-------start-----------");
		MessageBean b1 = (MessageBean)context.getBean("ko");
		b1.sayHello("홍길자");
		// 2. (가져올 객체,클래스명.class)
		System.out.println("-------start-----------");
		// scope prototype 이기 때문에 각 클래스의 객체를 선언 할때마다 객체 생성한다.
		MessageBean b2 = context.getBean("eng",MessageBean.class);
		b2.sayHello("Mark");
		MessageBean b3 = context.getBean("eng",MessageBean.class);
		b3.sayHello("John");
		
	}

}
