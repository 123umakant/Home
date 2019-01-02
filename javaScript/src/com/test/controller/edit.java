package com.test.controller;

import static com.test.database.OfyService.ofy;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.entity.MainHrEntity;
public class edit extends HttpServlet{
	
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException{
		float TotalDays=0;
		long TimeStamp = Long.parseLong(req.getParameter("timeStamp"));
		String Name = req.getParameter("name");
		float EmpSalary = Float.parseFloat(req.getParameter("salary"));
		String MonthName = req.getParameter("month");
		float Total_Work  = Float.parseFloat(req.getParameter("Total_Work"));
		float Nwd = Float.parseFloat(req.getParameter("nwd"));
		float Absent = Float.parseFloat(req.getParameter("absent"));
		float Advance = Float.parseFloat(req.getParameter("advance"));
		float Utilize = Float.parseFloat(req.getParameter("utilise"));
    
		
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
		    float TotalWorkedDone = Total_Work;
		    float Sh_Ot = WorkedMin-TotalWorkedDone;
		    float  Sh_OtDays  = Sh_Ot/480;
		   float PresentDays =TotalDays-Absent-Sh_OtDays+Utilize; 
		  float Salary = (EmpSalary/TotalDays)*PresentDays;
		  float ActualSalary = Salary-Advance;

		
		
		MainHrEntity obj = new MainHrEntity();
		
		obj.setTimeStamp(TimeStamp);
		obj.setName(Name);
		obj.setEmp_Salary(EmpSalary);
		obj.setMonthName(MonthName);
		obj.setWorkingDays(WorkingDays);
		obj.setSalary(Salary);
		obj.settotalWorkedDone(Total_Work);
		obj.setSh_Ot(Sh_Ot);
		obj.setSh_OtDays(Sh_OtDays);
		obj.setPresentDays(PresentDays);
		obj.setNwd(Nwd);
		obj.setAbsent(Absent);
		obj.setActualSalary(ActualSalary);
		obj.setAdvance(Advance);
        obj.setUtilise(Utilize);
        obj.setTotalDays(TotalDays);
        obj.setWorkedMin(Total_Work);
        
        ofy().save().entity(obj).now();
        
        
		PrintWriter out= res.getWriter();
        out.println("Udate Successful");    
	
	
	}

}
