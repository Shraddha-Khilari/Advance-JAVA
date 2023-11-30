<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update here</title>
</head>
<body>
<center>
<form method="post" action="/updatereview">
        ID:<input type="text" name="id" value="${review.id}"readonly/><br><br>
        UserID: <input type="text" name="id" value="${review.userId}"/><br><br>
        Review: <input type="text" name="review" value="${review.review}"/> <br/><br/>
         Movie:  <input type="text" name="movieId" value="${review.movieId}"/> <br/><br/>
        Rating: <input type="text" name="rating" value="${review.rating}"/> <br/><br/>
        
                <input type="submit" value="Update"/>
</form>
</center>
</body>
</html>