<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>Student Confirmation</title>
</head>

<body>

The student ${student.firstName}  ${student.lastName} from ${student.country} is confirmed for the class
<br><br>
Favorite Language is ${student.favoriteLanguage}
<br><br>
Operating Systems:
<ul>
	<!-- looping through the array in the model class -->
	<c:forEach var="temp" items="${student.operatingSystems}">
	
		<li> ${temp}</li>
	
	</c:forEach>
</ul>
</body>

</html>