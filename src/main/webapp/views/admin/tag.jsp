<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<title>AddTags</title>


<div class="container">
	<div class="col-lg-offset-3 col-lg-6" align="center">
		<div class="row">
		<h1>AddTags</h1>
			<div class="row">
				<form:form modelAttribute="tag" method="post" action="/tag">
					<form:input path="tagName"  type="text" class="form-control" placeholder="tagName"></form:input>
					<button type="submit">AddTag</button>
				</form:form>
				<%--<form action="/tag" method="post">--%>
					<%--<input type="text" name="tagName" class="form-control" placeholder="tagName">--%>
					 <%--<button type="submit" class="btn btn-primary">AddTags</button>--%>
				<%--</form>--%>
			</div>

	</div>
	<div class="col-lg-offset-3 col-lg-6" align="center">
		<h1>Colors:</h1>
		<div class="row">
			<table  class="table table-striped">
				<tr class="info">
					<td>TagName</td>
					<td>delet</td>
				<tr>
				<c:forEach var="tag" items="${tags}">
					<tr>
						<td>${tag.tagName}</td>
						<td><a href="/delettag/id=${tag.id}">delet</a></td>
					<tr>
				</c:forEach>
			</table>
		</div>
	</div>

	</div>
</div>
