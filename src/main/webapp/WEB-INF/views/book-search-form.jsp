<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Book</title>
</head>
<body>

<a href="showbooks">Take me back to the home page!</a>
<div align="center">

		<h2>Book Search Form</h2>
		<br>
		<hr>

		<form:form action="processBookForm" method="post" modelAttribute="books">

			

			<label for="name">Book Title</label>
			<form:input type="text" path="title" />
			<br>
			<br>
			
			

			<input type="submit" value="submit" />

		</form:form>
		<hr>

	</div>
</body>
</html>