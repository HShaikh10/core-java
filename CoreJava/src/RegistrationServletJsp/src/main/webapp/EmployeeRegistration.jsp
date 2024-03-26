<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Employee Registration Form</title>
<style>
.container {
	border: 2px solid #ccc;
	padding: 20px;
	width: 600px;
	margin: 0 auto;
	display: flex;
	flex-direction: column;
	align-items: center;
}

.form-group {
	margin-bottom: 15px;
	display: flex;
	flex-direction: row;
	align-items: center;
}

.form-group label {
	flex: 1;
}

.form-group input {
	flex: 2;
	margin-left: 10px;
}

.error {
	color: red;
}

.button-group {
	display: flex;
	justify-content: center;
}

.button-group input {
	margin: 0 25px;
}
</style>
<script>
	function validateForm() {
		var firstName = document.getElementById("firstName").value;
		var lastName = document.getElementById("lastName").value;
		var password = document.getElementById("password").value;
		var contact = document.getElementById("contact").value;

		// Validation for first name and last name (not containing numbers)
		if (/\d/.test(firstName) || /\d/.test(lastName)) {
			alert("First name and last name cannot contain numbers.");
			return false;
		}

		// Validation for password (at least 8 characters with at least 2 numbers)
		if (password.length < 8 || (password.replace(/[^0-9]/g, "").length < 2)) {
			alert("Password must be at least 8 characters long and contain at least 2 numbers.");
			return false;
		}

		// Validation for contact number (exactly 10 digits)
		if (!(/^\d{10}$/.test(contact))) {
			alert("Contact number must contain exactly 10 digits.");
			return false;
		}

		// No need to disable submit button
		return true;
	}
</script>
</head>
<body>
	<div class="container">
		<h1>Employee Registration Form</h1>
		<form action="/EmployeeServlet" method="post" onsubmit="return validateForm()">

			<div class="form-group">
				<label for="firstName">First Name:</label> <input type="text"
					id="firstName" name="firstName" required /> <span
					id="firstNameError" class="error"></span>
			</div>
			<div class="form-group">
				<label for="lastName">Last Name:</label> <input type="text"
					id="lastName" name="lastName" required /> <span id="lastNameError"
					class="error"></span>
			</div>
			<div class="form-group">
				<label for="username">Username:</label> <input type="text"
					id="username" name="username" />
			</div>
			<div class="form-group">
				<label for="password">Password:</label> <input type="password"
					id="password" name="password" required />
			</div>
			<div class="form-group">
				<label for="address">Address:</label> <input type="text"
					id="address" name="address" />
			</div>
			<div class="form-group">
				<label for="contact">Contact No:</label> <input type="text"
					id="contact" name="contact" required />
			</div>
			<div class="button-group">
				<input type="submit" id="submitBtn" value="Submit"> <input
					type="reset" value="Reset">
			</div>
		</form>
	</div>
</body>
</html>
