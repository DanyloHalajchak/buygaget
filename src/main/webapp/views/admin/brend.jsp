
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<title>AddBrend</title>
<div class="container">
	<div class="col-lg-offset-3 col-lg-6" align="center">
		<div class="row">
		<h1>AddBrend</h1>
			<div class="row">
				<form:form modelAttribute="brend" method="post" action="/brend">
					<form:input path="nameBrend" type="text" class="form-control" placeholder="BrendName"></form:input>
					<button type="submit">AddCategory</button>
				</form:form>
				<%--<form action="/brend" method="post">--%>
					<%--<input type="text" name="brendName" class="form-control" placeholder="BrendName">--%>
					 <%--<button type="submit" class="btn btn-primary">AddBrend</button>--%>
				<%--</form>--%>


		<h1>Brends:</h1>

			<table  class="table table-striped">
				<tr class="info">
					<td>BrendName</td>
					<td>delet</td>
				<tr>
				<c:forEach var="brend" items="${brends}">
					<tr>
						<td>${brend.nameBrend}</td>
						<td><a href="/deletbrend/id=${brend.id}">delet</a></td>
					<tr>
				</c:forEach>
			</table>


</div>
	</div>
	</div>
</div>

