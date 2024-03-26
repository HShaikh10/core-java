<!DOCTYPE	html>
<html	lang="en">
<head>
	<meta	charset="UTF-8">
	<meta	name="viewport"	content="width=device-width,	initial-scale=1.0">
		<title>Registration	Form</title>
		<style>
		form	{
				width:	300px;
				margin:	0	auto;
				padding:	40px;
				text-align:	left;
				border:	5px	solid	#ccc;
				border-radius:	5px;
				}
		.button-group	{
				display:	flex;
				justify-content:	center;
		}
		input[type="text"],
		input[type="password"]	{
				width:	90%;
				padding:	10px;
				margin-bottom:	10px;
			}
		.errorMessage	{
				color:	red;
				font-size:	12px;
			}
		</style>
		<script>
				function	validateForm()	{
				var	firstName	=	document.getElementById("firstName").value;
				var	lastName	=	document.getElementById("lastName").value;
				var	password	=	document.getElementById("password").value;
				var	address	=	document.getElementById("address").value;
				var	contact	=	document.getElementById("contact").value;
				var	username	=	document.getElementById("username").value;
				var	firstNameError	=	document.getElementById("firstNameError");
				var	lastNameError	=	document.getElementById("lastNameError");
				var	passwordError	=	document.getElementById("passwordError");
				var	addressError	=	document.getElementById("addressError");
				var	contactError	=	document.getElementById("contactError");
				var	usernameError	=	document.getElementById("usernameError");
				firstNameError.innerText	=	"";
				lastNameError.innerText	=	"";
				passwordError.innerText	=	"";
				addressError.innerText	=	"";
				contactError.innerText	=	"";
				usernameError.innerText	=	"";
				var	isValid=	true;
				if	(firstName.trim()	=== "")	{
				firstNameError.innerText	=	"	";
				isValid	= false;
				}	else	if	(/\d/.test(firstName))	{
				firstNameError.innerText	=	"First	name	cannot	contain	numbers";
				isValid	=	false;
				}
				if	(lastName.trim()	===	"")	{
				lastNameError.innerText	=	"	";
				isValid	=	false;
				}	else	if	(/\d/.test(lastName))	{
				lastNameError.innerText =	"Last	name	cannot	contain	numbers";
				isValid	=	false;
				}
				if	(username.trim()	===	"")	{
				usernameError.innerText	=	"	";
				isValid	=	false;
				}
				if	(password.trim()	===	"")	{
				passwordError.innerText	=	"	";
				isValid	=	false;
				}	else	if	(password.length	<	8	||	password.length	>	15	||	(password.replace(/[^0-9]/g,	"").length	<	2)){
				passwordError.innerText	=	"Password	must	be	between	8	and	15	characters	long	and	contain	at	least	2	numbers";
				isValid	=	false;
				}
				if	(address.trim()	===""){
				addressError.innerText	=	"	";
				isValid	=	false;
				}	else	if	(!/^[a-zA-Z0-9\s]*$/.test(address))	{
				addressError.innerText	=	"Address	must	contain	only	alphanumeric	characters";
				isValid	= false;
				}
				if	(contact.trim()	===	"")	{
				contactError.innerText	=	"	";
				isValid	=	false;
				}	else	if	(!(/^\d{10}$/.test(contact)))	{
				contactError.innerText	=	"Contact	number	must	contain	exactly	10	digits";
				isValid	=	false;
				}
				document.getElementById("submitBtn").disabled	=	!isValid;
				var	anyFieldHasData	=	firstName.trim()	!==	""	||	lastName.trim()	!==	""	||	password.trim()	!==	""	||	address.trim()	!==	""	||	contact.trim()	!==	""||	username.trim()	!==	"";
				document.getElementById("resetBtn").disabled	=	!anyFieldHasData;
				return isValid;
				}
				window.onload	=	function()	{
				document.getElementById("submitBtn").disabled	=	true;
				document.getElementById("firstName").addEventListener("input",	validateForm);
				document.getElementById("lastName").addEventListener("input",	validateForm);
				document.getElementById("password").addEventListener("input",	validateForm);
				document.getElementById("address").addEventListener("input",	validateForm);
				document.getElementById("contact").addEventListener("input",	validateForm);
				document.getElementById("username").addEventListener("input",	validateForm);
				document.getElementById("resetBtn").addEventListener("click",	function() {
				document.getElementById("firstName").value	=	"";
				document.getElementById("lastName").value	=	"";
				document.getElementById("password").value	=	"";
				document.getElementById("address").value	=	"";
				document.getElementById("contact").value	=	"";
				document.getElementById("username").value	=	"";
				validateForm();
				});
				};
		</script>
</head>
	<body>
		<h1	style="text-align:	center;">Employee	Registration	Form</h1>
			<form	id="registrationForm"	action="Register"	method="post"	onsubmit="return	validateForm()">
				<label	for="firstName">First	Name:</label>
				<input	type="text"	id="firstName"	name="firstName"	required>
				<p	id="firstNameError"	class="errorMessage"></p>
				<label	for="lastName">Last	Name:</label>
				<input	type="text"	id="lastName"	name="lastName"	required>
				<p	id="lastNameError"	class="errorMessage"></p>
				<label	for="username">Username:</label>
				<input	type="text"	id="username"	name="username"	required>
				<p	id="usernameError"	class="errorMessage"></p>
				<label	for="password">Password:</label>
				<input	type="password"	id="password"	name="password"	required>
				<p	id="passwordError"	class="errorMessage"></p>
				<label	for="address">Address:</label>
				<input	type="text"	id="address"	name="address"	required>
				<p	id="addressError"	class="errorMessage"></p>
				<label	for="contact">Contact:</label>
				<input	type="text"	id="contact"	name="contact"	required>
				<p	id="contactError"	class="errorMessage"></p>
				<div	class="button-group">
				<input	type="submit"	id="submitBtn"	value="Submit">
				<input	type="reset"	id="resetBtn"	value="Reset">
				</div>
			</form>		
	</body>
</html>