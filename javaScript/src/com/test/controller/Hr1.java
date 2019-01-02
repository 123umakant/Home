package com.test.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@SuppressWarnings("serial")
public class Hr1 extends HttpServlet{

    @SuppressWarnings("static-access")
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
    {
    	
        
         float  Selected =Integer.parseInt(req.getParameter("dropdown"));
        float Days =Integer.parseInt(req.getParameter("days"));
        float Hr =Integer.parseInt(req.getParameter("hr"));
        float Min =Integer.parseInt(req.getParameter("min"));
        float Add =Integer.parseInt(req.getParameter("add"));
    
        
        Calendar cal = Calendar.getInstance();
        int days = cal.YEAR;
        if( (0 == days % 4) && (0 != days % 100) || (0 == days % 400) )
        {
            Selected = 29;
      
   	      
	    
        }
        PrintWriter out = res.getWriter();
        
        
                  
         HttpSession session = req.getSession();
          String Name = (String) session.getAttribute("Name");
          out.println("Employee Name  = "+Name);
        
         long Salary = (long) session.getAttribute("Salary");
         out.println("Employee Fixed Salary  = "+Salary);
         session.setAttribute("TotalDays",Selected );
        
         out.println("Total Days  = "+Selected);
         
      float WorkingDays = Selected-Days; 
      out.println("Working Working  Days = "+ WorkingDays);
      
      float TotalWorking = WorkingDays*480;
      out.println("Total working in Min = "+TotalWorking);
      session.setAttribute("TotalWorking", TotalWorking);
      
      float AddHr = Hr*60+Min+Add;
       out.println("Total Working + Additional Hours & min = "+AddHr+" min");
       session.setAttribute("AddHr",AddHr );
       
       
   if(TotalWorking<=AddHr)
   {
       
    	   float OverTime = TotalWorking-AddHr;
    	   float OverTimeMin = OverTime;
    	   out.println("OverTime in Min = "+OverTimeMin+"min");
    	  
 	      float ExtraDays = OverTime/480;
            out.println("Extra  Days = "+ExtraDays);
            
          }
       
   else
       {
       	   float TimeRemaining =  AddHr-TotalWorking;
       	   
       	   float TimeRemainingMin = TimeRemaining;
            out.println("Remaining Working in Min "+TimeRemainingMin+" min");
           
            float TimeRemainingDays = TimeRemaining/480;
	         out.println("Remaining Working Days "+TimeRemainingDays);
	        
	     }
       
           res.sendRedirect("EmployeeWorkDetail3.html");
    
    }
        }

