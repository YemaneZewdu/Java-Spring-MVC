<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>Customer Confirmation</title>
</head>

<body>

<h2>Welcome!!</h2>

Customer: ${customer.firstName} is registered successfully <br><br>
Customer's age:  ${customer.age} <br><br>
Postal Code: ${customer.postalCode} <br><br>
Course code:  ${customer.courseCode}
</body>

</html>