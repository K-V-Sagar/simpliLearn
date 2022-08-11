<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	
	<h1>Operation Complete!</h1>
	<h3>( Printing from the ArrayList "mtList" )</h3>
	<table>
		<tr>
			<th>Teacher ID</th>
			<th>Teacher Name</th> 
		</tr>
		<c:forEach var="teach" items="${Teachers_List}" >
		<tr>
			<td>${teach.teacherID}</td>
			<td>${teach.teacherName}</td>
		</tr>
		</c:forEach>
	</table>
	
</body>
</html>