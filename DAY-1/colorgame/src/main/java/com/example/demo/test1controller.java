package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;


@Controller
public class test1controller {
	
	@GetMapping("/")
	public String hello(HttpServletRequest req) {
		String color=req.getParameter("color");
		HttpSession session = req.getSession();
		session.setAttribute("displayName",color);
		return "newfile1.jsp";
	}
}