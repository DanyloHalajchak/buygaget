<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@  taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AddColor</title>


<div class="container">
	<div class="col-lg-offset-3 col-lg-6" align="center">
		<div class="row">
		<h1>AddColor</h1>

				<form:form modelAttribute="color" action="/color" method="post">
					<form:input path="clorName" class="form-control" placeholder="colorName"/>
					<button type="submit">AddColor</button>
				</form:form>
				<%--<form action="/color" method="post">--%>
					<%--<input type="text" name="clorName" class="form-control" placeholder="colorName">--%>
					 <%--<button type="submit" class="btn btn-primary">AddColor</button>--%>
				<%--</form>--%>
			</div>
		</div>

	<div class="col-lg-offset-3 col-lg-6" align="center">
		<h1>Colors:</h1>
		<div class="row">
			<table  class="table table-striped">
				<tr class="info">
					<td>ColorName</td>
					<td>delet</td>
				<tr>
				<c:forEach var="color" items="${colors}">
					<tr>
						<td>${color.clorName}</td>
						<td><a href="/deletcolor/id=${color.id}">delet</a></td>
					<tr>
				</c:forEach>
			</table>
		</div>

	</div>
</div>
