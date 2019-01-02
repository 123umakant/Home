package com.test.controller;
import static com.test.database.OfyService.ofy;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.test.entity.CallLog;


public class Call extends HttpServlet{
	
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		
		String str=request.getParameter("test").replace("\\\"", "\""); 
		String strs=str.substring(2,str.length()-1);
		String jsons[] = strs.split("<");
		
		for(String json:jsons)
		{
			
			try {
				JSONObject	list = new JSONObject(json);
				
				long id=(long)(Double.parseDouble(list.get("uniqueid").toString())*1000);
			
				
				String src = list.get("src").toString();
				String dst = list.get("dst").toString();
				int duration = Integer.parseInt(list.get("duration").toString());
				String disposition =list.get("disposition").toString(); 
				String calldate =list.get("calldate").toString(); 
				  
	   	CallLog obj = new CallLog(id,calldate,src, dst, duration,disposition );
				
		   	 ofy().save().entity(obj).now();
				 
			} 
			catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  
		}
		
	        }

}
