
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
<table border="1"  style="border-collapse: collapse;" >
<thead>
<th>A<br>Total Days</th>
<th>B<br>Non Working Days </th>
<th>C<br>Working Days</th>
<th>D<br>Working Days Min</th>
<th>E<br>System Time</th>
<th>F<br>Sh/Ot Min</th>
<th>G<br>Sh/ot Days</th>
</thead>

     <% 
        String Name = request.getParameter("emp_name");
		String Month =request.getParameter("month");
		
	List<MainHrEntity> list = ofy().load().type(MainHrEntity.class).filter("Name",Name).filter("MonthName", Month).list();
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
       <td><%=value.getTotalDays()%></td>
		<td><%=value.getNwd()%></td>
		<td><%=value.getWorkingDays()%></td>
		<td><%=value.getWorkedMin()%></td>
		<td><%=value.getTotalWorkedDone()%></td>
		<td><%=value.getSh_Ot()%></td>
		<td><%=value.getSh_OtDays()%></td>
		</tr>
<%}%>
</table>
</body>
</html>