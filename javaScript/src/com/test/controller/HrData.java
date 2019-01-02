package com.test.controller;
import static com.test.database.OfyService.ofy;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.test.entity.MainHrEntity;

public class HrData extends HttpServlet{
	
	public void doPost(HttpServletRequest req,HttpServletResponse res)
	throws IOException,ServletException	
	{
		
		String Name = req.getParameter("name");
		String Month =req.getParameter("dropDown");
		
		
				
		List<MainHrEntity> list=null;
		if(Name.equals("all"))
		{ 
			list = ofy().load().type(MainHrEntity.class).filter("MonthName", Month).list();
		   }
		else
			list = ofy().load().type(MainHrEntity.class).filter("Name", Name).filter("M onthName", Month).list();
		
		
	 if(list==null)
     {
     	PrintWriter out = res.getWriter();
     	out.println("User Not found");
     }
	 
		Iterator<MainHrEntity> itr = list.iterator();
		// Traversing elements
		while(itr.hasNext())
		{
			
			PrintWriter out = res.getWriter();
			
			MainHrEntity value=itr.next();
		    
			String name = value.getName();
		    out.println("Name = "+name);
			
		    float TotalDays =value.getTotalDays();
			out.println("Total Days = "+TotalDays);
			
			float   Sh_OtDays = value.getSh_OtDays();
			out.println("Sh/ot = "+Sh_OtDays);
			
			float Utilise= value.getUtilise();
			out.println("Utilise = "+Utilise);
			
			float PresentDays= value.getPresentDays();
			out.println(" Present Days = "+PresentDays);
			float Salary = value.getSalary();
			out.println(" Salary = "+Salary);
			float Advance= value.getAdvance();
			out.println(" Advance = "+Advance);
			float  ActualSalary = value.getActualSalary();
			out.println(" Actual Salary = "+ActualSalary);
		
			
						
		}	
	}
	
}
