package org.sid.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	
	@RequestMapping(value="")
	public String Authenticate() {
		return "Login.html";
	}
	
	@RequestMapping("/Home")
	public String Home() {
		return "Home";
	}
	
	@RequestMapping(value="/auth",method=RequestMethod.POST)
	public String authentication(@RequestParam String username ,@RequestParam String password) {
			if(username.equals("hatim") & password.equals("123")) {
				return "redirect:/Home";
			}
			else {
				return "Login";
			}
	}
	
	
}
