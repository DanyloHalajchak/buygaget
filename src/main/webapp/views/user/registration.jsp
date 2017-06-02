<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>



	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>fff</title>


	<div class="content">
		<div class="container">
			<div class="row">




				<form:form modelAttribute="user" action="/registration" method="post" id="signup">
				<h1>Sign Up</h1>




					<%--<input type="text" id="name" name="user_name">--%>

					<%--<label for="mail">Email:</label>--%>
					<%--<input type="email" id="mail" name="user_email">--%>

					<%--<label for="password">Password:</label>--%>
					<%--<input type="password" id="password" name="user_password">--%>
				<legend><span class="number">1</span>Your basic info</legend>
					<span style="color: white; font-size: 22px;background-color: #cf5f5fb3;">${NameExeption.toLowerCase()}</span>
				<label for="name">Name:</label>
				<form:input   id="name" path="name" type="text" placeholder="name"></form:input>
					<span style="color: white; font-size: 22px;background-color: #cf5f5fb3;">${SeNameExeption.toLowerCase()}</span>

				<label for="seName">seName:</label>
				<form:input path="seName" type="text" placeholder="seName" id="seName"></form:input>
					<span style="color: white; font-size: 22px;background-color: #cf5f5fb3;">${AgeExeption.toLowerCase()}</span>
				<label for="age">age:</label>
				<form:input path="age" type="text" placeholder="age" id="age"></form:input>
					<span style="color: white; font-size: 22px;background-color: #cf5f5fb3;">${LoginExeption.toLowerCase()}</span>
				<label for="login">login:</label>
				<form:input path="login" type="text" placeholder="login" id="login"></form:input>
					<span style="color: white; font-size: 22px;background-color: #cf5f5fb3;">${EmailExeption.toLowerCase()}</span>
				<label for="email">email:</label>
				<form:input path="email" type="text" placeholder="e-mail" id="email"  ></form:input>
					<span style="color: white; font-size: 22px;background-color: #cf5f5fb3;">${PsswordExeption.toLowerCase()}</span>
				<label for="password">password:</label>
				<form:input path="password" type="password" placeholder="Password" id="password"></form:input>





				<button type="submit">Sign Up</button>

			</div>

			</form:form>






		</div>



	<%--<div>--%>
		<%--<form action="/registration" method="post">--%>
			<%--<input type="text" name="username">--%>
			<%--<br>--%>
			<%--<input type="email" name="email">--%>
			<%--<br>--%>
			<%--<input type="password" name="password">--%>
			<%--<br>--%>
			<%--<button>Registration</button>--%>
		<%--</form>--%>
	<%----%>
	<%--</div>--%>


<div>

</div>
	</div>
