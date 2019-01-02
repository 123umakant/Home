package com.test.controller;


import static com.test.database.OfyService.ofy;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.entity.ReviewCredit;
public class unVerified  extends HttpServlet{

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		
		
		long value =Long.parseLong(req.getParameter("value")); 
		
		ReviewCredit obj = ofy().load().type(ReviewCredit.class).id(value).now();
	     
		  obj.setVerified(true);
		  ofy().save().entity(obj).now();
		
	res.sendRedirect("csv.jsp");
	}
	
}
