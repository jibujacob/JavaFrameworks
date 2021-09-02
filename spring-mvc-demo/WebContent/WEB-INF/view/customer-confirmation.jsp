<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Confirmation Page</title>
</head>
<body>
	The customer is confirmed : ${customer.firstName} ${customer.lastName}
	<br><br>
	Number of freepasses : ${customer.freePasses}
	<br><br>
	Postal Code : ${customer.postalCode}
	<br><br>
	Course Code : ${customer.courseCode }
</body>
</html>