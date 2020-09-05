<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<b>Add User Details</b>
 <form:form action="newregisteration" method="post" modelAttribute="user">
  
   <table>
     <tr>
       <td>Enter FirstName</td>
       <td><form:input firstName="firstName" path="firstName" name="firstName"/></td>
    </tr>  
    <tr>
       <td>Enter LastName</td>
       <td><form:input lastName="lastName" path="lastName" name="lastName"/></td>
    </tr>  
    <tr>
       <td>Enter EmailId</td>
       <td><form:input email="email" path="email" name="email"/></td>
    </tr>  
    <tr>
       <td>Enter MobileNo</td>
       <td><form:input mobileNo="mobileNo" path="mobileNo" name="mobileNo"/></td>
    </tr>
    <tr>
       <td>Enter the UserName</td>
       <td><input type="text" name="username" value=""></td>
     </tr>
     <tr>
       <td>Enter the password</td>
       <td><input type="password" name="password" value=""></td>
     </tr>
     <tr>
    <tr>
       <td><input type="submit" value="Register Details"/></td> 
       <td><input type="reset" value="Cancel "/></td> 
            
     </table>
    
</form:form>
</body>
</html>