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
<%@page import="com.test.entity.MainHrEntity"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
 
          String Name = request.getParameter("name");
          String Month =request.getParameter("month");

   MainHrEntity obj =ofy().load().type(MainHrEntity.class).filter("Name",Name).filter("MonthName", Month).first().now();
   if(obj==null)
   {%>
       <%=("User not found") %>
       <% }%>
       
   
   <form action="enter" method="get">
   <input type="hidden" name="timeStamp" Value="<%=obj.getTimeStamp() %>">
Enter Employee Name :<input type="text"  name="name" Value="<%=obj.getName() %>"><br><br>
Enter Month Name :<input type="text"  name="month" Value="<%=obj.getMonthName() %>"><br><br>
 Fixed Salary :<input type="text"  name="salary" Value="<%=obj.getEmp_Salary() %>"><br><br>
 Total_Work_Done :<input type="text"  name="Total_Work" Value="<%=obj.getTotalWorkedDone() %>"><br><br>
 Enter Non Working Days: <input type="text" name="nwd" Value="<%=obj.getNwd() %>"><br><br>
 Absent:<input type="text"   name="absent" Value="<%=obj.getAbsent() %>"><br><br>
 Advance:<input type="text" name="advance" Value="<%=obj.getAdvance() %>"><br><br>
 Utilize:<input type="text" name="utilise" Value="<%=obj.getUtilise() %>">
 <input  type="submit" name="submit">
 
</form>
   
   
   
   
         
</body>
</html>