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
	<h2>The following entry is made...</h2>
	<h3>( Printing from the ArrayList "mcList" )</h3>
	<table>
		<tr>
			<th>Subject ID</th>
			<th>Subject Name</th> 
		</tr>
		<c:forEach var="subj" items="${Subjects_List}" >
		<tr>
			<td>${subj.subjectID}</td>
			<td>${subj.subjectName}</td>
		</tr>
		</c:forEach>
	</table>
	
</body>
</html>