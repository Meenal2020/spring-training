
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<title>User Signup</title>
<style>
.error {
	color: red
}
</style>
<body>
	<form:form action="saveUser" modelAttribute="usr">  
First Name: <form:input path="firstname" />
		<form:errors path="firstname" cssClass="error" />
		<br>
		<br>
Last Name: <form:input path="lastname" />
		<form:errors path="lastname" cssClass="error" />
		<br>
		<br>
Age: <form:input path="age" />
		<form:errors path="age" cssClass="error" />
		<br>
		<br>   
Phone: <form:input path="phone" />
		<form:errors path="phone" cssClass="error" />
		<br>
		<br>
		<input type="submit" value="submit">
	</form:form>
</body>
</html>