package com.test.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Hr2  extends HttpServlet{
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
    {
		
		String EmpName = req.getParameter("EmpName");
		long Salary =Long.parseLong(req.getParameter("Salary"));
		PrintWriter out= res.getWriter();
		
		out.println("Employee Name = "+EmpName);
		out.println("Employee Fixed Salary = "+Salary);
		
		  HttpSession session = req.getSession();
	      session.setAttribute("Name",EmpName );
	      session.setAttribute("Salary",Salary );
		  res.sendRedirect("EmployeeWorkDetail.html");
		
		
		
	}

}
