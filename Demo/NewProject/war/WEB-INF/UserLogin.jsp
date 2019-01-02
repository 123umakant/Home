<%@page import static com.test.database.OfyService.ofy%>

<%@page import java.util.Iterator%>
<%@page import java.util.List%>
<%@page import java.io.IOException%>

<%@page import javax.servlet.ServletException %>
<%@page import javax.servlet.http.HttpServlet%>
<%@page import javax.servlet.http.HttpServletRequest %>
<%@page import javax.servlet.http.HttpServletResponse %>

<%@page import com.test.entity.StudentDetail %>



<html>
<body>
<%
    long Contact = Long.parseLong(req.getParameter("Contact")); 
     String Password =req.getParameter("Password");

   List<StudentDetail> contact_list = ofy().load().type(StudentDetail.class).id(Contact).now();
   List<StudentDetail>  password_list= ofy().load().type(StudentDetail.class).id(Password).now();

    Iterator<StudentDetail> password_itr = password_list.iterator(); 

     Iterator<StudentDetail> contact_itr = contact_list.iterator();

if(contact_itr.equals(Contact) && password_itr.equals(Password))
{
	
}
	




    %>
  </body>
</html>