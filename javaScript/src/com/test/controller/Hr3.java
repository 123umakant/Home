package com.test.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Hr3 extends HttpServlet{
	
	
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		
		PrintWriter out= res.getWriter();
	    
		int Absent =Integer.parseInt((req.getParameter("Absent")));
		int Utilise =Integer.parseInt((req.getParameter("Utilise")));
		int AdvancePay =Integer.parseInt((req.getParameter("AdvancePay")));
	    
		
		 HttpSession session = req.getSession();
		
		 
	        String Name = (String) session.getAttribute("Name");
	          out.println("Employee Name  = "+Name);
	        
	         long Salary = (long) session.getAttribute("Salary");
	         out.println("Employee Fixed Salary  = "+Salary);
	         float Selected = (float) session.getAttribute("TotalDays");
	        
	         float TotalWorking = (float) session.getAttribute("TotalWorking");
	         float AddHr = (float) session.getAttribute("AddHr");
	         
	    out.println("Total Days = "+Selected);  
		out.println(" Absent = "+Absent);
		out.println("Utilise Leaves= "+Utilise);
		out.println("AdvancePay = "+AdvancePay);
		
		 if(TotalWorking<=AddHr)
		   {
		       
		    	   float OverTime = TotalWorking-AddHr;
		    	   float OverTimeMin = OverTime;
		    	   out.println("OverTime in Min = "+OverTimeMin+"min");
		    	  
		    	   float PresentDay1 = (Selected*480)-(Absent*480)-OverTimeMin+Utilise*480;
		    	   out.println("Present Day  "+PresentDay1+" min");
		    	   
		    	   float PresentDays =PresentDay1/480; 
		    	   out.println("Present Day  "+PresentDays+" Days");
		    	   
		    	   long Salary1 = (long) session.getAttribute("Salary");
		            float  WorkSalary = (Salary1/Selected)*PresentDays;       
		            out.println("Work Salary = " +WorkSalary);
		      float  SalaryGiven = WorkSalary-AdvancePay;
		      out.println("Salary Of Employee = "+SalaryGiven);
		   }
		       
		   else
		       {
		       	   float TimeRemaining =  AddHr-TotalWorking;
		       	   
		       	   float TimeRemainingMin = TimeRemaining;
		            out.println("Remaining Work in Min "+TimeRemainingMin+" min");
		            
		            float PresentDay2 = (Selected*480)-(Absent*480)-TimeRemainingMin+Utilise*480;     
		            out.println("Present Days   "+PresentDay2+" min");
		           
		               float PresentDays =PresentDay2/480; 
			    	   out.println("Present Day  "+PresentDays+" Days");
			    	   
		            long Salary1 = (long) session.getAttribute("Salary");
		            float  WorkSalary = (Salary1/Selected)*PresentDays;
		            out.println("Work Salary = " +WorkSalary);
		       
		            float  SalaryGiven = WorkSalary-AdvancePay;
				      out.println("Salary Of Employee = "+SalaryGiven);
		       }
		 
		
		 
		
		 }
	
}
