<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@page import="java.util.ArrayList"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<script type="text/javascript" src="tableExport.js"></script>
<script type="text/javascript" src="jquery.base64.js"></script>
<script type="text/javascript" src="jspdf/libs/sprintf.js"></script>
<script type="text/javascript" src="jspdf/jspdf.js"></script>
<script type="text/javascript" src="jspdf/libs/base64.js"></script>
<title>Insert title here</title>
</head>
<body>

<center><h2>View All Item Using Spring and Hibernate</h2></center>
<div id="PDFcontent">
<center>
<table border="1" >
 <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Cost Price</th>
        <th>Sell Price</th>
        <th>Delete</th>
    </tr>
  <c:forEach items="${item}" var="i">
    <tr>
      <td><c:out value="${i.PId}"/></td>
      <td><a href="getItemForUpdate?id=${i.PId}"><c:out value="${i.name}" /></a></td>
      <td><c:out value="${i.costPrice}" /></td>
      <td><c:out value="${i.sellPrice}" /></td>
      <td><a href="deleteItem?id=${i.PId}"><c:out value="${i.name}" /></a></td>
    </tr>
  </c:forEach>
</table>
</center>
</div>
<br>
<div id=editor>
<a href="back">Back</a>
</div>

<script type="text/javascript">



</script>
</body>
</html>