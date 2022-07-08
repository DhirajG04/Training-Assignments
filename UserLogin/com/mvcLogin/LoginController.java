package com.mvcLogin;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mvc.service.ServiceCalculate;

@Controller
public class LoginController {

	@RequestMapping
	public ModelAndView Login(HttpServletRequest request,HttpServletRequest response) {
//		
//		String user=request.getParameter("username");
//		String pass=request.getParameter("password");
//		String mail=request.getParameter("email");
		
		
		ModelAndView modelAndView= new ModelAndView();
		
		if(login.getUsername.equals("dhiraj") && login.getPassword.equals("dhiraj123") 
				&& login.getEmail.equals("dhiraj@gmail.com")) {
		
			modelAndView.setViewName("success.jsp");
			modelAndView.addObject("success", success);
			return "welcome";
		}else {
			modelAndView.setViewName("error.jsp");
			modelAndView.addObject("error", error);
			return modelAndView;
		}
		
		
	}
	
}
