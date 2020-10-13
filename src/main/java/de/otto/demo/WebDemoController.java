package de.otto.demo;
 

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebDemoController {
	
	@RequestMapping("first")
	public String firstPage() {
		return "index";
	}
	
//	@RequestMapping("add")
//	public String nextPage(HttpServletRequest req, HttpServletResponse res) {
//		System.out.println(req.getParameter("a")+req.getParameter("b") );
//		req.getSession().setAttribute("antwort", "params: " + req.getParameter("a")+req.getParameter("b") );
//		return "index.jsp";
//	}
	
	@RequestMapping("add")
	public ModelAndView nextPage(@RequestParam("param1") int a, @RequestParam("param2") int b) {
		ModelAndView model = new ModelAndView("index") ;
		model.addObject("antwort", "params: " + a + b);
		
		return model;
	}
	
	
	
//	@RequestMapping("add")
//	public String nextPage(int a, int b) {
//		System.out.println(a+b);
//		return "index.jsp";
//	}
	

}
