package com.test.controller;


import static com.test.database.OfyService.ofy;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.opencsv.CSVReader;
import com.test.entity.ReviewCredit;;

@SuppressWarnings("serial")
public class CSVParser extends HttpServlet {

@SuppressWarnings("null")
public void doGet(HttpServletRequest req, HttpServletResponse res)
    throws IOException {
	
	
	  
        @SuppressWarnings("resource")
		CSVReader reader = new CSVReader(new FileReader("Reviews.csv"));
        String [] nextLine;
        PrintWriter pw=res.getWriter();
        int count=0;
        String str="";
        while ((nextLine = reader.readNext()) != null) {
           // nextLine[] is an array of values from the line
         
        	try{ 
        		
        		ReviewCredit contact_list = ofy().load().type(ReviewCredit.class).filter("tutor_Contact", Long.parseLong(nextLine[0])).first().now();
        	       
        	    if(contact_list==null)
        	        {
        	         count++;
        	    	ReviewCredit obj = new ReviewCredit(Long.parseLong(nextLine[0]), nextLine[1], Integer.parseInt(nextLine[2]), nextLine[3],Boolean.parseBoolean(nextLine[4]));
        	    		
        	    		ofy().save().entity(obj).now();
        	        
        	        }
        	        else
        	        {
        	        	
             	        	str+=nextLine[0]+",";
        	        	 
        	        	 
        	    }
        		  }
          catch(Exception c){
        	     pw.println(" Tutor number = "+count);
          }
        
        }  
    
   }
}