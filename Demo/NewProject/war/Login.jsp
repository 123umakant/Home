<%@page import="static com.test.database.OfyService.ofy" %>
<%@page import="java.io.IOException" %>
<%@page import="javax.servlet.ServletException" %>
<%@page import="javax.servlet.http.HttpServlet" %>  
<%@page import="javax.servlet.http.HttpServletRequest" %>
<%@page import="java.io.PrintWriter" %>
<%@page import="java.util.Iterator" %>
<%@page import="java.util.List" %>
<%@page import="com.test.entity.StudentDetail" %>
<%@page import="javax.servlet.http.HttpServlet" %>
   <html>
   <body>
  <table border="2">
   <tr>
   
        <td>Name</td>
        <td>Contact</td>
       </tr>
<% 
List<StudentDetail> list =ofy().load().type(StudentDetail.class).list();
Iterator<StudentDetail> itr = list.iterator();
// Traversing elements

while(itr.hasNext())	
{
	 StudentDetail value=itr.next();
	%> 
		<tr><td><%=value.getName() %></td>
        <td><%=value.getContact() %></td></tr>
      
<% }%>	
</table>
 

</body>  
</html>  