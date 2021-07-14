package sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/start.do")
	public ModelAndView test() {
		System.out.println("start.do 요철됨");
		
		ModelAndView mv = new ModelAndView();
		/* mv.setViewName("/WEB-INF/view/hello.jsp"); */
		mv.setViewName("hello");
		mv.addObject("name","홍길동");
		mv.addObject("message","오들은 뭐 먹징?");
		
		return mv;
	}
	
}
