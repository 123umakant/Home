package com.test.controller;

import static com.test.database.OfyService.ofy;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.entity.StudentDetail;

@SuppressWarnings("serial")
public class UserDetail extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res)
		throws IOException,ServletException	
	{
		
		
		long Contact = Long.parseLong(req.getParameter("phone")); 
        StudentDetail contact_list = ofy().load().type(StudentDetail.class).id(Contact).now();
       
        if(contact_list==null)
        {
        	PrintWriter out = res.getWriter();
        	out.println("User Not found");
        }
        else
        {
        	PrintWriter out = res.getWriter();
        	out.println("User data found");
        
        }
	  
         }
	}
	
