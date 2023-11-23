<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SignUp</title>
</head>
<body>
 <jsp:useBean id="rb" class="com.sunbeam.beans.RegisterBean"/>
 <jsp:setProperty name="rb" property="*"/>
            ${rb.registerUser() }
 User Registered:${rb.count}
  </br><br/>
 <a href="index.jsp"> Sign in </a>
</body>
</html>