package springMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentControler {
	
	@RequestMapping("/student")
	public String sHome() {
	   return "studentHome";
	}
	
	@RequestMapping("/student/criteria")
	public String sCriteria() {
	   return "studentCritiria";
	}
	
	@RequestMapping("/student/news")
	public String sNews() {
	   return "studentNews";
	}
	
	@RequestMapping("/student/singup")
	public String sSingUp() {
	   return "studentSignup";
	}
	
	@RequestMapping("/student/cv")
	public String sCV() {
	   return "studentNewCV";
	}
	
	@RequestMapping("/student/viewinternships")
	public String sViewApps() {
	   return "studentViewApp";
	}
	
	@RequestMapping("/student/viewintership")
	public String sViewApp() {
	   return "viewApp";
	}
	
}
