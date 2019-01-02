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
<table border="1" style="border-collapse: collapse;" width="100%">
<thead>
<th>A<br>Name</th>
<th>B<br>Total Salary</th>
<th>C<br>Total Days</th>
<th>D<br>Absent</th>
<th>E<br>Shortage/OverTime </th>
<th>F<br>Utilise</th>
<th>G<br>Present</th>
<th>H<br>Salary</th>
<th>I<br>Advance</th>
<th>J<br>ActualSalary</th>
<th>k<br>Edit</th>

</thead>

     <% 
        String Name = request.getParameter("name");
		String Month =request.getParameter("dropDown");
		
		List<MainHrEntity> list=null;
		if(Name.equals("all"))
		{ 
			list = ofy().load().type(MainHrEntity.class).filter("MonthName", Month).list();
		   }
		else{
		
	        list = ofy().load().type(MainHrEntity.class).filter("Name",Name).filter("MonthName", Month).list();
		}
		
	 if(list==null)
     {
		 %>
     	<%="User Not found"%>
    <%}%>
	 <% 
		Iterator<MainHrEntity> itr = list.iterator();
		
		while(itr.hasNext())
		{
	    MainHrEntity value=itr.next();
      %>
      <tr>
       <td style="text-align: center; vertical-align: middle;"> <%= value.getName()%></td>
       <td style="text-align: center; vertical-align: middle;"> <%= value.getEmp_Salary()%></td>
		<td style="text-align: center; vertical-align: middle;"><%=value.getTotalDays()%></td>
		<td style="text-align: center; vertical-align: middle;"><%=value.getAbsent() %></td>
       <td style="text-align: center; vertical-align: middle;"><%=value.getSh_OtDays()%></td>
		<td style="text-align: center; vertical-align: middle;"><%=value.getUtilise()%></td>
		<td style="text-align: center; vertical-align: middle;"><%=value.getPresentDays()%></td>
		<td style="text-align: center; vertical-align: middle;"><%=value.getSalary()%></td>
		<td style="text-align: center; vertical-align: middle;"><%=value.getAdvance()%></td>
		<td style="text-align: center; vertical-align: middle;"><%=value.getActualSalary()%></td>
		<td><form action="edit.jsp" method="post">
		  <input type="hidden" name="name" value="<%=value.getName()%>">
		  <input type="hidden" name="month"  value="<%=Month%>">
	          <input type="submit" value="Edit">	
		</form></td>
		</tr>
<%}%>
</table>
<br>Shortage_OverTime Table<br>
<table border="1"  style="border-collapse: collapse;" width="100%">
<thead>
<th>A<br>Emp_Name</th>
<th>B<br>Total Days</th>
<th>C<br>Non Working Days </th>
<th>D<br>Working Days</th>
<th>E<br>Working Days Min</th>
<th>F<br>System Time</th>
<th>G<br>Sh/Ot Min</th>
<th>H<br>Sh/ot Days</th>
</thead>

     <% 
        String Name1 = request.getParameter("emp_name");
		String Month1 =request.getParameter("month");
		if(Name.equals("all"))
		{ 
			list = ofy().load().type(MainHrEntity.class).filter("MonthName", Month).list();
		   }
		else{
		
	        list = ofy().load().type(MainHrEntity.class).filter("Name",Name).filter("MonthName", Month).list();
		}
		
		
	 if(list==null)
     {
		 %>
     	<%="User Not found"%>
    <%}%>
	 <% 
		Iterator<MainHrEntity> itr1 = list.iterator();
		
		while(itr1.hasNext())
		{
	    MainHrEntity value=itr1.next();
      %>
      <tr>
      
      <td style="text-align: center; vertical-align: middle;"> <%= value.getName()%></td>
       <td style="text-align: center; vertical-align: middle;"><%=value.getTotalDays()%></td>
		<td style="text-align: center; vertical-align: middle;"><%=value.getNwd()%></td>
		<td style="text-align: center; vertical-align: middle;"><%=value.getWorkingDays()%></td>
		<td style="text-align: center; vertical-align: middle;"><%=value.getWorkedMin()%></td>
		<td style="text-align: center; vertical-align: middle;"><%=value.getTotalWorkedDone()%></td>
		<td style="text-align: center; vertical-align: middle;"><%=value.getSh_Ot()%></td>
		<td style="text-align: center; vertical-align: middle;"><%=value.getSh_OtDays()%></td>
		</tr>
<%}%>
</table>


</body>
</html>