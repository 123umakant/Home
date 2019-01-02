package com.test.controller;

import static com.test.database.OfyService.ofy;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import com.test.entity.ReviewCredit;


@SuppressWarnings("serial")
public class ClientReviewCredit extends HttpServlet  {

	public void doGet (HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
		
		ReviewCredit obj = new ReviewCredit(9643600969L,"10-02-2018", 3,"google",true);
		
		ofy().save().entity(obj).now();
			
	}

}