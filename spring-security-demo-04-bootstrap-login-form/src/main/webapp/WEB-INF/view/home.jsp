<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>  

<html>

<head>
	<title>JJ Company Home Page</title>
</head>

<body>
	<h2>JJ Company Home Page-Test</h2>
	<hr>
	<p>
		<sec:authentication property="principal.username" /> 
		:
		<sec:authentication property="principal.authorities" /> 
	</p>
	<hr>
	
	Welcome to the JJ company home page!
	
	<sec:authorize access="hasRole('MANAGER')">
		<br><br>
		<p><a href="${pageContext.request.contextPath}/leaders">Managers Meeting</a></p>
	</sec:authorize>
	
	<sec:authorize access="hasRole('ADMINISTRATOR')">
		<br><br>
		<p><a href="${pageContext.request.contextPath}/systems">Admin Page</a></p>
	</sec:authorize>

	
	
	<form:form action="${pageContext.request.contextPath}/logout" method="POST">
		<input type="submit" value="Logout">
	</form:form>

</body>

</html>