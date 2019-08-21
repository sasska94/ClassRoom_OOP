  <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
<h1>Employees List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>Name</th><th>Surname</th><th>Address</th><th>JMBG</th><th>Phone number</th></tr>  
   <c:forEach var="student" items="${list}">   
   <tr>  
   <td>${student.id}</td>  
   <td>${student.name}</td>  
   <td>${student.surname}</td>  
   <td>${student.address}</td>  
   <td>${student.jmbg}</td>  
   <td>${student.phone_number}</td>  
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   <a href="newStudent">Add New Student</a>  