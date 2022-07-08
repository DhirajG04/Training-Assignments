package com.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mvc.service.ServiceCalculate;

@Controller
public class CalculateController {

	@RequestMapping("/cal")
	public ModelAndView Calculate(HttpServletRequest request,HttpServletRequest response) {
		
		double p=Double.parseDouble(request.getParameter("priciple"));
		
		double t=Double.parseDouble(request.getParameter("year"));
		
		double r=Double.parseDouble(request.getParameter("rate"));
		
		
		ServiceCalculate serviceCalculate= new ServiceCalculate(); 
		
		double result=serviceCalculate.calculate(p,t,r);
		
		
		ModelAndView modelAndView= new ModelAndView();
		modelAndView.setViewName("simpleInterest.jsp");
		modelAndView.addObject("result", result);
		
		return modelAndView;
	}
	
	
}
