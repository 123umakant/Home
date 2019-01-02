package com.test.controller;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@SuppressWarnings("serial")
public class FirstSession extends HttpServlet{
  
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		String str = req.getParameter("name");
		
		HttpSession obj = req.getSession();
		
		obj.setAttribute("name", str);
		res.sendRedirect("SecondSession");
		
	}
	
	
}
