<%@ page contentType="text/html; charset=ISO-8859-1" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>

	<head>
		<title>List of books</title>
	</head>
	
	<body>
		
		<a href="/add"> Click to add new book </a>
		
		<h1> List of books </h1>
		
		<c:forEach items="${data}" var="temp">
			<p>
				${temp.getAuthor()}
				<br>
				${temp.getName()}
				<br>
				<a href="delete?id=${temp.getId()}"> Delete book  </a>
			</p>
		</c:forEach>
	
	</body>

</html>