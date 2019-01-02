package com.test.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@SuppressWarnings("serial")
public class SecondSession extends HttpServlet{

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException{
	
		HttpSession obj = req.getSession();
		
		String str = obj.getAttribute("name").toString();
		System.out.println(str);
	  PrintWriter out = res.getWriter();
	  out.println("Welcome"+" "+str);
	}
}
