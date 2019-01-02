package com.test.controller;

import static com.test.database.OfyService.ofy;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.repackaged.com.google.protobuf.proto1api.Timestamp;
import com.test.entity.PaymentEntry;
import com.test.entity.ReviewCredit;



public class PaymentEntryServlet extends HttpServlet {

	
	 public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	 {
		 int TotalDays=0;
		 int year = Calendar.getInstance().get(Calendar.YEAR);
		 PrintWriter out = res.getWriter();
		 
		 String empName =req.getParameter("empName");
		 String dropdown = req.getParameter("dropdown");
		 
		 if(dropdown.equals("January"))
		    {
			 
		       
		    	 String to="01-01-"+year;
		    	 String from = "31-01-"+year;
		    	 
				    out.println(to);
				    out.println(from);
		    	 
		    }
		    if(dropdown.equals("February"))
		    {
		    	 Calendar cal = Calendar.getInstance();
			        int days = cal.YEAR;
			        if( (0 == days % 4) && (0 != days % 100) || (0 == days % 400) )
			        {
			        	
			        	 String to="01-02-"+year;
				    	 String from = "29-02-"+year;
				    
			   	    }
			        else
			        {
			        	 String to="01-02-"+year;
				    	 String from = "28-02-"+year;
				    	 
			      
			        }
			        
		    }
		    if(dropdown.equals("March"))
		    {
		    	
		    	 String to="01-03-"+year;
		    	 String from = "31-03-"+year;
		    	 
	      
		    }
		    if(dropdown.equals("April"))
		    {
		    	
		        String to="01-04-"+year;
		    	 String from = "30-04-"+year;
		    	
		    	 
		    }
		    if(dropdown.equals("May"))
		    {
		    	
		        String to="01-05-"+year;
		    	 String from = "31-05-"+year;
		    	
		    	 
		    	 
		    }
		    if(dropdown.equals("June"))
		    {
		    	 
		    	 
			        String to="01-06-"+year;
			    	 String from = "30-06-"+year;
			    	
		    }
		    if(dropdown.equals("July"))
		    {
        		    	  
        		    	 
        			        String to="01-07-"+year;
        			    	 String from = "31-07-"+year;
        			    	
		    }
		    if(dropdown.equals("August"))
		    {
		    	  
		    	 
			        String to="01-08-"+year;
			    	 String from = "31-08-"+year;
			    	 
		    }
		    
		    if(dropdown.equals("September"))
		    {
		    	 
		    	 
			        String to="01-09-"+year;
			    	 String from = "30-09-"+year;
			    	
		    }
		    if(dropdown.equals("October"))
		    {
		    	
		        String to="01-10-"+year;
		    	 String from = "31-10-"+year;
		    	 
		    }
		    if(dropdown.equals("Nevember"))
		    {
		    	
		        String to="01-11-"+year;
		    	 String from = "30-11-"+year;
		    	
		    }
		    if(dropdown.equals("December"))
		    {
		    	
		         String to="01-12-"+year;
		    	String  from = "31-12-"+year;
		    	
		    }
		   
            //List<PaymentEntry> list = ofy().load().type(PaymentEntry.class).filter("contact",empName ).list();
		    
            //list.get
		 
	 }
}
