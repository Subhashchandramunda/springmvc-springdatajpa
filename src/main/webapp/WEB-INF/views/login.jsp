<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<b>Login Details</b>
 <form:form action="addnewlogin" method="post" modelAttribute="user">
 
  <table>
    <tr>
       <td>Enter the UserName</td>
       <td><input type="text" name="username" value=""></td>
     </tr>
     <tr>
       <td>Enter the password</td>
       <td><input type="password" name="password" value=""></td>
     </tr>
     <tr>
       <td><input type="submit" value="Login"></td>
       <td><input type="reset" value="Cancel"></td>
     </tr> 
      
  </table>
  
 </form:form>
 <form action=""></form>
  
</body>
</html>