package com.test.controller;

import static com.test.database.OfyService.ofy;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.entity.StudentDetail;

@SuppressWarnings("serial")
public class Login_Detail extends HttpServlet {
	
	
	public void doPost(HttpServletRequest req,HttpServletResponse res)
		throws IOException,ServletException	
	{
		
		String Name = req.getParameter("Name"); 
		long Contact = Long.parseLong(req.getParameter("Contact")); 
	        String Password =req.getParameter("Password");
	        String Confirm = req.getParameter("ConPassword");
	        
	        StudentDetail obj = new StudentDetail(Contact, Name, Password);
	      
	        if(Password.equals(Confirm))
	         {
	        
	          ofy().save().entity(obj).now();
	         }
	         else
	         {
	        	 
	         }
	        }
	}
	

