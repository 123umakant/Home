<%@page import="com.test.entity.MainHrEntity"%>
<%@page import="java.util.Calendar"%>
<%@page import="static com.test.database.OfyService.ofy"%>
<%@page import="java.io.IOException"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="javax.servlet.ServletException"%>
<%@page import="javax.servlet.http.HttpServlet"%>
<%@page import="javax.servlet.http.HttpServletRequest"%>
<%@page import="javax.servlet.http.HttpServletResponse"%>
<%@page import="com.test.entity.ReviewCredit"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="csv.jsp" method="get">
  <select name="select1">
  <option id=0 value="Google">Google</option>
  <option id=1 value="Facebook" >FaceBook</option>
  </select><br><br>
<select name="select2">
  <option id=0 value="true">Verified</option>
 <option id=1 value="false">UnVerified</option>
 </select><br><br>
 <input type="submit" value="Submit">
</form><br><br>

<table border="1"  style="border-collapse: collapse;" width="100%" cellpadding="10px"  >
    <thead>
    <th>Serial No.<br></th>
    <th>Tutor Contact<br></th>
    <th>Date<br></th>
    <th>Credit Given<br></th>
    <th>Review On<br></th>
    <th>Verified<br></th>
    </thead>
 
<% 
      int count=1;
String str1 =   request.getParameter("select1");
boolean str2=Boolean.parseBoolean(request.getParameter("select2"));
int pag=Integer.parseInt(request.getParameter("page"));
List<ReviewCredit> list	 =null;
if(str1==null&&request.getParameter("select2")==null)
	
{list= ofy().load().type(ReviewCredit.class).list();
}else
	list = ofy().load().type(ReviewCredit.class).filter("review_on", str1).filter("verified", str2).list();
	  

	Iterator<ReviewCredit> itr = list.iterator();
	// Traversing elements
	while(itr.hasNext())
	{
		
		ReviewCredit value=itr.next();
	    %>
	    <tr>
	    <td style="text-align: center; vertical-align: middle;"><%=count++%></td>
		<td style="text-align: center; vertical-align: middle;"><%=value.getTutor_Contact() %></td>
		<td style="text-align: center; vertical-align: middle;"><%=value.getDate() %></td>
		<td style="text-align: center; vertical-align: middle;"><%=value.getCredits_Given() %></td>
		<td style="text-align: center; vertical-align: middle;"><%=value.getReview_on() %></td>
		 <%
		   boolean  val= value.isVerified();
		    if(val==true)
		    {
		    %>
		    	<td style="text-align: center; vertical-align: middle;"><%= "Verified" %></td>
		    <% } %>
		   
		  <% 
		    if(val!=true)
		    {
		    %>
		    	   		      
		      <form action="unVerified" method="post">
		       <input type="hidden" name="value" value="<%=value.getId()%>">
		       <td style="text-align: center; vertical-align: middle;"><input type="submit" value="Not Verified"></td>   
		      </form>
		  
		    <% } %>
		   
		  
		</tr>
		  
<% }%>
</table><br><br>

 
</body>
</html>