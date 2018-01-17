<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@page import="java.util.ArrayList"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Update  Item </h2>
 
  <form:form id="employeeUpdationForm"  modelAttribute="item" method="post" action="saveUpdatedItem">
   <table>
      <tr><td>Name </td><td><form:input  path="name" id="name"/>
      <form:hidden  path="PId" id="id"/></td>
      </tr>
      <tr><td>Cost Price </td><td><form:input  path="costPrice" id="costPrice" /></td></tr>
      <tr><td>Sell Price </td><td><form:input  path="sellPrice" id="sellPrice"/></td></tr>
   </table>
    <input type="submit" id="bt1"  value="click"/>
 
  </form:form>
 
 
 
 
 
<a href="back">Home</a>
</body>
</html>