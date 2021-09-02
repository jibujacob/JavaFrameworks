<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration Page</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
		First Name <form:input path="firstName"/>
		<br><br>
		Last Name <form:input path="lastName"/>
		<br><br>
		Country
		<form:select path="country">
			<form:options items="${student.countryOptions}"/>
		</form:select>
		<br><br>
		Favorite Language:
		Java<form:radiobutton path="favouriteLanguage" value="Java"/>
		C#<form:radiobutton path="favouriteLanguage" value="C"/>
		PHP<form:radiobutton path="favouriteLanguage" value="PHP"/>
		Ruby<form:radiobutton path="favouriteLanguage" value="Ruby"/>
		<br><br>
		Operating Systems:
		Linux<form:checkbox path="operatingSystem" value="Linux"/>
		Mac OS<form:checkbox path="operatingSystem" value="Mac OS"/>
		MS Windows<form:checkbox path="operatingSystem" value="MS Windows"/>
		<br><br>
		<input type="submit" value="submit"/>
	</form:form>
</body>
</html>