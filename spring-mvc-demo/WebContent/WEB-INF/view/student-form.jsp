<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>

<html>

<head>
	<title>Student Registration Form</title>
</head>

<body>

	<!--  Spring will call the getter methods Student class when the form is loaded
			and the setter methods when the form is submitted-->


	<form:form action="processForm" modelAttribute ="student">
		First Name: <form:input path="firstName"/>
		<br><br>
		
		Last Name: <form:input path="LastName"/>
		<br><br>
		
		Country:
		<form:select path="country">
		
			<form:option value="Ethiopia" label="Ethiopia"/>
			<form:option value="Brazil" label="Brazil"/>
			<form:option value="France" label="France"/>
		</form:select>
		
		<input type="submit" value="Submit"/>
		
	</form:form>






</body>


</html>