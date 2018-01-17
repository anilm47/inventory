<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

</head>
<body>
<h2>Add New Employee</h2>


 
  <form:form id="employeeRegisterForm"  modelAttribute="item" method="post" action="addItem">
   <table>
      <tr><td>Name </td><td><form:input  path="name" id="name"/></td></tr>
      <tr><td>Cost Price </td><td><form:input  path="costPrice" id="costPrice" /></td></tr>
      <tr><td>Sell Price </td><td><form:input  path="sellPrice" id="sellPrice"/></td></tr>
      <%-- <tr><td>Quantity </td><td><form:input  path="quantity" id="quantity"/></td></tr> --%>
      
   </table>
    <input type="submit" id="bt1"  value="click"/>
   
  </form:form>
   <a id="link1" href="back">Home</a>
 
 
</body>
</html>