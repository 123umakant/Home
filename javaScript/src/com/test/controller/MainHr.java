package com.test.controller;

import static com.test.database.OfyService.ofy;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.test.entity.MainHrEntity;
@SuppressWarnings("serial")
public class MainHr extends HttpServlet{
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		float TotalDays=0;
		
		      long TimeStamp = (System.currentTimeMillis());
           	  String Name =req.getParameter("name");
           	 float EmpSalary =Long.parseLong(req.getParameter("salary"));
           	 String  MonthName =req.getParameter("dropdown");
           	 float Nwd = Integer.parseInt(req.getParameter("nwd"));
		     float Hr = Integer.parseInt(req.getParameter("hr"));
		     float  Min= Integer.parseInt(req.getParameter("min"));
		     float Add = Integer.parseInt(req.getParameter("add"));
		     float Absent = Integer.parseInt(req.getParameter("absent"));
		    
		     float Advance = Integer.parseInt(req.getParameter("advance"));
		     float Utilise = Integer.parseInt(req.getParameter("utilise"));
		     
		    if(MonthName.equals("January"))
		    {
		    	 TotalDays=31; 
		    }
		    if(MonthName.equals("February"))
		    {
		    	 Calendar cal = Calendar.getInstance();
			        int days = cal.YEAR;
			        if( (0 == days % 4) && (0 != days % 100) || (0 == days % 400) )
			        {
			        	TotalDays = 29;
			      
			   	    }
			        else
			        {
			        	 TotalDays= 28;
			        }
			        
		    }
		    if(MonthName.equals("March"))
		    {
		    	 TotalDays =31; 
		    }
		    if(MonthName.equals("April"))
		    {
		    	 TotalDays=30; 
		    }
		    if(MonthName.equals("May"))
		    {
		    	 TotalDays=31; 
		    }if(MonthName.equals("June"))
		    {
		    	 TotalDays=30; 
		    }if(MonthName.equals("July"))
		    {
		    	 TotalDays=31; 
		    }if(MonthName.equals("August"))
		    {
		    	 TotalDays=31; 
		    }if(MonthName.equals("September"))
		    {
		    	 TotalDays=30; 
		    }if(MonthName.equals("October"))
		    {
		    	 TotalDays=31; 
		    }
		    if(MonthName.equals("Nevember"))
		    {
		    	 TotalDays=30; 
		    }
		    if(MonthName.equals("December"))
		    {
		    	 TotalDays=31; 
		    }
		     
		     
		     
		    float WorkingDays = TotalDays-Nwd;
		    float WorkedMin = WorkingDays*480;
		    float TotalWorkedDone = Hr*60+Min+Add;
		    float Sh_Ot = WorkedMin-TotalWorkedDone;
		    float  Sh_OtDays  = Sh_Ot/480;
		   float PresentDays =TotalDays-Absent-Sh_OtDays+Utilise; 
		  float Salary = (EmpSalary/TotalDays)*PresentDays;
		  float ActualSalary = Salary-Advance;
		 
		  MainHrEntity obj = new MainHrEntity(TimeStamp,Name,EmpSalary,Absent,MonthName,TotalDays,Nwd, WorkingDays, WorkedMin,TotalWorkedDone, Sh_Ot, Sh_OtDays, Utilise, PresentDays,Salary,Advance, ActualSalary);		  
	
		  ofy().save().entity(obj).now();
		  
		  
		  
	}
}
