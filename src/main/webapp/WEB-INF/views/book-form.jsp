<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Input Form</title>
</head>
<body>

<a href="showbooks">Take me back to the home page!</a>
<div align="center">

		<h2>Student Input Form</h2>
		<br>
		<hr>

		<form:form action="processForm" method="post" modelAttribute="books">

			<label for="id">Book ID</label>
			<form:input type="number" path="id" />
			<br>
			<br>

			<label for="name">Book Title</label>
			<form:input type="text" path="title" />
			<br>
			<br>
			
			<label for="author">Book Author</label>
			<form:input type="text" path="author" />
			<br>
			<br>
			
			
			<label for="price">Book Price</label>
			<form:input type="number" path="price" />
			<br>
			<br>
			
			
			
			<label for="qty">Book Quantity</label>
			<form:input type="number" path="qty" />
			<br>
			<br>
			
			

			<input type="submit" value="submit" />

		</form:form>
		<hr>

	</div>
</body>
</html>