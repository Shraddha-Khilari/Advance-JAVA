<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Reviews</title>
</head>
<body>
	<h3>${title}</h3>
	Hello, ${curUser.firstName} <hr/>
	<a href="/allreviews">All Reviews</a>
	<a href="/myreviews">My Reviews</a>
	<a href="/sharedreviews">Shared Reviews</a>
	<a href="/newreview">New Review</a>
	<hr/>
	<table border="1">
		<thead>
			<tr>
				<th>Id</th>
				<th>Review</th>
				<th>Rating</th>
				<th>Modified</th>>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="r" items="${reviewList}">
				<tr>
					<td>${r.id}</td>
					<td>${r.review}</td>
					<td>${r.rating}</td>
					<td>${r.modified}</td>
					<td>
						<a href="/delreview?id=${r.id}">Delete</a>
						<img height="24" width="24" src="deleteIcon.jpg" alter=Delete>
						
						<a href="/editreview?id=${r.id}">Edit</a>
				        <img height="24" width="24" src="editIcon.jpg" alter=Edit>
						
						<a href="/sharereview?id=${r.id}">share</a>
				        <img height="24" width="24" src="share.jpeg" alter=Edit>
					</td>
				</tr>			
			</c:forEach>
		</tbody>
	</table>
</body>
</html>




