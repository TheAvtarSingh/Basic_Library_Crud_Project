<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Searched Books</title>
</head>
	<div align="center">
	
	
	<a href = "showBookForm" >Click Here To Insert New Book</a>
	
	<a href = "showbooks" >Click Here To See All Books</a>
	
	<table border=1>
		<thead>
			<tr>
				<td>Book Id</td>
				<td>Book Name</td>
				<td>Book Author</td>
				<td>Book Price</td>
				<td>Book Quantity</td>
			</tr>
		</thead>

		
		<c:forEach var="books" items="${books}">
			<%-- ${books} <br> --%>
			<tr>
				<td>${books.id }</td>
				<td>${books.title }</td>
				<td>${books.author }</td>
						<td>${books.price }</td>
				<td>${books.qty }</td>
				<td>
				<a href = "updateForm?id=${books.id}" >Edit</a>
				<a href = "deletebooks?id=${books.id}" onclick = "if (!(confirm('Do you really want to delete this books record?'))) return false">Delete</a>
				</td>
			</tr>
		</c:forEach>

	</table> 
	</div>
</html>