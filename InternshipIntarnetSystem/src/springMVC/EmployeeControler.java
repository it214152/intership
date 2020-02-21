package springMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeControler {

	@RequestMapping("/employee")
	public String eHome() {
	   return "employeetHome";
	}
	
	@RequestMapping("/employee/criteria")
	public String eCriteria() {
	   return "employeeCritiria";
	}
	
	@RequestMapping("/employee/news")
	public String eNews() {
	   return "employeetNews";
	}
	
	@RequestMapping("/employee/viewsapplications")
	public String eViewSApp() {
	   return "employeeViewCan";
	}
	
	@RequestMapping("/employee/viewapplications")
	public String eViewApps() {
	   return "employeeViewApps";
	}
	
	@RequestMapping("/employee/viewapplication")
	public String eViewApp() {
	   return "employeeViewApp";
	}

}
