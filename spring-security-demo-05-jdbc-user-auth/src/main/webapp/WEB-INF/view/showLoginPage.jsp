<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>JJ Login Form</title>
</head>
<style>
	.failed{
	color:red;}	
</style>
<body>

	<h3> My Custom Login Page</h3>
	
	<form:form action="${pageContext.request.contextPath}/authenticateTheUser" method="POST">
	
		<c:if test="${param.error != null }">
			<i class=failed>Sorry! You have entered invalid username/password</i>
		</c:if>
		<p>User Name:<input type="text" name="username" /></p>
		<p>Password:<input type="password" name="password" /></p>
		<br>
		<input type="submit" value="Login" />
	
	</form:form>
</body>
</html>