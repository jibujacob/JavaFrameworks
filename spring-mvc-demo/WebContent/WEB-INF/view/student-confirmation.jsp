<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Confirmation Page</title>
</head>
<body>
	The student from ${student.country} is confirmed : ${student.firstName} ${student.lastName}
	<br><br>
	Favourite Language: ${student.favouriteLanguage}
	<br><br>
	Operating Systems:
	<ul>
		<c:forEach var="temp" items="${student.operatingSystem}">
			<li>${temp}</li>
		</c:forEach>
	</ul>
	
</body>
</html>